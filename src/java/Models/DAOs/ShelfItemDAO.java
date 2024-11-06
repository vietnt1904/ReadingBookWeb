/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAOs;

import Models.Entities.ShelfItem;
import Models.MyDAO;
import java.util.Date;

/**
 *
 * @author VIET
 */
public class ShelfItemDAO extends MyDAO {

    public ShelfItem getOne(int itemIDMain) {
        ShelfItem shelfItem = new ShelfItem();
        xSql = "select * from ShelfItems where ItemID = " + itemIDMain;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int itemID = rs.getInt("ItemID");
                int bookshelfID = rs.getInt("BookshelfID");
                int bookID = rs.getInt("BookID");
                String status = rs.getNString("Status");
                int readCount = rs.getInt("ReadCount");
                Date startedDate = rs.getDate("StartedDate");
                Date finishedDate = rs.getDate("FinishedDate");
                String review = rs.getNString("Review");
                Date create_At = rs.getDate("Create_At");

                shelfItem = new ShelfItem(itemID, bookID, bookshelfID, status,
                        startedDate, finishedDate, readCount, review, create_At);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return shelfItem;
    }

    public void insert(ShelfItem s) {
        xSql = "insert into ShelfItems(BookshelfID, BookID, Status, ReadCount"
                + ", StartedDate, FinishedDate, Review) values (" + s.getBookshelfID()
                + ", " + s.getBookID() + ", N'" + s.getStatus() + "', "
                + s.getReadCount() + ", N'" + s.getStartedDate() + "', N'"
                + s.getFinishedDate() + "', N'" + s.getReview() + "')";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void startRead(ShelfItem s) {
        xSql = "update ShelfItems set BookshelfID = " + s.getBookshelfID()
                + ", BookID = " + s.getBookID() + ", Status = N'Đang đọc"
                + "', ReadCount = " + s.getReadCount() + ", StartDate = getdate()"
                + ", FinishedDate = N'" + s.getFinishedDate()
                + "', Review = N'" + s.getReview() + "' where ItemID = " + s.getItemID();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void finishRead(ShelfItem s) {
        xSql = "update ShelfItems set BookshelfID = " + s.getBookshelfID()
                + ", BookID = " + s.getBookID() + ", Status = N'Đã đọc"
                + "', ReadCount = " + s.getReadCount() + ", StartDate = N'"
                + s.getStartedDate() + "', FinishedDate = getdate()"
                + ", Review = N'" + s.getReview() + "' where ItemID = " + s.getItemID();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update(ShelfItem s) {
        xSql = "update ShelfItems set BookshelfID = " + s.getBookshelfID()
                + ", BookID = " + s.getBookID() + ", Status = N'" + s.getStatus()
                + "', ReadCount = " + s.getReadCount() + ", StartDate = N'"
                + s.getStartedDate() + "', FinishedDate = N'" + s.getFinishedDate()
                + "', Review = N'" + s.getReview() + "' where ItemID = " + s.getItemID();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ShelfItem getAllItemsByUser(int userID) {
        ShelfItem shelfItem = new ShelfItem();
        xSql = "select * from ShelfItems";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int itemID = rs.getInt("ItemID");
                int bookshelfID = rs.getInt("BookshelfID");
                int bookID = rs.getInt("BookID");
                String status = rs.getNString("Status");
                int readCount = rs.getInt("ReadCount");
                Date startedDate = rs.getDate("StartedDate");
                Date finishedDate = rs.getDate("FinishedDate");
                String review = rs.getNString("Review");
                Date create_At = rs.getDate("Create_At");

                shelfItem = new ShelfItem(itemID, bookID, bookshelfID, status,
                        startedDate, finishedDate, readCount, review, create_At);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return shelfItem;
    }

}
