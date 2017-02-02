package Controller.RunnerFunctions;

import Main.RunnerFunctions.RunnerMenu;
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
public class RunnerMenuController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;

    @FXML private Button btn_my_sponsorship, btn_register_event, btn_race_results, 
            btn_contact_information, btn_edit_profile;
    
    void action_buttons(){
        btn_my_sponsorship.setOnMouseClicked(s -> {
            RunnerMenu.getStage().close();
        });
        btn_register_event.setOnMouseClicked(s -> {
            RunnerMenu.getStage().close();
        });
        btn_race_results.setOnMouseClicked(s -> {
            RunnerMenu.getStage().close();
        });
        btn_contact_information.setOnMouseClicked(s -> {
            RunnerMenu.getStage().close();
        });
        btn_edit_profile.setOnMouseClicked(s -> {
            RunnerMenu.getStage().close();
        });
        btn_back.setOnMouseClicked(s -> {
            RunnerMenu.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            RunnerMenu.getStage().close();
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
