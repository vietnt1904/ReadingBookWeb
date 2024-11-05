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

create table Users(
	UserID int IDENTITY(1,1),
	UserName nvarchar(200) not null,
	Age int,
	RoleID int,
	Address nvarchar(500),
	Birthday datetime,
	Email varchar(100) unique, -------+++++++++++++++++
	PhoneNumber varchar(20) unique, -------+++++++++++++++++
	Image varchar(max),
	Description nvarchar(4000),
	primary key (UserID),
	constraint UR_FK foreign key (RoleID) references Roles(RoleID)
)

create table Authors(
	AuthorID int IDENTITY(1,1),
	AuthorName nvarchar(200),
	BirthYear int,
	Image varchar(max),
	Description nvarchar(4000),
	Create_At datetime default(getdate()),
	primary key (AuthorID)
)

create table Categories(
	CategoryID int IDENTITY(1,1),
	CategoryName nvarchar(200),
	Description nvarchar(4000),
	Image varchar(max),
	Create_At datetime default(getdate()),
	primary key (CategoryID)
)

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