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
public class Event extends MDAO implements Serializable {
    
    @Id @GeneratedValue
    private String EventId;
    private String EventName;
    @ManyToOne
    private EventType EventType;
    @ManyToOne
    private Marathon Marathon;
    private LocalDate StartDateTime;
    private double Cost;
    private long MaxParticipants;

    public Event(String EventId, String EventName, EventType EventType, Marathon Marathon, LocalDate StartDateTime, double Cost, long MaxParticipants) {
        this.EventId = EventId;
        this.EventName = EventName;
        this.EventType = EventType;
        this.Marathon = Marathon;
        this.StartDateTime = StartDateTime;
        this.Cost = Cost;
        this.MaxParticipants = MaxParticipants;
    }

    public Event(String EventName, EventType EventType, Marathon Marathon, LocalDate StartDateTime, double Cost, long MaxParticipants) {
        this.EventName = EventName;
        this.EventType = EventType;
        this.Marathon = Marathon;
        this.StartDateTime = StartDateTime;
        this.Cost = Cost;
        this.MaxParticipants = MaxParticipants;
    }

    public Event() {
    }  
    
    public String getEventId() {
        return EventId;
    }

    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    public EventType getEventType() {
        return EventType;
    }

    public void setEventType(EventType EventType) {
        this.EventType = EventType;
    }

    public Marathon getMarathon() {
        return Marathon;
    }

    public void setMarathon(Marathon Marathon) {
        this.Marathon = Marathon;
    }

    public LocalDate getStartDateTime() {
        return StartDateTime;
    }

    public void setStartDateTime(LocalDate StartDateTime) {
        this.StartDateTime = StartDateTime;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    public long getMaxParticipants() {
        return MaxParticipants;
    }

    public void setMaxParticipants(long MaxParticipants) {
        this.MaxParticipants = MaxParticipants;
    }
  
}
