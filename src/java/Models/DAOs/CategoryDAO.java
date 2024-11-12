/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAOs;

import Models.Entities.Category;
import Models.MyDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author VIET
 */
public class CategoryDAO extends MyDAO {

    public Category getOne(int cateID) {
        Category category = new Category();
        xSql = "select * from Categories where CategoryID = " + cateID;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int categoryID = rs.getInt("CategoryID");
                String categoryName = rs.getNString("CategoryName");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                category = new Category(categoryID, categoryName, description, create_At);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return category;
    }

    public void insert(Category c) {
        xSql = "insert into Categories(CategoryName, Description) values (N'"
                + c.getCategoryName() + "', N'" + c.getDescription() + "')";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void update(Category c) {
        xSql = "update Categories set CategoryName = N'" + c.getCategoryName() 
                + "', Description = N'" + c.getDescription() 
                + "' where CategoryID = " + c.getCategoryID();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void delete(int cateID) {
        xSql = "delete from Categories where CategoryID = " + cateID;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();

            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public List<Category> getAllCategories(){
        List<Category> lists = new ArrayList<>();
        xSql = "select * from Categories";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int categoryID = rs.getInt("CategoryID");
                String categoryName = rs.getNString("CategoryName");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                Category category = new Category(categoryID, categoryName, description, create_At);
                lists.add(category);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lists;
    }

}
