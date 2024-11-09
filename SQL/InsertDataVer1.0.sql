use ReadingBookWeb
go
INSERT INTO Roles (RoleName, Description)
VALUES 
('Admin', N'Quản trị viên hệ thống'),
('User', N'Người dùng bình thường');

go

INSERT INTO Users (UserName, Password, FullName, Age, RoleID, Address, Birthday, Email, PhoneNumber, Image, Description)
VALUES
('admin', N'admin', N'Nguyễn Thanh Việt', 20, 1, N'Nghệ An, Việt Nam', N'2004-09-01', N'vietnt@gmail.com', N'1234', NULL, N'Người dùng bình thường'),
('viet', N'viet', N'Nguyễn Thanh Việt', 20, 2, N'Nghệ An, Việt Nam', N'2004-09-01', N'admin@gmail.com', N'123', NULL, N'Người dùng bình thường');
go

INSERT INTO Authors (AuthorName, BirthYear, Image, Description)
VALUES
('J.K. Rowling', 1965, NULL, N'Tác giả nổi tiếng với series Harry Potter'),
('George Orwell', 1903, NULL, N'Tác giả của 1984 và Animal Farm'),
('J.R.R. Tolkien', 1892, NULL, N'Tác giả của series The Lord of the Rings'),
('Mark Twain', 1835, NULL, N'Tác giả nổi tiếng với sách "The Adventures of Tom Sawyer"'),
('Jane Austen', 1775, NULL, N'Tác giả của các tiểu thuyết nổi tiếng như "Pride and Prejudice"'),
('Ernest Hemingway', 1899, NULL, N'Tác giả của "The Old Man and the Sea"'),
('F. Scott Fitzgerald', 1896, NULL, N'Tác giả của "The Great Gatsby"'),
('Haruki Murakami', 1949, NULL, N'Tác giả người Nhật nổi tiếng với các tiểu thuyết huyền bí'),
('Agatha Christie', 1890, NULL, N'Nữ hoàng truyện trinh thám'),
('Charles Dickens', 1812, NULL, N'Tác giả nổi tiếng với các tác phẩm "Oliver Twist" và "A Christmas Carol"'),
('Victor Hugo', 1802, NULL, N'Tác giả của "Les Misérables"'),
('Leo Tolstoy', 1828, NULL, N'Tác giả của "War and Peace"'),
('William Shakespeare', 1564, NULL, N'Nhà soạn kịch nổi tiếng người Anh'),
('Harper Lee', 1926, NULL, N'Tác giả của "To Kill a Mockingbird"'),
('Dan Brown', 1964, NULL, N'Tác giả của "The Da Vinci Code"');
go

INSERT INTO Categories (CategoryName, Description, Image)
VALUES
('Fantasy', N'Thể loại giả tưởng', NULL),
('Science Fiction', N'Thể loại khoa học viễn tưởng', NULL),
('Mystery', N'Thể loại truyện trinh thám', NULL),
('Romance', N'Thể loại lãng mạn', NULL),
('Adventure', N'Thể loại phiêu lưu', NULL),
('Historical', N'Thể loại lịch sử', NULL),
('Thriller', N'Thể loại hồi hộp, kịch tính', NULL),
('Horror', N'Thể loại kinh dị', NULL),
('Biography', N'Thể loại tiểu sử', NULL),
('Poetry', N'Thể loại thơ', NULL),
('Self-Help', N'Thể loại sách tự giúp mình', NULL),
('Non-Fiction', N'Thể loại sách không hư cấu', NULL),
('Young Adult', N'Thể loại sách dành cho thanh thiếu niên', NULL),
('Children', N'Thể loại sách thiếu nhi', NULL),
('Cooking', N'Thể loại sách nấu ăn', NULL),
('Art', N'Thể loại sách nghệ thuật', NULL),
('Music', N'Thể loại sách âm nhạc', NULL),
('Philosophy', N'Thể loại triết học', NULL),
('Science', N'Thể loại sách khoa học', NULL);
go

