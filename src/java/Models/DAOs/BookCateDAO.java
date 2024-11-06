/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAOs;

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
    
    
}
