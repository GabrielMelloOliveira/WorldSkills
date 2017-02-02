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
public class Registration extends MDAO implements Serializable {
  
    @Id @GeneratedValue
    private int RegistrationId;
    @ManyToOne
    private Runner Runner;
    private LocalDate RegistrationDateTime;
    @ManyToOne
    private RaceKitOption RaceKitOption;
    @ManyToOne
    private RegistrationStatus RegistrationStatus;
    private double Cost;
    @ManyToOne
    private Charity Charity;
    private double SponsorshipTarget;

    public Registration(int RegistrationId, Runner Runner, LocalDate RegistrationDateTime, RaceKitOption RaceKitOption, RegistrationStatus RegistrationStatus, double Cost, Charity Charity, double SponsorshipTarget) {
        this.RegistrationId = RegistrationId;
        this.Runner = Runner;
        this.RegistrationDateTime = RegistrationDateTime;
        this.RaceKitOption = RaceKitOption;
        this.RegistrationStatus = RegistrationStatus;
        this.Cost = Cost;
        this.Charity = Charity;
        this.SponsorshipTarget = SponsorshipTarget;
    }

    public Registration(Runner Runner, LocalDate RegistrationDateTime, RaceKitOption RaceKitOption, RegistrationStatus RegistrationStatus, double Cost, Charity Charity, double SponsorshipTarget) {
        this.Runner = Runner;
        this.RegistrationDateTime = RegistrationDateTime;
        this.RaceKitOption = RaceKitOption;
        this.RegistrationStatus = RegistrationStatus;
        this.Cost = Cost;
        this.Charity = Charity;
        this.SponsorshipTarget = SponsorshipTarget;
    }

    public Registration() {
    }

    public int getRegistrationId() {
        return RegistrationId;
    }

    public void setRegistrationId(int RegistrationId) {
        this.RegistrationId = RegistrationId;
    }

    public Runner getRunner() {
        return Runner;
    }

    public void setRunner(Runner Runner) {
        this.Runner = Runner;
    }

    public LocalDate getRegistrationDateTime() {
        return RegistrationDateTime;
    }

    public void setRegistrationDateTime(LocalDate RegistrationDateTime) {
        this.RegistrationDateTime = RegistrationDateTime;
    }

    public RaceKitOption getRaceKitOption() {
        return RaceKitOption;
    }

    public void setRaceKitOption(RaceKitOption RaceKitOption) {
        this.RaceKitOption = RaceKitOption;
    }

    public RegistrationStatus getRegistrationStatus() {
        return RegistrationStatus;
    }

    public void setRegistrationStatus(RegistrationStatus RegistrationStatus) {
        this.RegistrationStatus = RegistrationStatus;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    public Charity getCharity() {
        return Charity;
    }

    public void setCharity(Charity Charity) {
        this.Charity = Charity;
    }

    public double getSponsorshipTarget() {
        return SponsorshipTarget;
    }

    public void setSponsorshipTarget(double SponsorshipTarget) {
        this.SponsorshipTarget = SponsorshipTarget;
    }
    
    
    
}
