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
public class Publisher {
    int publisherID;
    String publisherName;
    String address;
    String email;
    int establishYear;
    String description;
    String image;
    Date create_At;

    public Publisher() {
    }
    
    public Publisher(String publisherName, String address, String email, int establishYear, String description, String image) {
        this.publisherName = publisherName;
        this.address = address;
        this.email = email;
        this.establishYear = establishYear;
        this.description = description;
        this.image = image;
    }

    public Publisher(int publisherID, String publisherName, String address, String email, int establishYear, String description, String image, Date create_At) {
        this.publisherID = publisherID;
        this.publisherName = publisherName;
        this.address = address;
        this.email = email;
        this.establishYear = establishYear;
        this.description = description;
        this.image = image;
        this.create_At = create_At;
    }

    public int getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(int publisherID) {
        this.publisherID = publisherID;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEstablishYear() {
        return establishYear;
    }

    public void setEstablishYear(int establishYear) {
        this.establishYear = establishYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
