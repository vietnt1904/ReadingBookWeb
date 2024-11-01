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
public class ShelfItem {
    int itemID;
    int bookID;
    int bookshelfID;
    String status;
    Date startedDate;
    Date finishedDate;
    int readCount;
    String review;
    Date create_At;

    public ShelfItem() {
    }

    public ShelfItem(int bookID, int bookshelfID, String status, Date startedDate, Date finishedDate, int readCount, String review) {
        this.bookID = bookID;
        this.bookshelfID = bookshelfID;
        this.status = status;
        this.startedDate = startedDate;
        this.finishedDate = finishedDate;
        this.readCount = readCount;
        this.review = review;
    }

    public ShelfItem(int itemID, int bookID, int bookshelfID, String status, Date startedDate, Date finishedDate, int readCount, String review, Date create_At) {
        this.itemID = itemID;
        this.bookID = bookID;
        this.bookshelfID = bookshelfID;
        this.status = status;
        this.startedDate = startedDate;
        this.finishedDate = finishedDate;
        this.readCount = readCount;
        this.review = review;
        this.create_At = create_At;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getBookshelfID() {
        return bookshelfID;
    }

    public void setBookshelfID(int bookshelfID) {
        this.bookshelfID = bookshelfID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(Date startedDate) {
        this.startedDate = startedDate;
    }

    public Date getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(Date finishedDate) {
        this.finishedDate = finishedDate;
    }

    public int getReadCount() {
        return readCount;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Date getCreate_At() {
        return create_At;
    }

    public void setCreate_At(Date create_At) {
        this.create_At = create_At;
    }
    
    
    
}
