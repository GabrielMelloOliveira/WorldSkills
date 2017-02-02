package Model;

import java.io.Serializable;
import java.time.LocalDate;
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
public class Runner extends MDAO implements Serializable {
    
    @Id @GeneratedValue
    private int RunnerId;
    @ManyToOne
    private User Email;
    @ManyToOne
    private Gender Gender;
    private LocalDate DateofBirth;
    @ManyToOne
    private Country Country;

    public Runner(int RunnerId, User Email, Gender Gender, LocalDate DateofBirth, Country Country) {
        this.RunnerId = RunnerId;
        this.Email = Email;
        this.Gender = Gender;
        this.DateofBirth = DateofBirth;
        this.Country = Country;
    }

    public Runner(User Email, Gender Gender, LocalDate DateofBirth, Country Country) {
        this.Email = Email;
        this.Gender = Gender;
        this.DateofBirth = DateofBirth;
        this.Country = Country;
    }

    public Runner() {
    }

    public int getRunnerId() {
        return RunnerId;
    }

    public void setRunnerId(int RunnerId) {
        this.RunnerId = RunnerId;
    }

    public User getEmail() {
        return Email;
    }

    public void setEmail(User Email) {
        this.Email = Email;
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender Gender) {
        this.Gender = Gender;
    }

    public LocalDate getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(LocalDate DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    public Country getCountry() {
        return Country;
    }

    public void setCountry(Country Country) {
        this.Country = Country;
    }
    
}
