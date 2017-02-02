package Controller.AdministratorFunctions;

import Main.AdministratorFunctions.UserManagement;
import Model.Role;
import Model.User;
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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class UserManagementController implements Initializable {
    
    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;
    
    @FXML private Button btn_add_user;

    @FXML private ComboBox<Role> cb_role;

    @FXML private ComboBox<?> cb_sort;

    @FXML private TextField tf_search;

    @FXML private Button btn_refresh;
    
    @FXML private Label lb_total_users;

    @FXML private TableView<User> table;
    
    @FXML private TableColumn<?, ?> col_first_name, col_last_name, col_email, col_role, col_edit;
 
    void init_table(){
        
    }
    
    void update_table(){
        
    }
    
    void refresh(){
        
    }
    
    void action_buttons(){
        btn_refresh.setOnMouseClicked(s -> refresh());
        btn_add_user.setOnMouseClicked(s -> {OpenViews_AdministratorFunctions.openview_AddNewUser();
            UserManagement.getStage().close();
        });
        btn_back.setOnMouseClicked(s -> {OpenViews_AdministratorFunctions.openview_AdministratorMenu();
            UserManagement.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            UserManagement.getStage().close();
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
