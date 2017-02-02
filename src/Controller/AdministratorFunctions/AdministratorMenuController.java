package Controller.AdministratorFunctions;

import Main.AdministratorFunctions.AdministratorMenu;
import OthersCodes.OpenViews;
import OthersCodes.OpenViews_AdministratorFunctions;
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
public class AdministratorMenuController implements Initializable {
    
    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;
    
    @FXML private Button btn_volunteers, btn_charities, btn_inventory, btn_users;

    void inventory(){
        
    }
    
    void action_buttons(){
        btn_volunteers.setOnMouseClicked(s -> {OpenViews_AdministratorFunctions.openview_VolunteerManagement();
            AdministratorMenu.getStage().close();
        });
        btn_charities.setOnMouseClicked(s -> {OpenViews_AdministratorFunctions.openview_ManageCharities();
            AdministratorMenu.getStage().close();
        });
        btn_inventory.setOnMouseClicked(s -> inventory());
        btn_users.setOnMouseClicked(s -> {OpenViews_AdministratorFunctions.openview_UserManagement();
            AdministratorMenu.getStage().close();
        });
        btn_back.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            AdministratorMenu.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            AdministratorMenu.getStage().close();
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
