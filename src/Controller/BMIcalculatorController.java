package Controller;

import Main.BMIcalculator;
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
public class BMIcalculatorController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private ImageView img_male, img_female;

    @FXML private TextField tf_height, tf_weight;

    @FXML private Button btn_calculate, btn_cancel;
    
    @FXML private Label lb_bmi1, lb_bmi2, lb_bmi3, lb_bmi4;
    
    @FXML private ImageView img_1, img_2, img_3, img_4;
    
    private double BMI;
    
    void clear_bmi(){
        lb_bmi1.setText(""); 
        lb_bmi2.setText("");
        lb_bmi3.setText(""); 
        lb_bmi4.setText("");
        
        img_1.setVisible(false); 
        img_2.setVisible(false); 
        img_3.setVisible(false);
        img_4.setVisible(false);
    }
    
    void update_bmi(){
        
        clear_bmi();
        
        if(BMI < 18.5){
            
            //Underweight
            lb_bmi1.setText(String.valueOf(BMI));
            img_1.setVisible(false);
            
        }else if(BMI >= 18.5 && BMI <= 24.9){
            
            //Healthy
            lb_bmi2.setText(String.valueOf(BMI));
            img_2.setVisible(false);
            
        }else if(BMI >= 25 && BMI <= 29.9){
            
            //Overweight
            lb_bmi3.setText(String.valueOf(BMI));
            img_3.setVisible(false);
            
        }else if(BMI > 30){
            
            //Obese
            lb_bmi4.setText(String.valueOf(BMI));
            img_4.setVisible(false);
            
        }
    }
    
    void calculate(){
    
        double weight = Double.valueOf(tf_weight.getText()); 
        double height = Double.valueOf(tf_height.getText()); 
        
        //BMI = weight / (height x height)
        BMI = weight / (height * height);
        
        update_bmi();
        
    }
    
    void cancel(){
        
    }
    
    void action_buttons(){
        btn_calculate.setOnMouseClicked(s -> calculate());
        btn_cancel.setOnMouseClicked(s -> cancel());
        btn_back.setOnMouseClicked(s -> {OpenViews.openview_FindOutMore();
            BMIcalculator.getStage().close();
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
