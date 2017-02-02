package Controller.AdministratorFunctions;

import DAO.DAO;
import Main.AdministratorFunctions.AddEditCharity;
import Model.Charity;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class AddEditCharityController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_logout;

    @FXML private TextField tf_charity_name;

    @FXML private TextArea tf_description;

    @FXML private TextField tf_logo;

    @FXML private Button btn_logo;

    @FXML private ImageView img_logo;

    @FXML private Button btn_save;
    
    @FXML private Button btn_cancel;
    
    private String img;
    
    void add_logo(){  
        
    }
    
    void save(){
     
        if (tf_charity_name.getText().isEmpty() || tf_description.getText().isEmpty() || img.isEmpty()) {
            
            //Alert
            
        } else {
            
            Charity charity = new Charity(tf_charity_name.getText(), tf_description.getText(), img);
            
            DAO dao = new DAO();
            dao.add(charity);
            
            //Alert
        }
        
    }
    
    void cancel(){
        
    }
    
    void action_buttons(){
        btn_logo.setOnMouseClicked(s -> add_logo());
        btn_save.setOnMouseClicked(s -> save());
        btn_cancel.setOnMouseClicked(s -> cancel());
        btn_back.setOnMouseClicked(s -> {
            AddEditCharity.getStage().close();
        });
        btn_logout.setOnMouseClicked(s -> {
            AddEditCharity.getStage().close();
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
