/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAOs;

import Models.Entities.User;
import Models.MyDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author VIET
 */
public class UserDAO extends MyDAO {

    public User getUser(int userIDMain) {
        xSql = "select * from Users where UserID = " + userIDMain;
        User user = new User();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int userID = rs.getInt("USerID");
                String userName = rs.getNString("UserName");
                int age = rs.getInt("Age");
                int roleID = rs.getInt("roleID");
                String address = rs.getNString("Address");
                Date birthday = rs.getDate("Birthday");
                String email = rs.getString("Email");
                String phoneNumber = rs.getString("PhoneNumber");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                user = new User(userID, userName, age, roleID, address, birthday,
                        email, phoneNumber, image, description, create_At);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }

    public void insert(User u) {
        xSql = "insert into Users(UserName, Age, RoleID, Address, Birthday, Email"
                + ", PhoneNumber, Image, Description) values (N'" + u.getUserName()
                + "', " + u.getAge() + ", " + u.getRoleID() + ", N'" + u.getAddress()
                + "', '" + u.getBirthday() + "', '" + u.getEmail() + "', '"
                + u.getPhoneNumber() + "', '" + u.getImage() + "', N'" + u.getDescription() + "')";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update(User u) {
        xSql = "update Users set UserName = N'" + u.getUserName()
                + "', Age = " + u.getAge() + ", RoleID = " + u.getRoleID() + ", Address = N'" + u.getAddress()
                + "', Birthday = '" + u.getBirthday() + "', Email = '" + u.getEmail() + "', PhoneNumber = '"
                + u.getPhoneNumber() + "', Image = '" + u.getImage() + "', Description = N'" + u.getDescription() + "')";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<User> getAllUsers() {
        List<User> lists = new ArrayList<>();
        xSql = "select * from Users";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int userID = rs.getInt("USerID");
                String userName = rs.getNString("UserName");
                int age = rs.getInt("Age");
                int roleID = rs.getInt("roleID");
                String address = rs.getNString("Address");
                Date birthday = rs.getDate("Birthday");
                String email = rs.getString("Email");
                String phoneNumber = rs.getString("PhoneNumber");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                User user = new User(userID, userName, age, roleID, address, birthday,
                        email, phoneNumber, image, description, create_At);

                lists.add(user);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

    public User getUserByPhone(String phoneNumberMain) {
        xSql = "select * from Users where PhoneNumber = " + phoneNumberMain;
        User user = new User();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int userID = rs.getInt("USerID");
                String userName = rs.getNString("UserName");
                int age = rs.getInt("Age");
                int roleID = rs.getInt("roleID");
                String address = rs.getNString("Address");
                Date birthday = rs.getDate("Birthday");
                String email = rs.getString("Email");
                String phoneNumber = rs.getString("PhoneNumber");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                user = new User(userID, userName, age, roleID, address, birthday,
                        email, phoneNumber, image, description, create_At);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }

    public User getUserByEmail(String emailMain) {
        xSql = "select * from Users where Email = " + emailMain;
        User user = new User();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int userID = rs.getInt("USerID");
                String userName = rs.getNString("UserName");
                int age = rs.getInt("Age");
                int roleID = rs.getInt("roleID");
                String address = rs.getNString("Address");
                Date birthday = rs.getDate("Birthday");
                String email = rs.getString("Email");
                String phoneNumber = rs.getString("PhoneNumber");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                user = new User(userID, userName, age, roleID, address, birthday,
                        email, phoneNumber, image, description, create_At);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return user;
    }

    public boolean checkPhoneDupli(String phone) {
        xSql = "select count(*) from Users where PhoneNumber = '" + phone + "'";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return false;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

    public boolean checkPhoneAndEmail(String string) {
        xSql = "select count(*) from Users where PhoneNumber = ? or Email = ?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, string);
            ps.setString(2, string);
            rs = ps.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                return false;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }

}
