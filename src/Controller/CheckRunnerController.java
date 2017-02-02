package Controller;

import Main.CheckRunner;
import OthersCodes.OpenViews;
import OthersCodes.OpenViews_RunnerFunctions;
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
public class CheckRunnerController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_competed_before, btn_new_competitor, btn_login;
    
    void login(){
        OpenViews.openview_LoginScreen();
        CheckRunner.getStage().close();
    }
    
    void action_buttons(){
        btn_competed_before.setOnMouseClicked(s -> login());
        btn_login.setOnMouseClicked(s -> login());
        btn_new_competitor.setOnMouseClicked(s -> {OpenViews_RunnerFunctions.openview_RunnerRegistration();
            CheckRunner.getStage().close();
        });
        btn_back.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            CheckRunner.getStage().close();
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
