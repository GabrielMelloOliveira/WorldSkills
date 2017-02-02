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
public class Country extends MDAO implements Serializable {
 
    @Id @GeneratedValue
    private String CountryCode;
    private String CountryName;
    private String CountryFlag;

    public Country() {
    }

    public Country(String CountryCode, String CountryName, String CountryFlag) {
        this.CountryCode = CountryCode;
        this.CountryName = CountryName;
        this.CountryFlag = CountryFlag;
    }
    
    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public String getCountryFlag() {
        return CountryFlag;
    }

    public void setCountryFlag(String CountryFlag) {
        this.CountryFlag = CountryFlag;
    }
    
}
