package com.mycompany.ejercicio1punto1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    @FXML TextField txtFecha;
    @FXML Label lblEdad;
       
    @FXML
    private void btnCalcular_Click() {
        String fechaUser = txtFecha.getText();
        DateTimeFormatter entrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaUser, entrada);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int anios = periodo.getYears();
        int meses = periodo.getMonths();
        lblEdad.setText("Tiene " + anios + " años con " + meses + " meses");
    }
    @FXML
    private void btnLimpiar_Click() {
        txtFecha.clear();
        lblEdad.setText("");
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}
