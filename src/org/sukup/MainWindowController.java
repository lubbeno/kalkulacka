package org.sukup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class MainWindowController {

    @FXML
    TextField displayKalkulacky;


    public void initialize() {

        System.out.println("prva vec co sa vykona");
        displayKalkulacky.setText("prva vec co sa vykona");
        System.out.println(LocalDate.now());

    }
}
