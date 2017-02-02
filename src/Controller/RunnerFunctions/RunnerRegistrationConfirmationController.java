package Controller.RunnerFunctions;

import Main.RunnerFunctions.RunnerRegistrationConfirmation;
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
public class RunnerRegistrationConfirmationController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;
    
    @FXML private Button btn_ok;
    
    void OK(){
        
    }
    
    void action_buttons(){
        btn_ok.setOnMouseClicked(s -> OK());
        btn_back.setOnMouseClicked(s -> {
            RunnerRegistrationConfirmation.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            RunnerRegistrationConfirmation.getStage().close();
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
