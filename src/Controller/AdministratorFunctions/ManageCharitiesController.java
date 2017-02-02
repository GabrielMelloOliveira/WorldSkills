package Controller.AdministratorFunctions;

import Main.AdministratorFunctions.ManageCharities;
import Model.Charity;
import OthersCodes.OpenViews_AdministratorFunctions;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class ManageCharitiesController implements Initializable {
    
    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_add_charity;

    @FXML private TableColumn<?, ?> col_logo, col_name, col_description, col_edit;

    @FXML private TableView<Charity> table;
    
    void init_table(){
        
    }
    
    void action_buttons(){
        btn_add_charity.setOnMouseClicked(s -> {OpenViews_AdministratorFunctions.openview_AddEditCharity();
            ManageCharities.getStage().close();
        });
        btn_back.setOnMouseClicked(s -> {OpenViews_AdministratorFunctions.openview_AdministratorMenu();
            ManageCharities.getStage().close();
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
