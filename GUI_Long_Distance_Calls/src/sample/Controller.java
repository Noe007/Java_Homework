package sample;


import javafx.scene.control.*;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


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

    ToggleGroup group = new ToggleGroup();

    @FXML
    void initialize() {

        planA.setToggleGroup(group);
        planB.setToggleGroup(group);
        planC.setToggleGroup(group);

    }

    @FXML
    void process(ActionEvent event) {
        RadioButton selectedToggle = (RadioButton) group.getSelectedToggle();
        //to change to two decimal points

        switch (selectedToggle.getId()){
//Promt user with the total of their
            case "planA":
                STATP(0.07);
                break;
            case "planB":
                STATP(0.12);
                break;
            case "planC":
                STATP(0.05);
                break;

            default:
            /*
           Todo: do something by default like a fix price by default or something
             */
                break;
        }

    }

    public void STATP(Double charge){
       // Set Text Accounrding To Plan (STATP)
        DecimalFormat df = new DecimalFormat("#.##");
        total.setText("$" + df.format((
                charge * Double.parseDouble(minutes.getText()

                )

        )));

    }
}
