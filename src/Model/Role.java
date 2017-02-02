package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */

@Entity @Table
public class Role extends MDAO implements Serializable {
    
    @Id @GeneratedValue
    private int RoleId;
    private String RoleName;

    public Role(int RoleId, String RoleName) {
        this.RoleId = RoleId;
        this.RoleName = RoleName;
    }

    public Role(String RoleName) {
        this.RoleName = RoleName;
    }

    public Role() {
    }
 
    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int RoleId) {
        this.RoleId = RoleId;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }
}
