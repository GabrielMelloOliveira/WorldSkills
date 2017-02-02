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
public class Sponsorship extends MDAO implements Serializable {
    
   @Id @GeneratedValue
   private int SponsorshipId;
   private String SponsorshipName;
   @ManyToOne
   private Registration Registration;
   private double Amount;

    public Sponsorship(int SponsorshipId, String SponsorshipName, Registration Registration, double Amount) {
        this.SponsorshipId = SponsorshipId;
        this.SponsorshipName = SponsorshipName;
        this.Registration = Registration;
        this.Amount = Amount;
    }

    public Sponsorship(String SponsorshipName, Registration Registration, double Amount) {
        this.SponsorshipName = SponsorshipName;
        this.Registration = Registration;
        this.Amount = Amount;
    }

    public Sponsorship() {
    }

    public int getSponsorshipId() {
        return SponsorshipId;
    }

    public void setSponsorshipId(int SponsorshipId) {
        this.SponsorshipId = SponsorshipId;
    }

    public String getSponsorshipName() {
        return SponsorshipName;
    }

    public void setSponsorshipName(String SponsorshipName) {
        this.SponsorshipName = SponsorshipName;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public Registration getRegistration() {
        return Registration;
    }

    public void setRegistration(Registration Registration) {
        this.Registration = Registration;
    }
    
}
