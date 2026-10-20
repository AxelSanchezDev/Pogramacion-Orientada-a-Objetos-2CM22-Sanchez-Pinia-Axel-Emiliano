package com.mycompany.ejercicio1punto4;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {
    @FXML private TextField txtNumero;
    @FXML private TextArea txtResultado;
    @FXML private Button btnCalcular;
    @FXML private Button txtLimpiar;

    

    @FXML
    private void btnCalcular_Click() throws IOException {
        int x = Integer.parseInt(txtNumero.getText());
        for(int i = 1; i < 11; i++){
            txtResultado.appendText(x+" x " + i +" = " + x*i +   "\n");
            
 
        }
    }
    @FXML
    private void btnLimpiar_Click() throws IOException {
        txtNumero.setText("");
        txtResultado.setText("");
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}


