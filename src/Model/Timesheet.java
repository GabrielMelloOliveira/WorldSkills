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
public class Timesheet extends MDAO implements Serializable {
    
    @Id @GeneratedValue
    private int TimesheetId;
    @ManyToOne
    private Staff Staff;
    private LocalDate StardDateTime;
    private LocalDate EndDateTime;
    private double PayAmount;

    public Timesheet(int TimesheetId, Staff Staff, LocalDate StardDateTime, LocalDate EndDateTime, double PayAmount) {
        this.TimesheetId = TimesheetId;
        this.Staff = Staff;
        this.StardDateTime = StardDateTime;
        this.EndDateTime = EndDateTime;
        this.PayAmount = PayAmount;
    }

    public Timesheet(Staff Staff, LocalDate StardDateTime, LocalDate EndDateTime, double PayAmount) {
        this.Staff = Staff;
        this.StardDateTime = StardDateTime;
        this.EndDateTime = EndDateTime;
        this.PayAmount = PayAmount;
    }

    public Timesheet() {}
 
    public int getTimesheetId() {
        return TimesheetId;
    }

    public void setTimesheetId(int TimesheetId) {
        this.TimesheetId = TimesheetId;
    }

    public Staff getStaff() {
        return Staff;
    }

    public void setStaff(Staff Staff) {
        this.Staff = Staff;
    }

    public LocalDate getStardDateTime() {
        return StardDateTime;
    }

    public void setStardDateTime(LocalDate StardDateTime) {
        this.StardDateTime = StardDateTime;
    }

    public LocalDate getEndDateTime() {
        return EndDateTime;
    }

    public void setEndDateTime(LocalDate EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

    public double getPayAmount() {
        return PayAmount;
    }

    public void setPayAmount(double PayAmount) {
        this.PayAmount = PayAmount;
    }
}
