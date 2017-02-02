package OthersCodes;

import Main.AdministratorFunctions.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.Stage;

/**
 *
 * @author Gabriel
 */
public class OpenViews_AdministratorFunctions {
 
    public static void openview_AddEditCharity(){
        
        AddEditCharity screen = new AddEditCharity();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_AdministratorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_AddNewUser(){
        
        AddNewUser screen = new AddNewUser();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_AdministratorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_AdministratorMenu(){
        
        AdministratorMenu screen = new AdministratorMenu();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_AdministratorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_EditUser(){
        
        EditUser screen = new EditUser();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_AdministratorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_ImportVolunteers(){
        
        ImportVolunteers screen = new ImportVolunteers();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_AdministratorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_ManageCharities(){
        
        ManageCharities screen = new ManageCharities();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_AdministratorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_UserManagement(){
        
        UserManagement screen = new UserManagement();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_AdministratorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_VolunteerManagement(){
        
        VolunteerManagement screen = new VolunteerManagement();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_AdministratorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
