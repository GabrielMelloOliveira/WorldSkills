package OthersCodes;

import Main.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.Stage;

/**
 *
 * @author Gabriel
 */
public class OpenViews {
 
    public static void openview_About_MS(){
        
        About_MS screen = new About_MS();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void openview_BMIcalculator(){
        
        BMIcalculator screen = new BMIcalculator();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_BMRcalculator(){
        
        BMRcalculator screen = new BMRcalculator();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_CheckRunner(){
        
        CheckRunner screen = new CheckRunner();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_FindOutMore(){
        
        FindOutMore screen = new FindOutMore();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_How_Long(){
        
        How_Long screen = new How_Long();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_Interactive_Map(){
        
        Interactive_Map screen = new Interactive_Map();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_List_Charities(){
        
        List_Charities screen = new List_Charities();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_LoginScreen(){
        
        LoginScreen screen = new LoginScreen();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_MainScreen(){
        
        MainScreen screen = new MainScreen();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_Previous_Results(){
        
        Previous_Results screen = new Previous_Results();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_SponsorRunner(){
        
        SponsorRunner screen = new SponsorRunner();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void openview_SponsorshipConfirmation(){
        
        SponsorshipConfirmation screen = new SponsorshipConfirmation();
        
        try {
            screen.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(OpenViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
