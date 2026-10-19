package com.danielamar.controldegastossemanales;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    @FXML private TextField txtTotalSemanal;
    @FXML private TextField txtGastoMasAlto;

    @FXML
    private void calcularEstadisticas() {
        int alimentacion = Integer.parseInt(txtAlimentacion.getText());
        int transporte = Integer.parseInt(txtTransporte.getText());
        int telefonia = Integer.parseInt(txtTelefonia.getText());
        int otros = Integer.parseInt(txtOtros.getText());
        ControlDeGastos control = new ControlDeGastos(alimentacion, transporte, telefonia, otros);

        txtTotalSemanal.setText(String.valueOf(control.getTotalSemanal()));
        txtGastoMasAlto.setText(control.getGastoMasAlto());
    }

    @FXML
    private void limpiarPantalla() {
        txtAlimentacion.setText("");
        txtTransporte.setText("");
        txtTelefonia.setText("");
        txtOtros.setText("");
        txtTotalSemanal.setText("");
        txtGastoMasAlto.setText("");
    }
}
