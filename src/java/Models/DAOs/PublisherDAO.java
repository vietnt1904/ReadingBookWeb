/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAOs;

import Models.Entities.Publisher;
import Models.MyDAO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author VIET
 */
public class PublisherDAO extends MyDAO {

    public Publisher getOne(int publisherIDMain) {
        Publisher p = new Publisher();
        xSql = "select * from Publishers where PublisherID = " + publisherIDMain;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int publisherID = rs.getInt("PublisherID");
                String publisherName = rs.getNString("PublisherName");
                String address = rs.getNString("Address");
                String email = rs.getString("Email");
                int establishYear = rs.getInt("EstablishYear");
                String description = rs.getNString("Description");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                Date create_At = rs.getDate("Create_At");

                p = new Publisher(publisherID, publisherName, address, email,
                        establishYear, description, image, create_At);
            }

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return p;
    }

    public void insert(Publisher p) {
        xSql = "insert into Publishers(PublisherName, Address, Email, EstablishYear"
                + ", Description, Image) values (N'" + p.getPublisherName() + "', N'"
                + p.getAddress() + "', N'" + p.getEmail() + "', '" + p.getImage() + "')";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update(Publisher p) {
        xSql = "update Publishers set PublisherName = N'" + p.getPublisherName()
                + "', Address = N'" + p.getAddress() + "', Email = N'"
                + p.getEmail() + "', Image = '" + p.getImage()
                + "' where PublisherID = " + p.getPublisherID();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public List<Publisher> getAllPublishers(){
        List<Publisher> lists = new ArrayList<>();
        xSql = "select * from Publishers";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int publisherID = rs.getInt("PublisherID");
                String publisherName = rs.getNString("PublisherName");
                String address = rs.getNString("Address");
                String email = rs.getString("Email");
                int establishYear = rs.getInt("EstablishYear");
                String description = rs.getNString("Description");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                Date create_At = rs.getDate("Create_At");

                Publisher p = new Publisher(publisherID, publisherName, address, email,
                        establishYear, description, image, create_At);
                lists.add(p);
            }

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

}
