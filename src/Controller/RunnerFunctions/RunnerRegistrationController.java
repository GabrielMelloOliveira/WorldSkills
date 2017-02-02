package Controller.RunnerFunctions;

import DAO.DAO;
import Main.RunnerFunctions.RunnerRegistration;
import Model.Country;
import Model.Gender;
import Model.Role;
import Model.Runner;
import Model.User;
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
public class RunnerRegistrationController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private TextField tf_first_name, tf_last_name, tf_email_address;

    @FXML private ComboBox<Gender> cb_gender;

    @FXML private ComboBox<Country> cb_country;
    
    @FXML private DatePicker dp_date_birth;
    
    @FXML private PasswordField pf_password, pf_password_again;

    @FXML private Button btn_register, btn_cancel;
    
    void init_combobox(){
        DAO dao = new DAO();
        cb_gender.getItems().addAll(dao.getList_Gender());
        dao = new DAO();
        cb_country.getItems().addAll(dao.getList_Country());
    }
    
    void register(){
     
        if (tf_email_address.getText().isEmpty() || tf_first_name.getText().isEmpty() || tf_last_name.getText().isEmpty() ||
            dp_date_birth.getValue().equals(null) || pf_password.getText().isEmpty() || pf_password_again.getText().isEmpty() || cb_country.getSelectionModel().isEmpty() || cb_gender.getSelectionModel().isEmpty()) {
            
            //Alert
            
        }else{
            
            if(pf_password.getText().equals(pf_password_again.getText())){
                User user = new User(tf_email_address.getText(), pf_password.getText(), tf_first_name.getText(), tf_last_name.getText(), new Role("Role"));

                Runner runner = new Runner(user, cb_gender.getSelectionModel().getSelectedItem(), dp_date_birth.getValue(), cb_country.getSelectionModel().getSelectedItem());

                DAO dao = new DAO();
                dao.add(runner);

                //Alert
            }
        }
        
    }
    
    void cancel(){
        OpenViews.openview_CheckRunner();
        RunnerRegistration.getStage().close();
    }
    
    void action_buttons(){
        btn_register.setOnMouseClicked(s -> register());
        btn_cancel.setOnMouseClicked(s -> cancel());
        btn_back.setOnMouseClicked(s -> {OpenViews.openview_CheckRunner();
            RunnerRegistration.getStage().close();
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
