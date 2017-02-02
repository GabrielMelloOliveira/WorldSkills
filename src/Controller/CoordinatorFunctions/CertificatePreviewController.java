package Controller.CoordinatorFunctions;

import Main.CoordinatorFunctions.CertificatePreview;
import OthersCodes.OpenViews;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class CertificatePreviewController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;
    
    @FXML private ComboBox<String> cb_race_event;
    
    @FXML private Label lb_inf, lb_location, lb_charity;

    void update_inf(){
        
    }
    
    void action_buttons(){
        cb_race_event.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

            }
        });
        
        btn_back.setOnMouseClicked(s -> {
            CertificatePreview.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            CertificatePreview.getStage().close();
        });
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        update_inf();
        action_buttons();
    }    
    
}
