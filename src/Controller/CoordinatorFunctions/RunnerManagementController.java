package Controller.CoordinatorFunctions;

import Main.CoordinatorFunctions.RunnerManagement;
import OthersCodes.OpenViews;
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
public class RunnerManagementController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;

    @FXML private Button btn_csv, btn_email_list;
 
    @FXML private ComboBox<?> cb_status;

    @FXML private ComboBox<?> cb_race_event;

    @FXML private ComboBox<?> cb_sort;
    
    @FXML private Button btn_refresh;
    
    @FXML private Label lb_total_runners;
    
    @FXML private TableView<?> table;

    @FXML private TableColumn<?, ?> col_first_name, col_last_name, col_email, col_status, col_edit;
    
    void init_table(){
        
    }
    
    void update_table(){
        
    }
    
    void refresh(){
        
    }
    
    void action_buttons(){
        btn_csv.setOnMouseClicked(s -> refresh());
        btn_email_list.setOnMouseClicked(s -> refresh());
        btn_refresh.setOnMouseClicked(s -> refresh());
        btn_back.setOnMouseClicked(s -> {
            RunnerManagement.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            RunnerManagement.getStage().close();
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
