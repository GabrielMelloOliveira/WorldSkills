package OthersCodes;

import Main.CoordinatorFunctions.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.Stage;

/**
 *
 * @author Gabriel
 */
public class OpenViews_CoordinatorFunctions {
 
    public static void openview_CertificatePreview(){
        
        CertificatePreview screen = new CertificatePreview();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_CoordinatorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_CoordinatorMenu(){
        
        CoordinatorMenu screen = new CoordinatorMenu();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_CoordinatorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_EditRunnerProfile(){
        
        EditRunnerProfile screen = new EditRunnerProfile();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_CoordinatorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_ManageRunner(){
        
        ManageRunner screen = new ManageRunner();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_CoordinatorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_RunnerManagement(){
        
        RunnerManagement screen = new RunnerManagement();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_CoordinatorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_Sponsorship(){
        
        Sponsorship screen = new Sponsorship();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews_CoordinatorFunctions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
