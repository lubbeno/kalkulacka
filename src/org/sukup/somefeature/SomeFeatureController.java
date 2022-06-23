package org.sukup.somefeature;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

public class SomeFeatureController {

    @FXML
    private Label userName;
    @FXML
    private Label operatingSystem;
    @FXML
    private Label homeDir;
    @FXML
    private Label processorLevel;

    private MyList myList = new MyList();

    public void initialize() {
       Map<String,String> mapa=  System.getenv();

        myList.setUserName(mapa.get("USERNAME"));
        myList.setOperatingSystem(mapa.get("OS"));
        myList.setHomeDir(mapa.get("HOMEPATH"));
        System.out.println();
        myList.setProcessorLevel(mapa.get("PROCESSOR_LEVEL"));
    }

    @FXML
    public void setParameters() {
        processorLevel.setText(String.valueOf(myList.getProcessorLevel()));
        userName.setText(myList.getUserName());
        homeDir.setText(myList.getHomeDir());
        operatingSystem.setText(myList.getOperatingSystem());
    }
}
