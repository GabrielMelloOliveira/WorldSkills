package Controller.AdministratorFunctions;

import Main.AdministratorFunctions.VolunteerManagement;
import Model.Volunteer;
import OthersCodes.OpenViews;
import OthersCodes.OpenViews_AdministratorFunctions;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class VolunteerManagementController implements Initializable {
    
    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;

    @FXML private ComboBox<?> cb_sort;
    
    @FXML private Button btn_refresh;

    @FXML private Button btn_import_volunteers;

    @FXML private TableView<Volunteer> table;
    
    @FXML private Label lb_total_volunteers;
    
    @FXML private TableColumn<?, ?> col_first_name, col_last_name, col_country, col_gender;

    void init_table(){
        
    }
    
    void update_table(){
        
    }
    
    void refresh(){
        
    }
    
    void action_buttons(){
        btn_refresh.setOnMouseClicked(s -> refresh());
        btn_import_volunteers.setOnMouseClicked(s -> {OpenViews_AdministratorFunctions.openview_ImportVolunteers();
            VolunteerManagement.getStage().close();
        });
        btn_back.setOnMouseClicked(s -> {OpenViews_AdministratorFunctions.openview_AdministratorMenu();
            VolunteerManagement.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            VolunteerManagement.getStage().close();
        });
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        init_table();
        action_buttons();
    }    
    
}
