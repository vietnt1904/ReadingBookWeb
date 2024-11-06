/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAOs;

import Models.Entities.Bookshelf;
import Models.MyDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author VIET
 */
public class BookshelfDAO extends MyDAO {

    public Bookshelf getOne(int bookshelfIDMain) {
        Bookshelf bookshelf = new Bookshelf();
        xSql = "select * from Bookshelves where BookshelfID = " + bookshelfIDMain;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int bookshelfID = rs.getInt("BookshelfID");
                int userID = rs.getInt("UserID");
                int totalBook = rs.getInt("TotalBook");
                int readBook = rs.getInt("ReadBook");
                int readingBook = rs.getInt("ReadingBook");
                int unreadBook = rs.getInt("UnreadBook");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                bookshelf = new Bookshelf(bookshelfID, userID, totalBook, readBook,
                        readingBook, unreadBook, image, description, create_At);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return bookshelf;
    }

    public void insert(Bookshelf b) {
        xSql = "insert into Bookshelves(UserID, TotalBook, ReadBook, ReadingBook"
                + ", UnreadBook, Image, Description) values (" + b.getUserID()
                + ", " + b.getTotalBook() + ", " + b.getReadBook() + ", "
                + b.getReadingBook() + ", " + b.getUnreadBook() + ", '"
                + b.getImage() + "', N'" + b.getDescription() + "')";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void update(Bookshelf b) {
        xSql = "update Bookshelves set UserID = " + b.getUserID() + ", TotalBook = " 
                + b.getTotalBook() + ", ReadBook = " + b.getReadBook() + ", ReadingBook = "
                + b.getReadingBook() + ", UnreadBook = " + b.getUnreadBook() + ", Image = '"
                + b.getImage() + "', Description = N'" + b.getDescription() + "'";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Bookshelf> getAllBookshelves() {
        List<Bookshelf> lists = new ArrayList<>();
        xSql = "select * from Bookshelves";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int bookshelfID = rs.getInt("BookshelfID");
                int userID = rs.getInt("UserID");
                int totalBook = rs.getInt("TotalBook");
                int readBook = rs.getInt("ReadBook");
                int readingBook = rs.getInt("ReadingBook");
                int unreadBook = rs.getInt("UnreadBook");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                Bookshelf bookshelf = new Bookshelf(bookshelfID, userID, totalBook, readBook,
                        readingBook, unreadBook, image, description, create_At);
                lists.add(bookshelf);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }
    
    public Bookshelf getByUserID(int userIDMain){
        xSql = "select * from BookShelves where UserID = " + userIDMain;
        Bookshelf bookshelf = new Bookshelf();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int bookshelfID = rs.getInt("BookshelfID");
                int userID = rs.getInt("UserID");
                int totalBook = rs.getInt("TotalBook");
                int readBook = rs.getInt("ReadBook");
                int readingBook = rs.getInt("ReadingBook");
                int unreadBook = rs.getInt("UnreadBook");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                bookshelf = new Bookshelf(bookshelfID, userID, totalBook, readBook,
                        readingBook, unreadBook, image, description, create_At);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return bookshelf;
    }

}
