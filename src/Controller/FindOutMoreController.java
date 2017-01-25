package Controller;

import OthersCodes.OpenViews;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class FindOutMoreController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_previous_race, btn_list_charities, btn_bmr_calculator, 
            btn_back, btn_how_long, btn_bmi_calculator, btn_marathon_skills;
    
    void action_buttons(){
        btn_previous_race.setOnMouseClicked(s -> OpenViews.openview_Previous_Results());
        btn_list_charities.setOnMouseClicked(s -> OpenViews.openview_List_Charities());
        //btn_bmr_calculator.setOnMouseClicked(s -> OpenViews.);
        btn_how_long.setOnMouseClicked(s -> OpenViews.openview_How_Long());
        //btn_bmi_calculator.setOnMouseClicked(s -> OpenViews.);
        btn_marathon_skills.setOnMouseClicked(s -> OpenViews.openview_About_MS());
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
