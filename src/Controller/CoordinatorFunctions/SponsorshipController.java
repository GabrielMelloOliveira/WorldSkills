package Controller.CoordinatorFunctions;

import Main.CoordinatorFunctions.Sponsorship;
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
public class SponsorshipController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;
    
    @FXML private TableView<?> table;
    
    @FXML private TableColumn<?, ?> col_logo, col_charity_name, col_total_amount;

    @FXML private ComboBox<?> cb_sort;

    @FXML private Button btn_sort;
    
    @FXML private Label lb_charities, lb_total_sponsorship;

    void init_table(){
        
    }
    
    void update_table(){
        
    }
    
    void init_combobox(){
        
    }
    
    void sort(){
        
    }
    
    void action_buttons(){
        btn_sort.setOnMouseClicked(s -> sort());
        btn_back.setOnMouseClicked(s -> {
            Sponsorship.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            Sponsorship.getStage().close();
        });
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        init_table();
        init_combobox();
        action_buttons();
    }    
    
}