INSERT INTO Publishers (PublisherName, Address, Email, EstablishYear, Description, Image)
VALUES
('Penguin Books', N'New York, USA', N'contact@penguin.com', 1935, N'Nhà xuất bản nổi tiếng', NULL),
('HarperCollins', N'London, UK', N'contact@harpercollins.com', 1989, N'Nhà xuất bản lớn', NULL),
('Random House', N'New York, USA', N'contact@randomhouse.com', 1927, N'Một trong những nhà xuất bản lớn nhất thế giới', NULL),
('Macmillan', N'London, UK', N'contact@macmillan.com', 1843, N'Nhà xuất bản học thuật và sách thiếu nhi', NULL),
('Simon & Schuster', N'New York, USA', N'contact@simonandschuster.com', 1924, N'Nhà xuất bản lớn với nhiều thể loại sách', NULL),
('Oxford University Press', N'Oxford, UK', N'contact@oup.com', 1586, N'Nhà xuất bản học thuật hàng đầu thế giới', NULL),
('Harlequin', N'Toronto, Canada', N'contact@harlequin.com', 1949, N'Nhà xuất bản chuyên về sách lãng mạn', NULL),
('Hachette Livre', N'Paris, France', N'contact@hachette.com', 1826, N'Nhà xuất bản lớn tại Pháp', NULL),
('Scholastic', N'New York, USA', N'contact@scholastic.com', 1920, N'Nhà xuất bản sách dành cho trẻ em', NULL),
('Bloomsbury Publishing', N'London, UK', N'contact@bloomsbury.com', 1986, N'Nhà xuất bản sách văn học', NULL),
('Penguin Random House', N'New York, USA', N'contact@penguinrandomhouse.com', 2013, N'Liên kết giữa Penguin Books và Random House', NULL),
('Cengage Learning', N'Boston, USA', N'contact@cengage.com', 2007, N'Nhà xuất bản chuyên về sách học thuật', NULL),
('Wiley', N'Hoboken, USA', N'contact@wiley.com', 1807, N'Nhà xuất bản sách chuyên ngành khoa học', NULL),
('Prentice Hall', N'New Jersey, USA', N'contact@prenticehall.com', 1913, N'Nhà xuất bản các sách giáo khoa', NULL),
('Routledge', N'London, UK', N'contact@routledge.com', 1836, N'Nhà xuất bản sách học thuật và nghiên cứu', NULL),
('Cambridge University Press', N'Cambridge, UK', N'contact@cambridge.org', 1534, N'Nhà xuất bản lâu đời chuyên về sách học thuật', NULL),
('Pearson Education', N'London, UK', N'contact@pearson.com', 1844, N'Nhà xuất bản chuyên về sách giáo dục', NULL),
('Macmillan Education', N'London, UK', N'contact@macmillaneducation.com', 1843, N'Nhà xuất bản sách học thuật và giáo dục', NULL),
('Thomson Reuters', N'Toronto, Canada', N'contact@thomsonreuters.com', 2008, N'Nhà xuất bản sách về luật và tài chính', NULL),
('Springer', N'Berlin, Germany', N'contact@springer.com', 1842, N'Nhà xuất bản chuyên về sách khoa học', NULL);
go

--

