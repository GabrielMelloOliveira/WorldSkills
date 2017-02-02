package Controller;

import Main.BMRcalculator;
import OthersCodes.OpenViews;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class BMRcalculatorController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private ImageView img_male, img_female;

    @FXML private TextField tf_height, tf_weight, tf_age;

    @FXML private Button btn_calculate, btn_cancel;
    
    @FXML private Label lb_bmr;
    
    private double BMR;
    
    private char gender;
    
    void update_bmr(){
        lb_bmr.setText(String.valueOf(BMR));
    }
    
    void calculate(){
     
        double weight = Double.valueOf(tf_weight.getText()); 
        double height = Double.valueOf(tf_height.getText());
        int    age    = Integer.valueOf(tf_age.getText());
        
        if (gender == 'm') {
            
            //Male
            //BMR = 66 + (13.7 x weight) + (5 x height) - (6.8 x age)
            BMR = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
            update_bmr();
            
        }else if(gender == 'f'){
          
            //Female
            //BMR =  65.5 + (9.6 x weight) + (1.8 x height) - (4.7 x age)
            BMR =  65.5 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
            update_bmr();
            
        }
        
    }
    
    void cancel(){
        
    }
 
    void action_buttons(){
        btn_calculate.setOnMouseClicked(s -> calculate());
        btn_cancel.setOnMouseClicked(s -> cancel());
        
        img_male.setOnMouseClicked(s -> gender = 'm');
        img_female.setOnMouseClicked(s -> gender = 'f');
        
        btn_back.setOnMouseClicked(s -> {OpenViews.openview_FindOutMore();
            BMRcalculator.getStage().close();
        });
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        action_buttons();
    }    
    
}
