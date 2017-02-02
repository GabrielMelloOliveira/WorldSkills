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
public class Staff extends MDAO implements Serializable {
    
    @Id @GeneratedValue
    private int StaffId;
    private String FirstName;
    private String LastName;
    private LocalDate DateofBirth;
    @ManyToOne
    private Gender Gender;
    @ManyToOne
    private Position Position;
    private String Comments;

    public Staff(int StaffId, String FirstName, String LastName, LocalDate DateofBirth, Gender Gender, Position Position, String Comments) {
        this.StaffId = StaffId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateofBirth = DateofBirth;
        this.Gender = Gender;
        this.Position = Position;
        this.Comments = Comments;
    }

    public Staff(String FirstName, String LastName, LocalDate DateofBirth, Gender Gender, Position Position, String Comments) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateofBirth = DateofBirth;
        this.Gender = Gender;
        this.Position = Position;
        this.Comments = Comments;
    }

    public Staff() {
    }

    public int getStaffId() {
        return StaffId;
    }

    public void setStaffId(int StaffId) {
        this.StaffId = StaffId;
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

    public LocalDate getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(LocalDate DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender Gender) {
        this.Gender = Gender;
    }

    public Position getPosition() {
        return Position;
    }

    public void setPosition(Position Position) {
        this.Position = Position;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }
}
