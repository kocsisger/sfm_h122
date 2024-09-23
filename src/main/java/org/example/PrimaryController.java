package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    Label korte;
    //Sanyi

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void test(){
        System.out.println("Alma");
        korte.setText("Szilva");
    }
}
