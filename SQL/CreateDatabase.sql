create database ReadingBookWeb
go
use ReadingBookWeb
go

create table Roles(
	RoleID int IDENTITY(1,1),
	RoleName nvarchar(50),
	Description nvarchar(4000),
	Create_At datetime default(getdate()),
	primary key (RoleID)
)
go
create table Users(
	UserID int IDENTITY(1,1),
	UserName nvarchar(200) not null,
	Password nvarchar(200) not null,
	FullName nvarchar(200),
	Age int,
	RoleID int,
	Address nvarchar(500),
	Birthday datetime,
	Email varchar(100), -------+++++++++++++++++
	PhoneNumber varchar(20) unique, -------+++++++++++++++++
	Image varchar(max),
	Description nvarchar(4000),
	Create_At datetime default(getdate())
	primary key (UserID),
	constraint UR_FK foreign key (RoleID) references Roles(RoleID)
)
go
create table Authors(
	AuthorID int IDENTITY(1,1),
	AuthorName nvarchar(200),
	BirthYear int,
	Image varchar(max),
	Description nvarchar(4000),
	Create_At datetime default(getdate()),
	primary key (AuthorID)
)
go
create table Categories(
	CategoryID int IDENTITY(1,1),
	CategoryName nvarchar(200),
	Description nvarchar(4000),
	Create_At datetime default(getdate()),
	primary key (CategoryID)
)
go
create table Publishers(
	PublisherID int IDENTITY(1,1),
	PublisherName nvarchar(200),
	Address nvarchar(300),
	Email varchar(100) unique, -------+++++++++++++++++
	EstablishYear int,
	Description nvarchar(4000),
	Image varchar(max),
	Create_At datetime default(getdate()),
	primary key (PublisherID)
)
go
create table Bookshelves(
	BookshelfID int IDENTITY(1,1),
	UserID int not null unique, -------+++++++++++++++++
	TotalBook int default(0),
	ReadBook int default(0),
	ReadingBook int default(0),
	UnreadBook int default(0),
	Image varchar(max),
	Description nvarchar(4000),
	Create_At datetime default(getdate()),
	primary key (BookshelfID),
	constraint BU_FK foreign key (UserID) references Users(UserID)
)
go
create table Books(
	BookID int IDENTITY(1,1),
	AuthorID int not null,
	PublisherID int not null,
	BookName nvarchar(200),
	OtherName nvarchar(1000),
	PublicationYear int,
	Price int,
	Image varchar(max),
	Page int,
	Description nvarchar(4000),
	Create_At datetime default(getdate()),
	primary key (BookID),
	constraint BA_FK foreign key (AuthorID) references Authors(AuthorID),
	constraint BP_FK foreign key (PublisherID) references Publishers(PublisherID),
	constraint B_UNI unique (AuthorID, PublisherID, BookName, PublicationYear, Price, Page)
)
go
create table BookCates(
	ItemID int IDENTITY(1,1),
	CategoryID int,
	BookID int,
	Tag nvarchar(400),
	primary key (ItemID),
	constraint BCC_FK foreign key (CategoryID) references Categories(CategoryID),
	constraint BCB_FK foreign key (BookID) references Books(BookID)
)
go
create table ShelfItems(
	ItemID int IDENTITY(1,1),
	BookshelfID int not  null,
	BookID int not null,
	Status nvarchar(50) default(N'Chưa đọc'),
	-- Status = [N'Chưa đọc', N'Đang đọc', N'Đã đọc', N'Đọc lại']
	ReadCount int default(0),
	StartedDate datetime default(getdate()),
	FinishedDate datetime,
	Review nvarchar(4000),
	Create_At datetime default(getdate()),
	primary key (ItemID),
	constraint SIBS_FK foreign key (BookshelfID) references Bookshelves(BookshelfID),
	constraint SIB_FK foreign key (BookID) references Books(BookID)
)
go
create table Reviews(
	ReviewID int IDENTITY(1,1),
	UserID int,
	BookID int,
	Create_At datetime default(getdate()),
	FixDate datetime default(getdate()),
	ReadCount int,
	Description nvarchar(4000),
	primary key (ReviewID),
	constraint RU_FK foreign key (UserID) references Users(UserID),
	constraint RB_FK foreign key (BookID) references Books(BookID)
)
go
--select * from Books b
--join ShelfItems s on b.BookID = s.BookID
--join Bookshelves bs on bs.BookshelfID =s.BookshelfID
--where bs.UserID = 1

--insert into Reviews(UserID, BookID, FixDate, ReadCount, Description) values 
--(1,1,getdate(), 1),

--SELECT b.*
--FROM Books b
--INNER JOIN BookCates bc ON b.BookID = bc.BookID
--INNER JOIN (SELECT CategoryID FROM BookCates WHERE BookID = 1) AS Temp
--    ON bc.CategoryID = Temp.CategoryID;