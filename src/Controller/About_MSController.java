package Controller;

import Main.About_MS;
import OthersCodes.OpenViews;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class About_MSController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private ImageView img_map;
    
    void action_buttons(){
        img_map.setOnMouseClicked(s -> {OpenViews.openview_Interactive_Map();
            About_MS.getStage().close();
        });
        btn_back.setOnMouseClicked(s -> {OpenViews.openview_FindOutMore();
            About_MS.getStage().close();
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
