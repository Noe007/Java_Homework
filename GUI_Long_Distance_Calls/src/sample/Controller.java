package sample;


import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private ResourceBundle resources;

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
    private Button summit;

    @FXML
    private Label total;
/*
    @FXML

    public void  process(ActionEvent event){
        System.out.println("hi");

        if(planA.selectedProperty().get()){
System.out.println("hi a");


 }else if(planB.selectedProperty().get()){

 }else if(planB.selectedProperty().get()){

 }else{
     //Todo: let the user known that she hasn't specify a tottle
 }

    }
*/

    @FXML
    void process(ActionEvent event) {
    }

}
