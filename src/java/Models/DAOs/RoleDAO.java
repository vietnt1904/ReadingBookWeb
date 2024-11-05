/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.DAOs;

import Models.Entities.Role;
import Models.MyDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VIET
 */
public class RoleDAO extends MyDAO {

    public Role getRole(int roleIDMain) {
        xSql = "select * from Roles where RoleID = " + roleIDMain;
        Role role = new Role();

        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int roleID = rs.getInt("RoleID");
                String roleName = rs.getNString("RoleName");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                role = new Role(roleID, roleName, description, create_At);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return role;
    }

    public List<Role> getAllRoles() {
        List<Role> allRoles = new ArrayList<>();
        xSql = "select * from Roles";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int roleID = rs.getInt("RoleID");
                String roleName = rs.getNString("RoleName");
                String description = rs.getNString("Description");
                Date create_At = rs.getDate("Create_At");

                Role role = new Role(roleID, roleName, description, create_At);
                allRoles.add(role);
            }
            ps.close();
            rs.close();
            return allRoles;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return allRoles;
    }
    
    public void insert(Role role){
        xSql = "insert into Role(RoleName, Description) values (N'" + role.getRoleName() 
                + "', N'" + role.getDescription() + "'),";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void update(Role role){
        xSql = "update Roles set RoleName = N'" + role.getRoleName() 
                + "', Description = N'" + role.getDescription() 
                + "' where RoleID = " + role.getRoleID();
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void delete(int roleID){
        xSql = "delete from Roles where RoleID = " + roleID;
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
