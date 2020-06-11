package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

public class ControllerDr {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button nextDr;

    @FXML
    private TextField aboutDr;

    @FXML
    void initialize() {
        nextDr.setOnAction(event -> {
            vivod();
        });

    }
    public void vivod(){
        Controller controller = new Controller();
        Controller.drivers arr[] = controller.settdr();

            aboutDr.setText("Водитель: " + arr[counter].getSecondname() + " " + arr[counter].getFirstname() + " " + arr[counter].getMiddlename() + "     " + "Стаж водителя: " + arr[counter].getStage() + " лет");
            counter++;
            if (counter == 4){
                counter = 0;
            }

    }
    int counter = 0;
}
