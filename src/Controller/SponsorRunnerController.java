package Controller;

import DAO.DAO;
import Main.SponsorRunner;
import Model.Runner;
import OthersCodes.OpenViews;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class SponsorRunnerController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private TextField tf_name, tf_cvc, tf_name_card, tf_credit_card;
    
    @FXML private TextField tf_expiry_date_month;
    
    @FXML private TextField tf_expiry_date_year;
    
    @FXML private ComboBox<Runner> cb_runner;

    @FXML private Label lb_money;

    @FXML private TextField tf_money;
    
    @FXML private Button more_money, less_money;

    @FXML private Button btn_pay_now, btn_cancel;

    public static double money = 0;

    public static double getMoney() {
        return money;
    }
    
    public static Runner runner;
    
    public static Runner getRunner() {
        return runner;
    }
    
    void init_combobox(){
        DAO dao = new DAO();
        cb_runner.getItems().addAll(dao.getList_Runner());
    }
    
    void update_comp(){
        lb_money.setText("$" + money);
        tf_money.setText("$" + money);
    }
    
    void paynow(){
        
        if (tf_name.getText().isEmpty() || tf_cvc.getText().isEmpty() || tf_name_card.getText().isEmpty() || 
            tf_credit_card.getText().isEmpty() || tf_expiry_date_month.getText().isEmpty() || tf_expiry_date_year.getText().isEmpty()) {
            
            //Alert
            
        } else {
            
            money = Double.valueOf(tf_money.getText());
            runner = cb_runner.getSelectionModel().getSelectedItem();
            
            //Alert
            
            OpenViews.openview_SponsorshipConfirmation();
            
            SponsorRunner.getStage().close();
            
        }
        
    }
    
    void cancel(){
        OpenViews.openview_MainScreen();
        SponsorRunner.getStage().close();
    }
    
    void more_money(){
        money += 10;
        update_comp();
    }
    
    void less_money(){
        if(money >= 10){
            money -= 10;
            update_comp();
        }
    }
    
    void action_buttons(){
        btn_pay_now.setOnMouseClicked(s -> paynow());
        btn_cancel.setOnMouseClicked(s -> cancel());
        more_money.setOnMouseClicked(s -> more_money());
        less_money.setOnMouseClicked(s -> less_money());
        btn_back.setOnMouseClicked(s -> {OpenViews.openview_MainScreen();
            SponsorRunner.getStage().close();
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
