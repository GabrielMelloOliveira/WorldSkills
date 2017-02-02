package Controller;

import DAO.DAO;
import Model.User;
import static OthersCodes.OpenViews.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Gabriel Mello de Oliveira
 */

public class LoginScreenController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private TextField tf_email_address;

    @FXML private PasswordField pf_password;
    
    @FXML private Button btn_login, btn_cancel;

    void login(){
     
        if (tf_email_address.getText().isEmpty() || pf_password.getText().isEmpty()) {
            
            //Alert
            
        } else {
            
            DAO dao = new DAO();
            ObservableList <User> list = (ObservableList <User>) dao.getList_User();
            
            for (User user : list) {
               if(user.getEmail().equals(tf_email_address.getText()) && user.getPassword().equals(pf_password.getText())){
                  
                   
                   
               }    
            }
            
        }
        
    }
    
    void cancel(){
        
    }
    
    void action_buttons(){
        btn_login.setOnMouseClicked(s -> login());
        btn_cancel.setOnMouseClicked(s -> cancel());
        btn_back.setOnMouseClicked(s -> openview_MainScreen());
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
