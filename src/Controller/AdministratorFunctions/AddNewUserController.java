package Controller.AdministratorFunctions;

import DAO.DAO;
import Main.AdministratorFunctions.AddNewUser;
import Model.Role;
import Model.User;
import OthersCodes.OpenViews;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class AddNewUserController implements Initializable {
    
    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;

    @FXML private Button btn_save, btn_cancel;

    @FXML private TextField tf_email, tf_first_name, tf_last_name;

    @FXML private ComboBox<Role> cb_role;
    
    @FXML private PasswordField pf_password, pf_password_again;
    
    void init_combobox(){
        DAO dao = new DAO();
        cb_role.getItems().addAll(dao.getList_Role());
    }
    
    void save(){
     
        if (tf_email.getText().isEmpty() || tf_first_name.getText().isEmpty() || tf_last_name.getText().isEmpty() ||
            pf_password.getText().isEmpty() || pf_password_again.getText().isEmpty() || cb_role.getSelectionModel().isEmpty()) {
            
            //Alert
            
        } else {
            
            if (pf_password.getText().equals(pf_password_again.getText())) {
                
                User user = new User(tf_email.getText(), pf_password.getText(), tf_first_name.getText(), tf_last_name.getText(),
                                     cb_role.getSelectionModel().getSelectedItem());
                
                DAO dao = new DAO();
                dao.add(user);
                
                //Alert
                
            }
            
            //Alert
        }
        
    }
    
    void cancel(){
        OpenViews.openview_MainScreen();
        AddNewUser.getStage().close();
    }
    
    void action_buttons(){
        btn_save.setOnMouseClicked(s -> save());
        btn_cancel.setOnMouseClicked(s -> cancel());
        btn_back.setOnMouseClicked(s -> {
            AddNewUser.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            AddNewUser.getStage().close();
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