INSERT INTO Books (AuthorID, PublisherID, BookName, OtherName, PublicationYear, Price, Image, Page, Description)
VALUES
(1, 1, N'Harry Potter and the Sorcerer''s Stone', N'Harry Potter và viên đá phù thủy', 1997, 500000, NULL, 320, N'Một câu chuyện phép thuật nổi tiếng'),
(2, 2, N'1984', N'Chế độ toàn trị', 1949, 200000, NULL, 328, N'Một tác phẩm kinh điển của Orwell'),
(3, 3, N'The Hobbit', N'Cuộc phiêu lưu của Bilbo Baggins', 1937, 300000, NULL, 310, N'Một tác phẩm giả tưởng tuyệt vời của J.R.R. Tolkien'),
(4, 4, N'The Adventures of Tom Sawyer', N'Những cuộc phiêu lưu của Tom Sawyer', 1876, 150000, NULL, 320, N'Một câu chuyện về thiếu niên nổi loạn của Mark Twain'),
(5, 5, N'Pride and Prejudice', N'Kiêu hãnh và định kiến', 1813, 100000, NULL, 400, N'Một câu chuyện tình yêu cổ điển của Jane Austen'),
(6, 6, N'War and Peace', N'Chiến tranh và hòa bình', 1869, 600000, NULL, 1200, N'Tác phẩm vĩ đại của Lev Tolstoy'),
(7, 7, N'The Catcher in the Rye', N'Kẻ bắt lúa mạch', 1951, 250000, NULL, 277, N'Một cuốn tiểu thuyết nổi tiếng của J.D. Salinger'),
(8, 8, N'The Great Gatsby', N'Gatsby vĩ đại', 1925, 180000, NULL, 218, N'Một câu chuyện tình yêu và sự khao khát của F. Scott Fitzgerald'),
(9, 9, N'To Kill a Mockingbird', N'Giết con chim nhại', 1960, 250000, NULL, 281, N'Một tác phẩm văn học nổi tiếng của Harper Lee'),
(10, 10, N'The Old Man and the Sea', N'Ông lão và biển cả', 1952, 120000, NULL, 150, N'Một câu chuyện về sự đấu tranh và hy vọng của Ernest Hemingway'),
(11, 11, N'The Fault in Our Stars', N'Lỗi tại những vì sao', 2012, 220000, NULL, 313, N'Một câu chuyện tình yêu cảm động của John Green'),
(12, 12, N'The Diary of a Young Girl', N'Nhật ký của một cô gái trẻ', 1947, 200000, NULL, 350, N'Nhật ký của Anne Frank, cô gái Do Thái trong chiến tranh'),
(13, 13, N'The Hunger Games', N'Trò chơi sinh tử', 2008, 180000, NULL, 374, N'Cuộc chiến sinh tử trong tương lai của Suzanne Collins'),
(14, 14, N'The Shining', N'Ánh sáng', 1977, 160000, NULL, 447, N'Một tác phẩm kinh dị nổi tiếng của Stephen King'),
(1, 15, N'Dune', N'Hành tinh cát', 1965, 350000, NULL, 896, N'Cuốn sách khoa học viễn tưởng vĩ đại của Frank Herbert'),
(2, 16, N'Moby-Dick', N'Con cá voi trắng', 1851, 500000, NULL, 600, N'Một cuộc phiêu lưu khổng lồ của Herman Melville'),
(3, 17, N'Frankenstein', N'Frankenstein', 1818, 180000, NULL, 280, N'Một câu chuyện kinh dị của Mary Shelley'),
(4, 18, N'Dracula', N'Ma cà rồng Dracula', 1897, 220000, NULL, 420, N'Một tác phẩm kinh dị cổ điển của Bram Stoker'),
(5, 19, N'The Picture of Dorian Gray', N'Chân dung của Dorian Gray', 1890, 160000, NULL, 220, N'Một tiểu thuyết nổi tiếng của Oscar Wilde'),
(6, 20, N'The Road', N'Con đường', 2006, 180000, NULL, 287, N'Một tác phẩm post-apocalyptic của Cormac McCarthy');
go

INSERT INTO BookCates (CategoryID, BookID, Tag)
VALUES
(1, 1, N'Fantasy, Magic'),
(2, 2, N'Dystopia, Politics'),
(3, 3, N'Adventure, Fantasy'),
(4, 4, N'Adventure, Classic'),
(5, 5, N'Romance, Classic'),
(6, 6, N'Historical, War'),
(7, 7, N'Literature, Psychology'),
(8, 8, N'Classic, Literature'),
(9, 9, N'Social, Justice'),
(10, 10, N'Classic, Literature'),
(11, 11, N'Young Adult, Romance'),
(12, 12, N'Memoir, History'),
(13, 13, N'Dystopia, Action'),
(1, 14, N'Horror, Mystery'),
(2, 15, N'Science Fiction, Adventure'),
(3, 16, N'Classic, Adventure'),
(4, 17, N'Horror, Gothic'),
(5, 18, N'Horror, Classic'),
(6, 19, N'Philosophy, Literature'),
(7, 20, N'Apocalyptic, Drama');
go


