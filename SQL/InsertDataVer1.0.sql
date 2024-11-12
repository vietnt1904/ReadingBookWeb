use ReadingBookWeb
go
INSERT INTO Roles (RoleName, Description)
VALUES 
(N'Admin', N'Quản trị viên hệ thống'),
(N'User', N'Người dùng bình thường');
go

INSERT INTO Users (UserName, Password, FullName, Age, RoleID, Address, Birthday, Email, PhoneNumber, Image, Description)
VALUES
(N'admin', N'admin', N'Nguyễn Thanh Việt', 20, 1, N'Nghệ An, Việt Nam', N'2004-09-01', N'vietnt@gmail.com', N'1234', NULL, N'Người dùng bình thường'),
(N'viet', N'viet', N'Nguyễn Thanh Việt', 20, 2, N'Nghệ An, Việt Nam', N'2004-09-01', N'admin@gmail.com', N'123', NULL, N'Người dùng bình thường');
go

INSERT INTO Categories (CategoryName, Description) 
VALUES 
(N'Văn học cổ điển', N'Những tác phẩm văn học lâu đời, thường là những cuốn sách nổi bật của các tác giả lớn như William Shakespeare, Fyodor Dostoevsky, Leo Tolstoy, và Charles Dickens. Văn học cổ điển thường phản ánh các giá trị văn hóa và triết lý sống của thời đại, đồng thời có ảnh hưởng sâu rộng đến nền văn hóa và nghệ thuật hiện đại.'),
(N'Tiểu thuyết lãng mạn', N'Những câu chuyện tình yêu là trung tâm của thể loại này. Các tác phẩm lãng mạn thường mô tả mối quan hệ giữa các nhân vật chính, những thử thách và cảm xúc phức tạp trong tình yêu. Các tác giả nổi tiếng bao gồm Jane Austen, Nicholas Sparks, và Jojo Moyes.'),
(N'Tiểu thuyết khoa học viễn tưởng', N'Tập trung vào những thế giới giả tưởng, khoa học viễn tưởng khám phá các công nghệ tiên tiến, khám phá vũ trụ, hoặc những hiện tượng siêu nhiên chưa được giải thích. Các tác giả như Isaac Asimov, Arthur C. Clarke và Philip K. Dick đã xây dựng những vũ trụ đầy sáng tạo trong thể loại này.'),
(N'Tiểu thuyết kỳ ảo', N'Kỳ ảo liên quan đến những thế giới tưởng tượng, nơi các yếu tố siêu nhiên và phép thuật tồn tại. Những cuốn sách này thường có các nhân vật như phù thủy, sinh vật thần thoại và thế giới huyền bí. Một số tác phẩm nổi bật là "Harry Potter" của J.K. Rowling và "The Lord of the Rings" của J.R.R. Tolkien.'),
(N'Tiểu thuyết kinh dị', N'Những câu chuyện trong thể loại này thường tập trung vào việc tạo ra cảm giác sợ hãi, hồi hộp và căng thẳng cho người đọc. Các yếu tố như ma quái, thế lực đen tối, hay hiện tượng siêu nhiên thường xuyên xuất hiện. Stephen King là một trong những tác giả nổi tiếng của thể loại này.'),
(N'Tâm lý học', N'Sách tâm lý học giải thích các nguyên lý và hiện tượng tâm lý, nghiên cứu về hành vi con người, cảm xúc và nhận thức. Các tác phẩm trong thể loại này có thể hướng đến việc giúp độc giả hiểu rõ hơn về bản thân và người khác, như các sách của Sigmund Freud, Carl Jung hay Daniel Kahneman.'),
(N'Lịch sử', N'Các cuốn sách lịch sử nghiên cứu và kể lại những sự kiện, nhân vật và quá trình đã diễn ra trong quá khứ. Thể loại này giúp người đọc hiểu rõ hơn về sự phát triển của nhân loại, từ các nền văn minh cổ đại đến các sự kiện quan trọng trong thời hiện đại.'),
(N'Triết học', N'Triết học đề cập đến những câu hỏi sâu sắc về cuộc sống, sự tồn tại, đạo đức và tri thức. Các tác phẩm triết học thường khám phá các vấn đề lý luận về sự thật, tự do, và bản chất của con người. Các tác giả lớn trong thể loại này bao gồm Socrates, Immanuel Kant, và Friedrich Nietzsche.'),
(N'Sách tự lực (Self-help)', N'Những cuốn sách tự lực hướng đến việc cải thiện bản thân, phát triển kỹ năng sống, và đạt được mục tiêu cá nhân. Thể loại này bao gồm các sách về quản lý thời gian, cải thiện tâm trạng, và xây dựng sự tự tin, với các tác giả nổi tiếng như Dale Carnegie và Tony Robbins.'),
(N'Ngữ văn', N'Tập trung vào phân tích và nghiên cứu các tác phẩm văn học, bao gồm các thể loại văn học, kỹ thuật viết, và các tác giả nổi tiếng. Đây là thể loại sách dành cho những ai yêu thích việc nghiên cứu các tác phẩm văn học và muốn khám phá sâu hơn về nghệ thuật viết lách.'),
(N'Sách kỹ năng sống', N'Các sách này cung cấp những kiến thức và kỹ năng cần thiết để sống một cuộc sống hiệu quả hơn, bao gồm kỹ năng giao tiếp, giải quyết vấn đề, và phát triển bản thân. Những cuốn sách này giúp độc giả cải thiện mọi khía cạnh trong cuộc sống hàng ngày.'),
(N'Sách kinh tế', N'Thể loại sách này tập trung vào nghiên cứu các nguyên lý và lý thuyết trong nền kinh tế, bao gồm các chủ đề như thị trường, tài chính, và các yếu tố ảnh hưởng đến nền kinh tế toàn cầu. Các tác giả nổi bật như Adam Smith và John Maynard Keynes đóng góp nhiều vào thể loại này.'),
(N'Quản trị kinh doanh', N'Sách quản trị kinh doanh giúp người đọc hiểu rõ các nguyên lý và chiến lược trong quản lý và điều hành doanh nghiệp. Các tác phẩm này chia sẻ kiến thức về lãnh đạo, quản lý nhân sự, và phát triển doanh nghiệp, với các tác giả nổi tiếng như Peter Drucker và Jim Collins.'),
(N'Sách giáo dục', N'Tập trung vào các phương pháp và lý thuyết giáo dục, các sách giáo dục giúp nâng cao kiến thức và phương pháp giảng dạy. Các chủ đề trong thể loại này có thể bao gồm giáo dục tiểu học, trung học, giáo dục đặc biệt và giáo dục đại học.'),
(N'Sách phát triển bản thân', N'Những cuốn sách này giúp bạn khám phá các chiến lược để đạt được sự thành công cá nhân, tinh thần và nghề nghiệp. Sách phát triển bản thân có thể bao gồm các kỹ năng mềm, cách xây dựng thói quen tốt, và cách phát triển sự nghiệp.'),
(N'Chuyện phiêu lưu', N'Các câu chuyện trong thể loại này thường tập trung vào hành trình khám phá thế giới, đối mặt với thử thách và mạo hiểm. Những cuốn sách phiêu lưu có thể kể về những cuộc hành trình xa xôi hoặc những cuộc chiến đấu để bảo vệ điều tốt đẹp, với tác giả như Jules Verne và Robert Louis Stevenson.'),
(N'Sách về thiên nhiên & môi trường', N'Các tác phẩm trong thể loại này cung cấp thông tin về môi trường sống của con người, động vật, và thực vật, đồng thời nhấn mạnh tầm quan trọng của bảo vệ thiên nhiên và nguồn tài nguyên thiên nhiên. Các tác giả nổi bật bao gồm Rachel Carson và David Attenborough.'),
(N'Sách khoa học', N'Các cuốn sách khoa học giải thích các nguyên lý và phát hiện trong các lĩnh vực như vật lý, hóa học, sinh học và khoa học trái đất. Những cuốn sách này giúp người đọc hiểu về thế giới tự nhiên qua các lý thuyết và phát minh, với các tác giả nổi tiếng như Carl Sagan và Stephen Hawking.'),
(N'Chuyên ngành y học', N'Đây là những sách chuyên sâu về các vấn đề y tế, bao gồm các bệnh lý, phương pháp điều trị, và các tiến bộ trong y học. Các sách này phục vụ cho các bác sĩ, y tá, và những ai quan tâm đến lĩnh vực chăm sóc sức khỏe.'),
(N'Sách về nghệ thuật', N'Thể loại này bao gồm những cuốn sách nghiên cứu về các lĩnh vực nghệ thuật như hội họa, điêu khắc, âm nhạc, và múa. Sách về nghệ thuật giúp độc giả hiểu về các xu hướng nghệ thuật, các trường phái nghệ thuật nổi bật, và cuộc đời của các nghệ sĩ vĩ đại.'),
(N'Sách về âm nhạc', N'Các cuốn sách về âm nhạc khám phá lịch sử, lý thuyết, và các phong cách âm nhạc khác nhau. Thể loại này cũng bao gồm các tiểu sử của nhạc sĩ nổi tiếng, nghiên cứu về các thể loại nhạc cụ và âm nhạc cổ điển, hiện đại.'),
(N'Hồi ký & Tiểu sử', N'Những cuốn sách này kể về cuộc đời và sự nghiệp của những nhân vật nổi tiếng, có ảnh hưởng lớn trong các lĩnh vực chính trị, khoa học, nghệ thuật, và văn hóa. Hồi ký và tiểu sử mang đến cái nhìn sâu sắc về những trải nghiệm và suy nghĩ của các nhân vật lịch sử.'),
(N'Tự truyện', N'Tự truyện là sách mà tác giả viết về chính cuộc đời mình, từ những trải nghiệm, khó khăn, thành công và thất bại. Các tự truyện giúp độc giả hiểu thêm về cuộc sống của tác giả và thường chứa đựng những bài học cuộc sống quý giá.'),
(N'Sách thiếu nhi', N'Sách thiếu nhi hướng đến đối tượng là trẻ em, với những câu chuyện dễ hiểu, mang tính giáo dục cao và đầy màu sắc tưởng tượng. Các cuốn sách này có thể giúp trẻ phát triển kỹ năng đọc, tư duy và nuôi dưỡng trí tưởng tượng. Một số tác phẩm nổi tiếng như "The Very Hungry Caterpillar" và "Charlie and the Chocolate Factory".'),
(N'Sách văn học nước ngoài', N'Thể loại này bao gồm các tác phẩm văn học được viết bởi các tác giả từ các quốc gia khác nhau, với những phong cách và đề tài đặc trưng của từng nền văn hóa. Các tác phẩm văn học nước ngoài thường mang đến cái nhìn phong phú về các nền văn hóa khác nhau và cách sống của con người trên toàn thế giới.');
go

