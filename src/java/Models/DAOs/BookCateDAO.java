/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAOs;

import Models.Entities.Book;
import Models.Entities.BookCate;
import Models.MyDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VIET
 */
public class BookCateDAO extends MyDAO {

    public BookCate getOne(int itemIDMain) {
        xSql = "select * from BookCates where ItemID = " + itemIDMain;
        BookCate bookCate = new BookCate();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int itemID = rs.getInt("ItemID");
                int categoryID = rs.getInt("CategoryID");
                int bookID = rs.getInt("BookID");
                String tag = rs.getNString("Tag");

                bookCate = new BookCate(itemID, categoryID, bookID, tag);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return bookCate;
    }

    public List<BookCate> getAllBookCates() {
        xSql = "select * from BookCates";
        List<BookCate> lists = new ArrayList<>();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int itemID = rs.getInt("ItemID");
                int categoryID = rs.getInt("CategoryID");
                int bookID = rs.getInt("BookID");
                String tag = rs.getNString("Tag");

                BookCate bookCate = new BookCate(itemID, categoryID, bookID, tag);
                lists.add(bookCate);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

    public void insert(int bookID, int categoryID) {
        xSql = "insert into BookCates(BookID, CategoryID) values ("
                + bookID + ", " + categoryID + ")";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insert(Book b, int categoryID) {
        if (b.getBookID() != 0) {
            insert(b.getBookID(), categoryID);
        } else {
            xSql = "insert into BookCates(BookID, CategoryID) "
                    + "select b.BookID, " + categoryID + ",  from Books b "
                    + "where b.BookName = N'" + b.getBookName() + "' and b.AuthorID = " 
                    + b.getAuthorID() + " and b.PublisherID = " + b.getPublisherID() 
                    + " and b.PublicationYear = " + b.getPublicationYear() 
                    + " and b.Price = " + b.getPrice() + " and b.Page = " + b.getPage();
                    
            try {
                ps = con.prepareStatement(xSql);
                rs = ps.executeQuery();

                ps.close();
                rs.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public List<BookCate> getByBook(int bookIDMain) {
        xSql = "select * from BookCates where BookID = " + bookIDMain;
        List<BookCate> lists = new ArrayList<>();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int itemID = rs.getInt("ItemID");
                int categoryID = rs.getInt("CategoryID");
                int bookID = rs.getInt("BookID");
                String tag = rs.getNString("Tag");

                BookCate bookCate = new BookCate(itemID, categoryID, bookID, tag);
                lists.add(bookCate);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

    public List<BookCate> getByCategory(int categoryIDMain) {
        xSql = "select * from BookCateswhere CategoryID = " + categoryIDMain;
        List<BookCate> lists = new ArrayList<>();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int itemID = rs.getInt("ItemID");
                int categoryID = rs.getInt("CategoryID");
                int bookID = rs.getInt("BookID");
                String tag = rs.getNString("Tag");

                BookCate bookCate = new BookCate(itemID, categoryID, bookID, tag);
                lists.add(bookCate);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

}
