/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAOs;

import Models.Entities.Publisher;
import Models.MyDAO;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author VIET
 */
public class PublisherDAO extends MyDAO{
    
    
    public Publisher getOne(int publisherIDMain){
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
                
                p = new Publisher(publisherID, publisherName, address, email
                        , establishYear, description, image, create_At);
            }
            
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return p;
    }
    
}
