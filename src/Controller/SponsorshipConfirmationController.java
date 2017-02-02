package Controller;

import Main.SponsorshipConfirmation;
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
public class SponsorshipConfirmationController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Label lb_runner, lb_money;

    @FXML private Button btn_back2;
    
    void init_scene(){
        lb_runner.setText(SponsorRunnerController.getRunner().getEmail().getFirstName() + " " + SponsorRunnerController.getRunner().getEmail().getLastName());
        lb_money.setText(String.valueOf(SponsorRunnerController.getMoney()));
    }
    
    void back(){
        OpenViews.openview_SponsorRunner();
        SponsorshipConfirmation.getStage().close();
    }
    
    void action_buttons(){
        btn_back.setOnMouseClicked(s -> back());
        btn_back2.setOnMouseClicked(s -> back());
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        init_scene();
        action_buttons();
    }    
    
}
