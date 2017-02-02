package Controller.RunnerFunctions;

import Main.RunnerFunctions.RegisterforEvent;
import OthersCodes.OpenViews;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class RegisterforEventController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;
    
    @FXML private CheckBox check_42, check_21, check_5;

    @FXML private RadioButton Radio_A, Radio_B, Radio_C;
    
    @FXML private TextField tf_charity, tf_target;

    @FXML private Button btn_register, btn_cancel;
    
    @FXML private Label lb_cost;
    
    private int cost;
    
    void update_cost(){
        lb_cost.setText("$" + String.valueOf(cost));
    }
    
    void register(){
        
    }
    
    void cancel(){
        
    }
    
    void action_buttons(){
        btn_register.setOnMouseClicked(s -> register());
        btn_cancel.setOnMouseClicked(s -> cancel());
        btn_back.setOnMouseClicked(s -> {
            RegisterforEvent.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            RegisterforEvent.getStage().close();
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
