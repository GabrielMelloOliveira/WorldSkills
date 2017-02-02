package Controller;

import Main.CheckRunner;
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
public class How_LongController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    void action_buttons(){
        
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
