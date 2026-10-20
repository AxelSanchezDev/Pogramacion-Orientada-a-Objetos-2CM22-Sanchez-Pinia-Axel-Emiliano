package com.mycompany.ejercicio1punto2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable{
    @FXML TextArea txtBilletes;
    @FXML TextArea txtNumBilletes;
    @FXML TextField txtDinero;

    @FXML
    private void btnDesglosar_Click() throws IOException {
        int dineroPersona = Integer.parseInt(txtDinero.getText());
        int[] denominaciones = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        String listaNombres = 
            "Billetes de $500\n" +
            "Billetes de $200\n" +
            "Billetes de $100\n" +
            "Billetes de $50\n" +
            "Billetes de $20\n" +
            "Monedas de $10\n" +
            "Monedas de $5\n" +
            "Monedas de $2\n" +
            "Monedas de $1";
        String listaCantidades = "";
        for (int i = 0; i < denominaciones.length; i++) {
            int cantidad = dineroPersona / denominaciones[i];
            dineroPersona = dineroPersona % denominaciones[i];

            listaCantidades += cantidad + "\n";
        }
        txtBilletes.setText(listaNombres);
        txtNumBilletes.setText(listaCantidades);
    }
    
    
    @FXML
    private void btnBorrar_Click() throws IOException {
        txtDinero.clear();
        txtBilletes.clear();
        txtNumBilletes.clear();
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
    }
}
