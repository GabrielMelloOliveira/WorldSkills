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
public class Charity extends MDAO implements Serializable {
 
    @Id @GeneratedValue
    private int CharityId;
    private String CharityName;
    private String CharityDescription;
    private String CharityLogo;

    public Charity(int CharityId, String CharityName, String CharityDescription, String CharityLogo) {
        this.CharityId = CharityId;
        this.CharityName = CharityName;
        this.CharityDescription = CharityDescription;
        this.CharityLogo = CharityLogo;
    }

    public Charity(String CharityName, String CharityDescription, String CharityLogo) {
        this.CharityName = CharityName;
        this.CharityDescription = CharityDescription;
        this.CharityLogo = CharityLogo;
    }

    public Charity() {
    }

    public int getCharityId() {
        return CharityId;
    }

    public void setCharityId(int CharityId) {
        this.CharityId = CharityId;
    }

    public String getCharityName() {
        return CharityName;
    }

    public void setCharityName(String CharityName) {
        this.CharityName = CharityName;
    }

    public String getCharityDescription() {
        return CharityDescription;
    }

    public void setCharityDescription(String CharityDescription) {
        this.CharityDescription = CharityDescription;
    }

    public String getCharityLogo() {
        return CharityLogo;
    }

    public void setCharityLogo(String CharityLogo) {
        this.CharityLogo = CharityLogo;
    }
    
}
