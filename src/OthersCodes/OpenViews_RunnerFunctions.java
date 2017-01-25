package OthersCodes;

import Main.RunnerFunctions.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.Stage;

/**
 *
 * @author Gabriel
 */
public class OpenViews_RunnerFunctions {
 
    public static void openview_EditProfile(){
        
        EditProfile screen = new EditProfile();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_RunnerFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_MyResults(){
        
        MyResults screen = new MyResults();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_RunnerFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_MySponsorship(){
        
        MySponsorship screen = new MySponsorship();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_RunnerFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_RegisterforEvent(){
        
        RegisterforEvent screen = new RegisterforEvent();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_RunnerFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_RunnerMenu(){
        
        RunnerMenu screen = new RunnerMenu();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_RunnerFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_RunnerRegistration(){
        
        RunnerRegistration screen = new RunnerRegistration();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_RunnerFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_RunnerRegistrationConfirmation(){
        
        RunnerRegistrationConfirmation screen = new RunnerRegistrationConfirmation();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_RunnerFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
