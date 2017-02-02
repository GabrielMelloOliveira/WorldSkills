package Controller.RunnerFunctions;

import Main.RunnerFunctions.MyResults;
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
public class MyResultsController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;

    @FXML private Label lb_gender, lb_age;

    @FXML private Button btn_view_results;
    
    void action_buttons(){
        btn_view_results.setOnMouseClicked(s -> {
            MyResults.getStage().close();
        });
        btn_back.setOnMouseClicked(s -> {
            MyResults.getStage().close();
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
