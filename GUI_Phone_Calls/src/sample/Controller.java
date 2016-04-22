package sample;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    ToggleGroup group = new ToggleGroup();

    @FXML
    private URL location;

    @FXML
    private TextField minutes;

    @FXML
    private RadioButton planA;

    @FXML
    private RadioButton planB;

    @FXML
    private RadioButton planC;

    @FXML
    private Label total;

    @FXML
    void initialize() {
     planA.setToggleGroup(group);
     planB.setToggleGroup(group);
     planC.setToggleGroup(group);
    }



    public void onInputMethodTextChanged(ActionEvent event){
    }
}
