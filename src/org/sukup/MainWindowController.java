package org.sukup;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Objects;

public class MainWindowController {

    private Double cisloNaUlozeni;
    private String ccoBudemePocitat;
    private boolean vypocitane;

    @FXML
    TextField displayKalkulacky;

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

    }

    @FXML
    public void c(){
        displayKalkulacky.setText("");
    }

    @FXML
    public void napisCislo(ActionEvent a) {
        if(vypocitane){
            displayKalkulacky.setText("");
            vypocitane = false;
        }
        Button tlacidlo = (Button) a.getSource();
        displayKalkulacky.setText(displayKalkulacky.getText().concat(tlacidlo.getText()));

    }

    @FXML
    public void sucet(ActionEvent a) {
        cisloNaUlozeni = Double.parseDouble(displayKalkulacky.getText());
        displayKalkulacky.setText("");
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
        vypocitane = true;
    }

    private void reset() {
        cisloNaUlozeni = 0.0;
    }



    @FXML
    public void udelameNeco(Event e){
        Button button = (Button) e.getSource();
        System.out.println(" tu je text tlacitka co sem zadal " + button.getText());
    }

    @FXML
    public void desatineMiesto(){
      if(!displayKalkulacky.getText().contains(".")){
          displayKalkulacky.setText(displayKalkulacky.getText().concat("."));
      }
    }

    @FXML
    public void sqrt(){
        double x = Double.parseDouble(displayKalkulacky.getText());
        displayKalkulacky.setText(String.valueOf(Math.sqrt(x)));
    }

    @FXML
    public void someFeature() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("somefeature/SomeFeature.fxml")));
        Stage stage = new Stage();
        stage.setTitle("SomeFeature");
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    @FXML
    public void plusMinus(){
        if( displayKalkulacky.getText().charAt(0) == '-') {
            displayKalkulacky.setText(displayKalkulacky.getText().substring(1));
        }else{
            displayKalkulacky.setText("-"+displayKalkulacky.getText());
        }

    }

}
