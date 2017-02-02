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
public class Volunteer extends MDAO implements Serializable {
    
    @Id @GeneratedValue
    private int VolunteerId;
    private String FirstName;
    private String LastName;
    @ManyToOne
    private Country Country;
    @ManyToOne
    private Gender Gender;

    public Volunteer(int VolunteerId, String FirstName, String LastName, Country Country, Gender Gender) {
        this.VolunteerId = VolunteerId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Country = Country;
        this.Gender = Gender;
    }

    public Volunteer(String FirstName, String LastName, Country Country, Gender Gender) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Country = Country;
        this.Gender = Gender;
    }

    public Volunteer() {
    }
  
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getVolunteerId() {
        return VolunteerId;
    }

    public void setVolunteerId(int VolunteerId) {
        this.VolunteerId = VolunteerId;
    }

    public Country getCountry() {
        return Country;
    }

    public void setCountry(Country Country) {
        this.Country = Country;
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender Gender) {
        this.Gender = Gender;
    }
   
}
