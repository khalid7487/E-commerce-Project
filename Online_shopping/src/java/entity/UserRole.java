package entity;
// Generated 17-Dec-2019 12:58:58 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * UserRole generated by hbm2java
 */
public class UserRole  implements java.io.Serializable {


     private Integer roleId;
     private String roleName;
     private Set shopUsers = new HashSet(0);

    public UserRole() {
    }

	
    public UserRole(String roleName) {
        this.roleName = roleName;
    }
    public UserRole(String roleName, Set shopUsers) {
       this.roleName = roleName;
       this.shopUsers = shopUsers;
    }
   
    public Integer getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public Set getShopUsers() {
        return this.shopUsers;
    }
    
    public void setShopUsers(Set shopUsers) {
        this.shopUsers = shopUsers;
    }




}


