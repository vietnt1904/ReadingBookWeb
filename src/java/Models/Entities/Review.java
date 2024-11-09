/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Entities;

import java.util.Date;

/**
 *
 * @author VIET
 */
public class Review {

    int reviewID;
    int userID;
    int BookID;
    Date fixDate;//Cần file log để ghi lại nội dung thay đổi
    int readCount;
    String Description;
    Date create_At;

    public Review() {
    }

    public Review(int userID, int BookID, Date fixDate, int readCount, String Description) {
        this.userID = userID;
        this.BookID = BookID;
        this.fixDate = fixDate;
        this.readCount = readCount;
        this.Description = Description;
    }

    public Review(int reviewID, int userID, int BookID, Date fixDate, int readCount, String Description, Date create_At) {
        this.reviewID = reviewID;
        this.userID = userID;
        this.BookID = BookID;
        this.fixDate = fixDate;
        this.readCount = readCount;
        this.Description = Description;
        this.create_At = create_At;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public Date getFixDate() {
        return fixDate;
    }

    public void setFixDate(Date fixDate) {
        this.fixDate = fixDate;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Date getCreate_At() {
        return create_At;
    }

    public void setCreate_At(Date create_At) {
        this.create_At = create_At;
    }

}
