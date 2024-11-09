use ReadingBookWeb
go
INSERT INTO Roles (RoleName, Description)
VALUES 
('Admin', N'Quản trị viên hệ thống'),
('User', N'Người dùng bình thường');
go
INSERT INTO Users (UserName, Password, Age, RoleID, Address, Birthday, Email, PhoneNumber, Image, Description)
VALUES
('admin', N'password123', 30, 1, N'Hà Nội', N'1994-01-01', N'admin@example.com', N'0909123456', NULL, N'Quản trị viên hệ thống'),
('john_doe', N'password123', 25, 2, N'Hồ Chí Minh', N'1999-02-02', N'john.doe@example.com', N'0909345678', NULL, N'Người dùng bình thường'),
('jane_doe', N'password123', 28, 2, N'Đà Nẵng', N'1996-03-15', N'jane.doe@example.com', N'0909456789', NULL, N'Người dùng bình thường'),
('alice_smith', N'password123', 26, 2, N'Hà Nội', N'1998-04-10', N'alice.smith@example.com', N'0909123457', NULL, N'Người dùng bình thường'),
('bob_jones', N'password123', 35, 2, N'Hồ Chí Minh', N'1989-05-20', N'bob.jones@example.com', N'0909234567', NULL, N'Người dùng bình thường'),
('123', N'123', 27, 2, N'Hồ Chí Minh', N'1997-01-22', N'user20@example.com', N'123', NULL, N'Người dùng bình thường');
go
INSERT INTO Authors (AuthorName, BirthYear, Image, Description)
VALUES
('J.K. Rowling', 1965, NULL, N'Tác giả nổi tiếng với series Harry Potter'),
('George Orwell', 1903, NULL, N'Tác giả của 1984 và Animal Farm'),
('J.R.R. Tolkien', 1892, NULL, N'Tác giả của series The Lord of the Rings'),
('Mark Twain', 1835, NULL, N'Tác giả nổi tiếng với sách "The Adventures of Tom Sawyer"'),
('Jane Austen', 1775, NULL, N'Tác giả của các tiểu thuyết nổi tiếng như "Pride and Prejudice"'),
-- Chèn thêm 15 tác giả nữa
('Ernest Hemingway', 1899, NULL, N'Tác giả của "The Old Man and the Sea"'),
('F. Scott Fitzgerald', 1896, NULL, N'Tác giả của "The Great Gatsby"'),
('Haruki Murakami', 1949, NULL, N'Tác giả người Nhật nổi tiếng với các tiểu thuyết huyền bí'),
('Agatha Christie', 1890, NULL, N'Nữ hoàng truyện trinh thám'),
('Charles Dickens', 1812, NULL, N'Tác giả nổi tiếng với các tác phẩm "Oliver Twist" và "A Christmas Carol"'),
-- Tiếp tục đến 20 authors
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
INSERT INTO Bookshelves (UserID, TotalBook, ReadBook, ReadingBook, UnreadBook, Image, Description)
VALUES
(1, 50, 30, 10, 10, NULL, N'Kệ sách của admin, chứa các sách học thuật và văn học'),
(2, 40, 20, 10, 10, NULL, N'Kệ sách của người dùng John, chứa sách khoa học và tiểu thuyết'),
(3, 35, 15, 15, 5, NULL, N'Kệ sách của người dùng Jane, với nhiều sách tự giúp mình và văn học'),
(4, 45, 25, 15, 5, NULL, N'Kệ sách của Alice, chứa nhiều sách lãng mạn và phiêu lưu'),
(5, 60, 35, 15, 10, NULL, N'Kệ sách của Bob, chứa sách khoa học, tiểu thuyết và lịch sử'),
(6, 30, 10, 10, 10, NULL, N'Kệ sách của User 6, tập trung vào sách thiếu nhi');
go
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
INSERT INTO ShelfItems (BookshelfID, BookID, Status, ReadCount, StartedDate, FinishedDate, Review)
VALUES
(1, 1, N'Đã đọc', 5, N'2024-01-01', N'2024-01-10', N'Cuốn sách tuyệt vời với nhiều phép thuật và cuộc phiêu lưu'),
(1, 2, N'Đang đọc', 2, N'2024-02-01', NULL, NULL),
(2, 3, N'Chưa đọc', 0, N'2024-03-01', NULL, NULL),
(2, 4, N'Đã đọc', 3, N'2024-04-01', N'2024-04-15', N'Một cuốn sách về tình bạn đầy cảm hứng'),
(3, 5, N'Chưa đọc', 0, N'2024-05-01', NULL, NULL),
(3, 6, N'Đang đọc', 1, N'2024-06-01', NULL, NULL),
(4, 7, N'Đã đọc', 4, N'2024-07-01', N'2024-07-10', N'Một cuốn sách nhẹ nhàng nhưng đầy ý nghĩa'),
(4, 8, N'Chưa đọc', 0, N'2024-08-01', NULL, NULL),
(5, 9, N'Đang đọc', 2, N'2024-09-01', NULL, NULL),
(5, 10, N'Chưa đọc', 0, N'2024-10-01', NULL, NULL),
(6, 11, N'Đã đọc', 1, N'2024-11-01', N'2024-11-05', N'Cuốn sách này rất cảm động và sâu sắc'),
(6, 12, N'Đã đọc', 3, N'2024-12-01', N'2024-12-10', N'Một cuốn sách truyền cảm hứng mạnh mẽ về nghị lực sống'),
(1, 13, N'Chưa đọc', 0, N'2024-01-10', NULL, NULL),
(2, 14, N'Đang đọc', 2, N'2024-02-15', NULL, NULL),
(3, 15, N'Đã đọc', 4, N'2024-03-05', N'2024-03-15', N'Sự kết hợp giữa khoa học và giả tưởng thật tuyệt vời'),
(4, 16, N'Chưa đọc', 0, N'2024-04-01', NULL, NULL),
(5, 17, N'Đã đọc', 5, N'2024-05-01', N'2024-05-15', N'Tôi rất thích câu chuyện này, nó rất chân thực và xúc động'),
(6, 18, N'Đang đọc', 3, N'2024-06-01', NULL, NULL),
(1, 19, N'Chưa đọc', 0, N'2024-07-01', NULL, NULL),
(2, 20, N'Đã đọc', 2, N'2024-08-01', N'2024-08-10', N'Câu chuyện sau tận thế thật sự rất cuốn hút và kích thích tư duy');
go
INSERT INTO Reviews (UserID, BookID, ReadCount, Description)
VALUES
(1, 1, 5, N'Cuốn sách tuyệt vời với nhiều phép thuật và cuộc phiêu lưu, rất đáng đọc'),
(1, 2, 3, N'Chưa đọc xong nhưng rất hứng thú với những tình tiết đầu tiên'),
(2, 3, 0, N'Chưa đọc cuốn sách này, mong sẽ sớm bắt đầu'),
(2, 4, 4, N'Một cuốn sách về tình bạn đầy cảm hứng, tôi đã học được nhiều điều từ đó'),
(3, 5, 0, N'Chưa đọc cuốn này, nhưng nghe nói đây là một tác phẩm lãng mạn tuyệt vời'),
(3, 6, 2, N'Câu chuyện khá hay, đang trong quá trình đọc'),
(4, 7, 5, N'Một cuốn sách nhẹ nhàng nhưng đầy ý nghĩa, tôi thật sự cảm thấy bình yên khi đọc nó'),
(4, 8, 0, N'Chưa đọc cuốn này, nhưng rất tò mò về nội dung của nó'),
(5, 9, 3, N'Tôi rất thích cuốn này, các chi tiết rất ly kỳ và khiến tôi không thể rời mắt'),
(5, 10, 0, N'Chưa có ý kiến, đang định đọc cuốn này'),
(6, 11, 4, N'Cuốn sách này rất cảm động, tôi đã khóc trong suốt quá trình đọc'),
(6, 12, 3, N'Sách truyền cảm hứng mạnh mẽ về nghị lực sống, rất đáng để đọc một lần nữa'),
(1, 13, 0, N'Chưa đọc cuốn này, nhưng rất muốn biết câu chuyện bên trong'),
(2, 14, 2, N'Cảm giác ban đầu rất tốt, cuốn sách này thật sự khiến tôi tò mò'),
(3, 15, 5, N'Sự kết hợp giữa khoa học và giả tưởng thật tuyệt vời, một trong những cuốn sách yêu thích của tôi'),
(4, 16, 0, N'Chưa đọc, nhưng tôi nghe nói cuốn sách này rất hay'),
(5, 17, 3, N'Cuốn sách này rất chân thực và xúc động, tôi đã rơi nước mắt khi đọc'),
(6, 18, 2, N'Cảm nhận ban đầu là rất ổn, sẽ tiếp tục đọc trong thời gian tới'),
(1, 19, 0, N'Chưa đọc cuốn này, nhưng rất muốn tìm hiểu nội dung của nó'),
(2, 20, 4, N'Cuốn sách về hậu tận thế rất cuốn hút và kích thích tư duy, rất đáng đọc');
go