INSERT INTO Authors (AuthorName, BirthYear, Image, Description)
VALUES
(N'J.K. Rowling', 1965, NULL, N'Tác giả nổi tiếng với series Harry Potter'),
(N'George Orwell', 1903, NULL, N'Tác giả của 1984 và Animal Farm'),
(N'J.R.R. Tolkien', 1892, NULL, N'Tác giả của series The Lord of the Rings'),
(N'Mark Twain', 1835, NULL, N'Tác giả nổi tiếng với sách "The Adventures of Tom Sawyer"'),
(N'Jane Austen', 1775, NULL, N'Tác giả của các tiểu thuyết nổi tiếng như "Pride and Prejudice"'),
(N'Ernest Hemingway', 1899, NULL, N'Tác giả của "The Old Man and the Sea"'),
(N'F. Scott Fitzgerald', 1896, NULL, N'Tác giả của "The Great Gatsby"'),
(N'Haruki Murakami', 1949, NULL, N'Tác giả người Nhật nổi tiếng với các tiểu thuyết huyền bí'),
(N'Agatha Christie', 1890, NULL, N'Nữ hoàng truyện trinh thám'),
(N'Charles Dickens', 1812, NULL, N'Tác giả nổi tiếng với các tác phẩm "Oliver Twist" và "A Christmas Carol"'),
(N'Victor Hugo', 1802, NULL, N'Tác giả của "Les Misérables"'),
(N'Leo Tolstoy', 1828, NULL, N'Tác giả của "War and Peace"'),
(N'William Shakespeare', 1564, NULL, N'Nhà soạn kịch nổi tiếng người Anh'),
(N'Harper Lee', 1926, NULL, N'Tác giả của "To Kill a Mockingbird"'),
(N'Dan Brown', 1964, NULL, N'Tác giả của "The Da Vinci Code"');
go

