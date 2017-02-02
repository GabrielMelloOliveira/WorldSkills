package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Gabriel
 */

@Entity @Table
public class Marathon extends MDAO implements Serializable {
    
    @Id @GeneratedValue
    private long MarathonId;
    private String MarathonName;
    private String CityName;
    @ManyToOne
    private Country Country;
    private int YearHeld;

    public Marathon() {
    }

    public Marathon(long MarathonId, String MarathonName, String CityName, Country Country, int YearHeld) {
        this.MarathonId = MarathonId;
        this.MarathonName = MarathonName;
        this.CityName = CityName;
        this.Country = Country;
        this.YearHeld = YearHeld;
    }

    public Marathon(String MarathonName, String CityName, Country Country, int YearHeld) {
        this.MarathonName = MarathonName;
        this.CityName = CityName;
        this.Country = Country;
        this.YearHeld = YearHeld;
    }

    public long getMarathonId() {
        return MarathonId;
    }

    public void setMarathonId(long MarathonId) {
        this.MarathonId = MarathonId;
    }

    public String getMarathonName() {
        return MarathonName;
    }

    public void setMarathonName(String MarathonName) {
        this.MarathonName = MarathonName;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public Country getCountry() {
        return Country;
    }

    public void setCountry(Country Country) {
        this.Country = Country;
    }

    public int getYearHeld() {
        return YearHeld;
    }

    public void setYearHeld(int YearHeld) {
        this.YearHeld = YearHeld;
    }
    
}
