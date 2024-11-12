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
public class Book {
    int bookID;
    int authorID;
    int publisherID;
    String bookName;
    String otherName;
    int publicationYear;
    int price;
    int page;
    String image;
    String description;
    Date create_At;
    String authorName;

    public Book() {
    }

    public Book(int authorID, int publisherID, String bookName, String otherName, int publicationYear, int price, int page, String image, String description) {
        this.authorID = authorID;
        this.publisherID = publisherID;
        this.bookName = bookName;
        this.otherName = otherName;
        this.publicationYear = publicationYear;
        this.price = price;
        this.page = page;
        this.image = image;
        this.description = description;
    }

    public Book(int bookID, int authorID, int publisherID, String bookName, String otherName, int publicationYear, int price, int page, String image, String description) {
        this.bookID = bookID;
        this.authorID = authorID;
        this.publisherID = publisherID;
        this.bookName = bookName;
        this.otherName = otherName;
        this.publicationYear = publicationYear;
        this.price = price;
        this.page = page;
        this.image = image;
        this.description = description;
    }

    public Book(int bookID, int authorID, int publisherID, String bookName, String otherName, int publicationYear, int price, int page, String image, String description, Date create_At) {
        this.bookID = bookID;
        this.authorID = authorID;
        this.publisherID = publisherID;
        this.bookName = bookName;
        this.otherName = otherName;
        this.publicationYear = publicationYear;
        this.price = price;
        this.page = page;
        this.image = image;
        this.description = description;
        this.create_At = create_At;
    }

    public Book(int bookID, int authorID, int publisherID, String bookName, String otherName, int publicationYear, int price, int page, String image, String description, Date create_At, String authorName) {
        this.bookID = bookID;
        this.authorID = authorID;
        this.publisherID = publisherID;
        this.bookName = bookName;
        this.otherName = otherName;
        this.publicationYear = publicationYear;
        this.price = price;
        this.page = page;
        this.image = image;
        this.description = description;
        this.create_At = create_At;
        this.authorName = authorName;
    }
    
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public int getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(int publisherID) {
        this.publisherID = publisherID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    
}
