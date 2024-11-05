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
public class Role {
    int roleID;
    String roleName;
    String description;
    Date create_At;

    public Role() {
    }

    public Role(String roleName, String description) {
        this.roleName = roleName;
        this.description = description;
    }

    public Role(int roleID, String roleName, String description, Date create_At) {
        this.roleID = roleID;
        this.roleName = roleName;
        this.description = description;
        this.create_At = create_At;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
