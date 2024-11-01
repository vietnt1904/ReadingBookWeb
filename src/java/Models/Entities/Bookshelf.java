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
public class Bookshelf {
    int bookshelfID;
    int userID;
    int totalBook;
    int readBook;
    int readingBook;
    int unreadBook;
    String image;
    String description;
    Date create_At;

    public Bookshelf() {
    }

    public Bookshelf(int userID, int totalBook, int readBook, int readingBook, int unreadBook, String image, String description) {
        this.userID = userID;
        this.totalBook = totalBook;
        this.readBook = readBook;
        this.readingBook = readingBook;
        this.unreadBook = unreadBook;
        this.image = image;
        this.description = description;
    }

    public Bookshelf(int bookshelfID, int userID, int totalBook, int readBook, int readingBook, int unreadBook, String image, String description, Date create_At) {
        this.bookshelfID = bookshelfID;
        this.userID = userID;
        this.totalBook = totalBook;
        this.readBook = readBook;
        this.readingBook = readingBook;
        this.unreadBook = unreadBook;
        this.image = image;
        this.description = description;
        this.create_At = create_At;
    }

    public int getBookshelfID() {
        return bookshelfID;
    }

    public void setBookshelfID(int bookshelfID) {
        this.bookshelfID = bookshelfID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTotalBook() {
        return totalBook;
    }

    public void setTotalBook(int totalBook) {
        this.totalBook = totalBook;
    }

    public int getReadBook() {
        return readBook;
    }

    public void setReadBook(int readBook) {
        this.readBook = readBook;
    }

    public int getReadingBook() {
        return readingBook;
    }

    public void setReadingBook(int readingBook) {
        this.readingBook = readingBook;
    }

    public int getUnreadBook() {
        return unreadBook;
    }

    public void setUnreadBook(int unreadBook) {
        this.unreadBook = unreadBook;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreate_At() {
        return create_At;
    }

    public void setCreate_At(Date create_At) {
        this.create_At = create_At;
    }

    
}
