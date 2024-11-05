/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAOs;

import Models.Entities.Author;
import Models.MyDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author VIET
 */
public class AuthorDAO extends MyDAO {

    public Author getOne(int authorIDMain) {
        Author author = new Author();
        xSql = "select * from Authors where AuthorID = " + authorIDMain;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int authorID = rs.getInt("AuthorID");
                String authorName = rs.getNString("AuthorName");
                int birthYear = rs.getInt("BirthYear");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                author = new Author(authorID, authorName, birthYear, image, description, create_At);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return author;
    }

    public void insert(Author a) {
        xSql = "insert into Authors(AuthorName, BirthYear, Image, Description) "
                + "values (N'" + a.getAuthorName() + "', " + a.getBirthYear()
                + ", '" + a.getImage() + "', N'" + a.getDescription() + "')";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update(Author a) {
        xSql = "update Authors set AuthorName = N'" + a.getAuthorName()
                + "', BirthYear = " + a.getBirthYear() + ", Image = '" 
                + a.getImage() + "', Description = N'" + a.getDescription() + "')";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public List<Author> getAllAuthors(){
        List<Author> lists = new ArrayList<>();
        xSql = "select * from Authors";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int authorID = rs.getInt("AuthorID");
                String authorName = rs.getNString("AuthorName");
                int birthYear = rs.getInt("BirthYear");
                String image = "data:image/jpeg;base64," + rs.getString("Image");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                Author author = new Author(authorID, authorName, birthYear, image, description, create_At);
                lists.add(author);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

}
