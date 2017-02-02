package Controller.CoordinatorFunctions;

import DAO.DAO;
import Main.CoordinatorFunctions.EditRunnerProfile;
import Model.Country;
import Model.Gender;
import Model.RegistrationStatus;
import Model.Runner;
import Model.User;
import OthersCodes.OpenViews;
import OthersCodes.OpenViews_RunnerFunctions;
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
public class EditRunnerProfileController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;
    
    @FXML private Label lb_email;

    @FXML private TextField tf_first_name, tf_last_name;

    @FXML private ComboBox<Gender> cb_gender;
    
    @FXML private DatePicker dp_birth;

    @FXML private ComboBox<Country> Country;

    @FXML private PasswordField pf_password, pf_password_again;
    
    @FXML private ComboBox<RegistrationStatus> cb_status;

    @FXML private Button btn_save, btn_cancel;
    
    void init_label(){
        lb_email.setText("");
    }
    
    void init_combobox(){
        DAO dao = new DAO();
        cb_gender.getItems().addAll(dao.getList_Gender());
        DAO dao2 = new DAO();
        Country.getItems().addAll(dao2.getList_Country());
        DAO dao3 = new DAO();
        cb_status.getItems().addAll(dao3.getList_RegistrationStatus());
    }
    
    void save(){
     
        if (lb_email.getText().isEmpty() || tf_first_name.getText().isEmpty() || tf_last_name.getText().isEmpty() ||
            pf_password.getText().isEmpty() || pf_password_again.getText().isEmpty() || cb_gender.getSelectionModel().isEmpty()
            || Country.getSelectionModel().isEmpty() || cb_status.getSelectionModel().isEmpty() || dp_birth.getValue().equals(null)) {
            
            //Alert
            
        } else {
            
            if (pf_password.getText().equals(pf_password_again.getText())) {
                
                User user = new User();
                user.setFirstName(tf_first_name.getText());
                user.setLastName(tf_last_name.getText());
                user.setPassword(pf_password.getText());
                user.setEmail(lb_email.getText());
                
                Runner runner = new Runner();
                runner.setGender(cb_gender.getSelectionModel().getSelectedItem());
                runner.setDateofBirth(dp_birth.getValue());
                runner.setCountry(Country.getSelectionModel().getSelectedItem());
                runner.setEmail(user);
                
                DAO dao = new DAO();
                dao.update(runner);
                
                //Alert
                
            }
            
            //Alert
        }
        
    }
    
    void cancel(){
        OpenViews_RunnerFunctions.openview_RunnerMenu();
        EditRunnerProfile.getStage().close();
    }
    
    void action_buttons(){
        btn_save.setOnMouseClicked(s -> save());
        btn_cancel.setOnMouseClicked(s -> cancel());
        btn_back.setOnMouseClicked(s -> {OpenViews_RunnerFunctions.openview_RunnerMenu();
            EditRunnerProfile.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            EditRunnerProfile.getStage().close();
        });
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        init_combobox();
        init_label();
        action_buttons();
    }    
    
}
