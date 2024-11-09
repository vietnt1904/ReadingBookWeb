/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAOs;

import Models.Entities.Review;
import Models.MyDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author VIET
 */
public class ReviewDAO extends MyDAO {

    public Review getOne(int reviewIDMain) {
        Review review = new Review();
        xSql = "select * from Reviews where ItemID = " + reviewIDMain;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int reviewID = rs.getInt("ReviewID");
                int userID = rs.getInt("UserID");
                int bookID = rs.getInt("BookID");
                Date create_At = rs.getDate("Create_At");
                Date fixDate = rs.getDate("FixDate");
                int readCount = rs.getInt("ReadCount");
                String description = rs.getNString("Description");

                review = new Review(reviewID, userID, bookID, fixDate,
                        readCount, description, create_At);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return review;
    }

    public List<Review> getAllReviews() {
        List<Review> lists = new ArrayList<>();
        xSql = "select * from Reviews";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int reviewID = rs.getInt("ReviewID");
                int userID = rs.getInt("UserID");
                int bookID = rs.getInt("BookID");
                Date create_At = rs.getDate("Create_At");
                Date fixDate = rs.getDate("FixDate");
                int readCount = rs.getInt("ReadCount");
                String description = rs.getNString("Description");

                Review review = new Review(reviewID, userID, bookID, fixDate,
                        readCount, description, create_At);
                lists.add(review);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

    public void insert(Review r) {
        xSql = "insert into Reviews(UserID, BookID, ReadCount, Description) "
                + "values (" + r.getUserID() + ", " + r.getBookID() + ", "
                + r.getReadCount() + ", N'" + r.getDescription() + "')";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update(Review r) {
        xSql = "update Reviews set Description = N'" + r.getDescription()
                + "' where UserID = " + r.getUserID() + " and BookID = "
                + r.getBookID() + " and ReadCounnt = " + r.getReadCount();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Review getOneByUserIDBookID(int userID, int bookID, int readCount) {
        Review review = new Review();
        xSql = "select ReviewID, Create_At, FixDate, Description from Reviews "
                + "where UserID = " + userID + " and BookID = " + bookID
                + " and ReadCount = " + readCount;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int reviewID = rs.getInt("ReviewID");
                Date create_At = rs.getDate("Create_At");
                Date fixDate = rs.getDate("FixDate");
                String description = rs.getNString("Description");

                review = new Review(reviewID, userID, bookID, fixDate,
                        readCount, description, create_At);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return review;
    }

    public List<Review> getAllReviewsByUser(int userID) {
        List<Review> lists = new ArrayList<>();
        xSql = "select ReviewID, BookID, Create_At, FixDate, ReadCount"
                + ", Description from Reviews where UserID = " + userID;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int reviewID = rs.getInt("ReviewID");
                int bookID = rs.getInt("BookID");
                Date create_At = rs.getDate("Create_At");
                Date fixDate = rs.getDate("FixDate");
                int readCount = rs.getInt("ReadCount");
                String description = rs.getNString("Description");

                Review review = new Review(reviewID, userID, bookID, fixDate,
                        readCount, description, create_At);
                lists.add(review);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

    public List<Review> getAllReviewsByBook(int bookID) {
        List<Review> lists = new ArrayList<>();
        xSql = "select ReviewID, UserID, Create_At, FixDate, ReadCount"
                + ", Description from Reviews where BookID = " + bookID;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int reviewID = rs.getInt("ReviewID");
                int userID = rs.getInt("UserID");
                Date create_At = rs.getDate("Create_At");
                Date fixDate = rs.getDate("FixDate");
                int readCount = rs.getInt("ReadCount");
                String description = rs.getNString("Description");

                Review review = new Review(reviewID, userID, bookID, fixDate,
                        readCount, description, create_At);
                lists.add(review);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

    public void delete(int reviewID) {
        xSql = "delete from Reviews where ReviewID = " + reviewID;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteByUserBookCount(int userID, int bookID, int readCount) {
        xSql = "delete from Reviews where UserID = " + userID 
                + " and BookID = " + bookID + " and ReadCount = " + readCount;
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
