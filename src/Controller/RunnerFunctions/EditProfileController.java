package Controller.RunnerFunctions;

import DAO.DAO;
import Main.RunnerFunctions.EditProfile;
import OthersCodes.OpenViews;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class EditProfileController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;
    
    @FXML private Label lb_email;
    
    @FXML private TextField tf_first_name, tf_last_name;
    
    @FXML private ComboBox<?> cb_gender;

    @FXML private ComboBox<?> cb_country;
    
    @FXML private DatePicker dp_birth;

    @FXML private PasswordField pf_password, pf_password_again;
    
    @FXML private Button btn_save, btn_cancel;
    
    void init_combobox(){
        
    }
    
    void update_label(){
        lb_email.setText("");   
    }
    
    void save(){
     
        /*if () {
            
            //Alert
            
        } else {
            
            
            
            DAO dao = new DAO();
            dao.add();
            
            //Alert
        }*/
        
    }
    
    void cancel(){
        
    }
    
    void action_buttons(){
        btn_save.setOnMouseClicked(s -> save());
        btn_cancel.setOnMouseClicked(s -> cancel());
        btn_back.setOnMouseClicked(s -> {
            EditProfile.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            EditProfile.getStage().close();
        });
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        init_combobox();
        action_buttons();
    }    
    
}
