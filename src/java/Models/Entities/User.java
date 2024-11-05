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
public class User {
    int userID;
    String userName;
    int age;
    int roleID;
    String address;
    Date birthday;
    String email;
    String phoneNumber;
    String image;
    String description;
    Date create_At;

    public User() {
    }

    public User(String userName, int age, int roleID, String address, Date birthday
            , String email, String phoneNumber, String image, String description) {
        this.userName = userName;
        this.age = age;
        this.roleID = roleID;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.image = image;
        this.description = description;
    }

    public User(int userID, String userName, int age, int roleID, String address, Date birthday
            , String email, String phoneNumber, String image, String description, Date create_At) {
        this.userID = userID;
        this.userName = userName;
        this.age = age;
        this.roleID = roleID;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.image = image;
        this.description = description;
        this.create_At = create_At;
    }
    
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
