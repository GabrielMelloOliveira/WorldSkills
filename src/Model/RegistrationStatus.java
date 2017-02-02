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
public class RegistrationStatus extends MDAO implements Serializable {
    
    @Id @GeneratedValue
    private int RegistrationStatusId;
    private String RegistrationStatus;

    public RegistrationStatus(int RegistrationStatusId, String RegistrationStatus) {
        this.RegistrationStatusId = RegistrationStatusId;
        this.RegistrationStatus = RegistrationStatus;
    }

    public RegistrationStatus(String RegistrationStatus) {
        this.RegistrationStatus = RegistrationStatus;
    }

    public RegistrationStatus() {
    }

    public int getRegistrationStatusId() {
        return RegistrationStatusId;
    }

    public void setRegistrationStatusId(int RegistrationStatusId) {
        this.RegistrationStatusId = RegistrationStatusId;
    }

    public String getRegistrationStatus() {
        return RegistrationStatus;
    }

    public void setRegistrationStatus(String RegistrationStatus) {
        this.RegistrationStatus = RegistrationStatus;
    }
}
