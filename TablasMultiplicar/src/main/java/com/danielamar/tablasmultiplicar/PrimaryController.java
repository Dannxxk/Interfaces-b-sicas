package com.danielamar.tablasmultiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextArea txtAreaTabla;

    @FXML
    private void calcularTablas() {
        int numero = Integer.parseInt(txtNumero.getText());
        Tablas tablasObj = new Tablas(numero);

        txtAreaTabla.setText(tablasObj.generarTabla());
    }

    @FXML
    private void limpiarPantalla() {
        txtNumero.setText("");
        txtAreaTabla.setText("");
    }
}