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
public class RaceKitOption extends MDAO implements Serializable {
   
    @Id @GeneratedValue
    private String RaceKitOptionId;
    private String RaceKitOption;
    private Double RaceKitCost;

    public RaceKitOption() {
    }

    public RaceKitOption(String RaceKitOptionId, String RaceKitOption, Double RaceKitCost) {
        this.RaceKitOptionId = RaceKitOptionId;
        this.RaceKitOption = RaceKitOption;
        this.RaceKitCost = RaceKitCost;
    }

    public String getRaceKitOptionId() {
        return RaceKitOptionId;
    }

    public void setRaceKitOptionId(String RaceKitOptionId) {
        this.RaceKitOptionId = RaceKitOptionId;
    }

    public String getRaceKitOption() {
        return RaceKitOption;
    }

    public void setRaceKitOption(String RaceKitOption) {
        this.RaceKitOption = RaceKitOption;
    }

    public Double getRaceKitCost() {
        return RaceKitCost;
    }

    public void setRaceKitCost(Double RaceKitCost) {
        this.RaceKitCost = RaceKitCost;
    }
    
}
