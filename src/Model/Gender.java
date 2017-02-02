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
public class Gender extends MDAO implements Serializable {
 
    @Id @GeneratedValue
    private String Gender;

    public Gender() {
    }

    public Gender(String Gender) {
        this.Gender = Gender;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
}
