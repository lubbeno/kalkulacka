package org.sukup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class MainWindowController {

    private Long cisloNaUlozeni;
    private String ccoBudemePocitat;


    @FXML
    TextField displayKalkulacky;

    public void napisNulu() {
        System.out.println("0");
        displayKalkulacky.getText();
        displayKalkulacky.setText(displayKalkulacky.getText().concat("0"));
    }


    @FXML
    void napisDoKonzoly() {
        System.out.println(displayKalkulacky.getText());

        //displayKalkulacky.setText("neco");
    }


    @FXML
    public void akciaJedna() {
        System.out.println("akcia jedna");
    }


    public void initialize() {

        System.out.println("prva vec co sa vykona");
        displayKalkulacky.setText("prva vec co sa vykona");
        System.out.println(LocalDate.now());

    }

    @FXML
    public void napisCislo(ActionEvent a) {
        Button tlacidlo = (Button) a.getSource();
        displayKalkulacky.setText(displayKalkulacky.getText().concat(tlacidlo.getText()));

    }

    @FXML
    public void sucet(ActionEvent a) {
        cisloNaUlozeni = Long.parseLong(displayKalkulacky.getText());
        displayKalkulacky.setText("0");
        Button tlacidlo = (Button) a.getSource();
        ccoBudemePocitat = tlacidlo.getText();
    }

    @FXML
    public void vysledok() {

        switch (ccoBudemePocitat) {
            case "+":
                cisloNaUlozeni = cisloNaUlozeni + Long.parseLong(displayKalkulacky.getText());
                displayKalkulacky.setText(cisloNaUlozeni.toString());
                reset();
                break;
            case "-":
                cisloNaUlozeni = cisloNaUlozeni - Long.parseLong(displayKalkulacky.getText());
                displayKalkulacky.setText(cisloNaUlozeni.toString());
                reset();
                break;
            case "*":
                cisloNaUlozeni = cisloNaUlozeni * Long.parseLong(displayKalkulacky.getText());
                displayKalkulacky.setText(cisloNaUlozeni.toString());
                reset();
                break;
            case "/":
                cisloNaUlozeni = cisloNaUlozeni / Long.parseLong(displayKalkulacky.getText());
                displayKalkulacky.setText(cisloNaUlozeni.toString());
                reset();
                break;

        }

    }


    private void reset() {
        cisloNaUlozeni = 0L;

    }

}
