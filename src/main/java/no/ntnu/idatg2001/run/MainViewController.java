package no.ntnu.idatg2001.run;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainViewController {

    @FXML
    private Button dealHandButton;

    @FXML
    private Button checkButtonID;

    @FXML
    void dealAHandToThePlayer(ActionEvent event) {
        System.out.println("Hei");
    }

}
