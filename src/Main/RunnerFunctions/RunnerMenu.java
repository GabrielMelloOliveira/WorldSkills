package Main.RunnerFunctions;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Gabriel Mello de Oliveira
 */

public class RunnerMenu extends Application {
    
    public String fxml = "RunnerMenu";
    
    public String title = "";
    
    public String stylesheet = "";
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getResource("/View/" + fxml + ".fxml"));
        
        Scene scene = new Scene(root);
        
        //scene.getStylesheets().add("CSS/" + stylesheet + ".css");
        
        stage.setScene(scene);
        this.stage = stage;
        
        stage.setTitle(title);
        
        stage.show();
    }

    public static Stage stage;
    
    public static Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
 
}