INSERT INTO Publishers (PublisherName, Address, Email, EstablishYear, Description, Image)
VALUES
(N'Penguin Books', N'New York, USA', N'contact@penguin.com', 1935, N'Nhà xuất bản nổi tiếng', NULL),
(N'HarperCollins', N'London, UK', N'contact@harpercollins.com', 1989, N'Nhà xuất bản lớn', NULL),
(N'Random House', N'New York, USA', N'contact@randomhouse.com', 1927, N'Một trong những nhà xuất bản lớn nhất thế giới', NULL),
(N'Macmillan', N'London, UK', N'contact@macmillan.com', 1843, N'Nhà xuất bản học thuật và sách thiếu nhi', NULL),
(N'Simon & Schuster', N'New York, USA', N'contact@simonandschuster.com', 1924, N'Nhà xuất bản lớn với nhiều thể loại sách', NULL),
(N'Oxford University Press', N'Oxford, UK', N'contact@oup.com', 1586, N'Nhà xuất bản học thuật hàng đầu thế giới', NULL),
(N'Harlequin', N'Toronto, Canada', N'contact@harlequin.com', 1949, N'Nhà xuất bản chuyên về sách lãng mạn', NULL),
(N'Hachette Livre', N'Paris, France', N'contact@hachette.com', 1826, N'Nhà xuất bản lớn tại Pháp', NULL),
(N'Scholastic', N'New York, USA', N'contact@scholastic.com', 1920, N'Nhà xuất bản sách dành cho trẻ em', NULL),
(N'Bloomsbury Publishing', N'London, UK', N'contact@bloomsbury.com', 1986, N'Nhà xuất bản sách văn học', NULL),
(N'Penguin Random House', N'New York, USA', N'contact@penguinrandomhouse.com', 2013, N'Liên kết giữa Penguin Books và Random House', NULL),
(N'Cengage Learning', N'Boston, USA', N'contact@cengage.com', 2007, N'Nhà xuất bản chuyên về sách học thuật', NULL),
(N'Wiley', N'Hoboken, USA', N'contact@wiley.com', 1807, N'Nhà xuất bản sách chuyên ngành khoa học', NULL),
(N'Prentice Hall', N'New Jersey, USA', N'contact@prenticehall.com', 1913, N'Nhà xuất bản các sách giáo khoa', NULL),
(N'Routledge', N'London, UK', N'contact@routledge.com', 1836, N'Nhà xuất bản sách học thuật và nghiên cứu', NULL),
(N'Cambridge University Press', N'Cambridge, UK', N'contact@cambridge.org', 1534, N'Nhà xuất bản lâu đời chuyên về sách học thuật', NULL),
(N'Pearson Education', N'London, UK', N'contact@pearson.com', 1844, N'Nhà xuất bản chuyên về sách giáo dục', NULL),
(N'Macmillan Education', N'London, UK', N'contact@macmillaneducation.com', 1843, N'Nhà xuất bản sách học thuật và giáo dục', NULL),
(N'Thomson Reuters', N'Toronto, Canada', N'contact@thomsonreuters.com', 2008, N'Nhà xuất bản sách về luật và tài chính', NULL),
(N'Springer', N'Berlin, Germany', N'contact@springer.com', 1842, N'Nhà xuất bản chuyên về sách khoa học', NULL);
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


