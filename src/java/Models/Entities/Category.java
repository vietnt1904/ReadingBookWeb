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
public class Category {
    int categoryID;
    String categoryName;
    String Description;
    String image;
    Date create_At;

    public Category() {
    }

    public Category(String categoryName, String Description, String image) {
        this.categoryName = categoryName;
        this.Description = Description;
        this.image = image;
    }

    public Category(int categoryID, String categoryName, String Description, String image, Date create_At) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.Description = Description;
        this.image = image;
        this.create_At = create_At;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreate_At() {
        return create_At;
    }

    public void setCreate_At(Date create_At) {
        this.create_At = create_At;
    }
    
    
}
