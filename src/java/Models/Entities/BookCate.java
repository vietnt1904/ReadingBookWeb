/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Entities;

/**
 *
 * @author VIET
 */
public class BookCate {
    int itemID;
    int categoryID;
    int bookID;
    String tag;

    public BookCate() {
    }

    public BookCate(int categoryID, int bookID, String tag) {
        this.categoryID = categoryID;
        this.bookID = bookID;
        this.tag = tag;
    }

    public BookCate(int itemID, int categoryID, int bookID, String tag) {
        this.itemID = itemID;
        this.categoryID = categoryID;
        this.bookID = bookID;
        this.tag = tag;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    
}
