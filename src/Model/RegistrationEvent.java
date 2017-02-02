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
public class RegistrationEvent extends MDAO implements Serializable {
    
    @Id @GeneratedValue
    private int RegistrationEventId;
    @ManyToOne
    private Registration Registration;
    @ManyToOne
    private Event Event;
    private int BibNumber;
    private int RaceTime;

    public RegistrationEvent() {
    }
  
    public RegistrationEvent(Registration Registration, Event Event, int BibNumber, int RaceTime) {
        this.Registration = Registration;
        this.Event = Event;
        this.BibNumber = BibNumber;
        this.RaceTime = RaceTime;
    }
 
    public RegistrationEvent(int RegistrationEventId, Registration Registration, Event Event, int BibNumber, int RaceTime) {
        this.RegistrationEventId = RegistrationEventId;
        this.Registration = Registration;
        this.Event = Event;
        this.BibNumber = BibNumber;
        this.RaceTime = RaceTime;
    }

    public int getRegistrationEventId() {
        return RegistrationEventId;
    }

    public void setRegistrationEventId(int RegistrationEventId) {
        this.RegistrationEventId = RegistrationEventId;
    }

    public Registration getRegistration() {
        return Registration;
    }

    public void setRegistration(Registration Registration) {
        this.Registration = Registration;
    }

    public Event getEvent() {
        return Event;
    }

    public void setEvent(Event Event) {
        this.Event = Event;
    }

    public int getBibNumber() {
        return BibNumber;
    }

    public void setBibNumber(int BibNumber) {
        this.BibNumber = BibNumber;
    }

    public int getRaceTime() {
        return RaceTime;
    }

    public void setRaceTime(int RaceTime) {
        this.RaceTime = RaceTime;
    }
}
