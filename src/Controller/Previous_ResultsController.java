package Controller;

import DAO.DAO;
import Main.Previous_Results;
import Model.*;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Gabriel
 */
public class Previous_ResultsController implements Initializable {

    @FXML private Label time_marathon;

    @FXML private Button btn_back;
    
    @FXML private Button btn_search;

    @FXML private ComboBox<Gender> cb_gender;

    @FXML private ComboBox<Marathon> cb_marathon;

    @FXML private ComboBox<Event> cb_race_event;
    
    @FXML private ComboBox<String> cb_age_category;
    
    @FXML private TableView<Runner> table;
    
    @FXML private TableColumn<?, ?> col_rank, col_racetime, col_runnername, col_country;

    @FXML private Label lb_total_runners, lb_total_runners_finished, lb_average_race_time;

    int total_runners, total_runners_finished;
    
    String age;
    
    void init_table(){
        
    }
    
    void update_table(){
        
    }
    
    void update_label(){
        lb_total_runners.setText(String.valueOf(total_runners));
        lb_total_runners_finished.setText(String.valueOf(total_runners_finished));
        lb_average_race_time.setText("h m s");
    }
    
    void init_combobox(){
        cb_age_category.getItems().addAll("Under 18", "18 to 29", "30 to 39", "40 to 55", "56 to 70", "Over 70");
        DAO dao = new DAO();
        cb_marathon.getItems().addAll(dao.getList_Marathon());
        DAO dao2 = new DAO();
        cb_gender.getItems().addAll(dao2.getList_Gender());
        DAO dao3 = new DAO();
        cb_race_event.getItems().addAll(dao3.getList_Event());
    }
    
    void search(){
     
        age = cb_age_category.getSelectionModel().getSelectedItem();
        
        switch(age){
            
            case "Under 18":
                
                break;
            case "18 to 29":
                
                break;
            case "30 to 39":
                
                break;
            case "40 to 55":
                
                break;
            case "56 to 70":
                
                break;
            case "Over 70":
                
                break;    
            
        }
        
    }
    
    void action_buttons(){
        btn_search.setOnMouseClicked(s-> search());
        btn_back.setOnMouseClicked(s-> {OpenViews.openview_FindOutMore();
            Previous_Results.getStage().close();
        });
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        init_combobox();
        init_table();
        action_buttons();
    }    
    
}
