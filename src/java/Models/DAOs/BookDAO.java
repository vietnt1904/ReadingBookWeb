/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAOs;

import Models.Entities.Book;
import Models.MyDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author VIET
 */
public class BookDAO extends MyDAO {

    public Book getOne(int bookIDMain) {
        xSql = "select * from Books where BookID = " + bookIDMain;
        Book book = new Book();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int bookID = rs.getInt("BookID");
                int authorID = rs.getInt("AuthorID");
                int publisherID = rs.getInt("PublisherID");
                String bookName = rs.getNString("BookName");
                String otherName = rs.getNString("OtherName");
                int publicationYear = rs.getInt("PublicationYear");
                int price = rs.getInt("Price");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                int page = rs.getInt("Page");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                book = new Book(bookID, authorID, publisherID, bookName, otherName,
                        publicationYear, price, page, image, description, create_At);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return book;
    }

    public List<Book> getAllBooks() {
        List<Book> lists = new ArrayList<>();
        xSql = "select b.*, a.AuthorName from Books b, Authors a where b.AuthorID = a.AuthorID";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int bookID = rs.getInt("BookID");
                int authorID = rs.getInt("AuthorID");
                int publisherID = rs.getInt("PublisherID");
                String bookName = rs.getNString("BookName");
                String otherName = rs.getNString("OtherName");
                int publicationYear = rs.getInt("PublicationYear");
                int price = rs.getInt("Price");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                int page = rs.getInt("Page");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");
                String authorName = rs.getNString("AuthorName");

                Book book = new Book(bookID, authorID, publisherID, bookName, otherName,
                        publicationYear, price, page, image, description, create_At, authorName);
                lists.add(book);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

    public void insert(Book b) {
        xSql = "insert into Books(AuthorID, PublisherID, BookName, OtherName"
                + ", PublicationYear, Price, Image, Page, Description) values ("
                + b.getAuthorID() + ", " + b.getPublisherID() + ", N'"
                + b.getBookName() + "', N'" + b.getOtherName() + "', "
                + b.getPublicationYear() + ", " + b.getPrice() + ", '"
                + b.getImage() + "', " + b.getPage() + ", N'" + b.getDescription() + "')";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update(Book b) {
        xSql = "update Books set AuthorID = "
                + b.getAuthorID() + ", PublisherID = " + b.getPublisherID()
                + ", BookName = N'" + b.getBookName() + "', OtherName = N'"
                + b.getOtherName() + "', PublicationYear = " + b.getPublicationYear()
                + ", Price = " + b.getPrice() + ", Image = '" + b.getImage()
                + "', Page = " + b.getPage() + ", Description = N'" + b.getDescription() 
                + "' where BookID = " + b.getBookID();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Book> getAllBooksByUser(int userID) {
        List<Book> lists = new ArrayList<>();
        xSql = "select b.* from Books b "
                + "join ShelfItems s on b.BookID = s.BookID "
                + "join Bookshelves bs on bs.BookshelfID =s.BookshelfID "
                + "where bs.UserID = " + userID;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int bookID = rs.getInt("BookID");
                int authorID = rs.getInt("AuthorID");
                int publisherID = rs.getInt("PublisherID");
                String bookName = rs.getNString("BookName");
                String otherName = rs.getNString("OtherName");
                int publicationYear = rs.getInt("PublicationYear");
                int price = rs.getInt("Price");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                int page = rs.getInt("Page");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                Book book = new Book(bookID, authorID, publisherID, bookName, otherName,
                        publicationYear, price, page, image, description, create_At);
                lists.add(book);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

    public List<Book> getBooksByCategory(int cateID) {
        List<Book> lists = new ArrayList<>();
        xSql = "select b.* from Books b join BookCates bc on b.BookID = bc.BookID "
                + "where bc.CategoryID = " + cateID;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int bookID = rs.getInt("BookID");
                int authorID = rs.getInt("AuthorID");
                int publisherID = rs.getInt("PublisherID");
                String bookName = rs.getNString("BookName");
                String otherName = rs.getNString("OtherName");
                int publicationYear = rs.getInt("PublicationYear");
                int price = rs.getInt("Price");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                int page = rs.getInt("Page");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                Book book = new Book(bookID, authorID, publisherID, bookName, otherName,
                        publicationYear, price, page, image, description, create_At);
                lists.add(book);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

    public List<Book> getBooksByBook(int bookIDMain) {
        List<Book> lists = new ArrayList<>();
        xSql = "select b.* from Books b join BookCates bc on b.BookID = bc.BookID "
                + "join (select CategoryID from BookCates where BookID = "
                + bookIDMain + ") as Temp on bc.CategoryID = Temp.CategoryID";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int bookID = rs.getInt("BookID");
                int authorID = rs.getInt("AuthorID");
                int publisherID = rs.getInt("PublisherID");
                String bookName = rs.getNString("BookName");
                String otherName = rs.getNString("OtherName");
                int publicationYear = rs.getInt("PublicationYear");
                int price = rs.getInt("Price");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                int page = rs.getInt("Page");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                Book book = new Book(bookID, authorID, publisherID, bookName, otherName,
                        publicationYear, price, page, image, description, create_At);
                lists.add(book);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }
    
    public List<Book> getBooksByPubLisher(int publisherIDMain) {
        List<Book> lists = new ArrayList<>();
        xSql = "select * from Books where PublisherID = " + publisherIDMain;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int bookID = rs.getInt("BookID");
                int authorID = rs.getInt("AuthorID");
                int publisherID = rs.getInt("PublisherID");
                String bookName = rs.getNString("BookName");
                String otherName = rs.getNString("OtherName");
                int publicationYear = rs.getInt("PublicationYear");
                int price = rs.getInt("Price");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                int page = rs.getInt("Page");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                Book book = new Book(bookID, authorID, publisherID, bookName, otherName,
                        publicationYear, price, page, image, description, create_At);
                lists.add(book);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }
    
    public List<Book> getBooksByAuthor(int authorIDMain) {
        List<Book> lists = new ArrayList<>();
        xSql = "select * from Books where AuthorID = " + authorIDMain;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int bookID = rs.getInt("BookID");
                int authorID = rs.getInt("AuthorID");
                int publisherID = rs.getInt("PublisherID");
                String bookName = rs.getNString("BookName");
                String otherName = rs.getNString("OtherName");
                int publicationYear = rs.getInt("PublicationYear");
                int price = rs.getInt("Price");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                int page = rs.getInt("Page");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                Book book = new Book(bookID, authorID, publisherID, bookName, otherName,
                        publicationYear, price, page, image, description, create_At);
                lists.add(book);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

}
