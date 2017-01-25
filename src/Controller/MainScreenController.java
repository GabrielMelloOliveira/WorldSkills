package Controller;

import OthersCodes.OpenViews;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author User
 */
public class MainScreenController implements Initializable {
    
    @FXML private Label time_marathon;

    @FXML private Button btn_findmore, btn_register_runner, btn_login, btn_sponsor_runner;

    void action_buttons(){
        btn_findmore.setOnMouseClicked(s -> OpenViews.openview_FindOutMore());
        btn_register_runner.setOnMouseClicked(s -> OpenViews.openview_SponsorshipConfirmation());
        btn_sponsor_runner.setOnMouseClicked(s -> OpenViews.openview_SponsorRunner());
        btn_login.setOnMouseClicked(s -> OpenViews.openview_LoginScreen());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        action_buttons();
    }    
    
}
