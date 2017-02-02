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
public class EventType extends MDAO implements Serializable {
  
    @Id @GeneratedValue
    private String EventTypeId;
    private String EventTypeName;

    public EventType() {
    }

    public EventType(String EventTypeId, String EventTypeName) {
        this.EventTypeId = EventTypeId;
        this.EventTypeName = EventTypeName;
    }

    public String getEventTypeId() {
        return EventTypeId;
    }

    public void setEventTypeId(String EventTypeId) {
        this.EventTypeId = EventTypeId;
    }

    public String getEventTypeName() {
        return EventTypeName;
    }

    public void setEventTypeName(String EventTypeName) {
        this.EventTypeName = EventTypeName;
    }
    
}
