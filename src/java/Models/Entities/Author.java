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
public class Author {
    int authorID;
    String authorName;
    int birthYear;
    String image;
    String description;
    Date create_At;

    public Author() {
    }

    public Author(String authorName, int birthYear, String image, String description) {
        this.authorName = authorName;
        this.birthYear = birthYear;
        this.image = image;
        this.description = description;
    }

    public Author(int authorID, String authorName, int birthYear, String image, String description) {
        this.authorID = authorID;
        this.authorName = authorName;
        this.birthYear = birthYear;
        this.image = image;
        this.description = description;
    }

    public Author(int authorID, String authorName, int birthYear, String image, String description, Date create_At) {
        this.authorID = authorID;
        this.authorName = authorName;
        this.birthYear = birthYear;
        this.image = image;
        this.description = description;
        this.create_At = create_At;
    }
    
    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
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
