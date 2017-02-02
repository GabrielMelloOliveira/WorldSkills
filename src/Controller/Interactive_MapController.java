package Controller;

import Main.Interactive_Map;
import OthersCodes.OpenViews;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class Interactive_MapController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
 
    @FXML private ImageView point_1, point_2, point_3, point_4, point_5, point_6, point_7, point_8;

    @FXML private AnchorPane anchor_checkpoint;

    @FXML private Label btn_exit;

    @FXML private Label lb_checkpoint;

    private boolean anchor_visible;
    
    void checkpoint(int checkpoint_number){
        lb_checkpoint.setText("Checkpoint " + checkpoint_number);
    }
    
    void exit_checkpoint(){
        if (anchor_visible) {
            anchor_visible = false;
            anchor_checkpoint.setVisible(true);
        }else{
            anchor_visible = true;
            anchor_checkpoint.setVisible(false);
        }
    }
    
    void action_checkpoints(){
        point_1.setOnMouseClicked(s -> checkpoint(1));
        point_2.setOnMouseClicked(s -> checkpoint(2));
        point_3.setOnMouseClicked(s -> checkpoint(3));
        point_4.setOnMouseClicked(s -> checkpoint(4));
        point_5.setOnMouseClicked(s -> checkpoint(5));
        point_6.setOnMouseClicked(s -> checkpoint(6));
        point_7.setOnMouseClicked(s -> checkpoint(7));
        point_8.setOnMouseClicked(s -> checkpoint(8));
    }
    
    void action_buttons(){
        btn_exit.setOnMouseClicked(s -> exit_checkpoint());
        btn_back.setOnMouseClicked(s -> {OpenViews.openview_About_MS();
            Interactive_Map.getStage().close();
        });
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        action_buttons();
        action_checkpoints();
    }    
    
}
