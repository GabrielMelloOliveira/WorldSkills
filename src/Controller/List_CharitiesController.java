package Controller;

import Main.List_Charities;
import OthersCodes.OpenViews;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class List_CharitiesController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private VBox vbox;
    
    void init_list(){
        
    }
    
    void action_buttons(){
        btn_back.setOnMouseClicked(s -> {OpenViews.openview_FindOutMore();
            List_Charities.getStage().close();
        });
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        init_list();
        action_buttons();
    }    
    
}
