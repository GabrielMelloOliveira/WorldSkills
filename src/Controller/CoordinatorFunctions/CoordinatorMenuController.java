package Controller.CoordinatorFunctions;

import Main.CoordinatorFunctions.CoordinatorMenu;
import OthersCodes.OpenViews;
import OthersCodes.OpenViews_CoordinatorFunctions;
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
public class CoordinatorMenuController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;
    
    @FXML private Button btn_runners, btn_sponsorship;
    
    void action_buttons(){
        btn_runners.setOnMouseClicked(s -> {OpenViews_CoordinatorFunctions.openview_RunnerManagement();
            CoordinatorMenu.getStage().close();
        });
        btn_sponsorship.setOnMouseClicked(s -> {OpenViews_CoordinatorFunctions.openview_Sponsorship();
            CoordinatorMenu.getStage().close();
        });
        btn_back.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            CoordinatorMenu.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            CoordinatorMenu.getStage().close();
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
