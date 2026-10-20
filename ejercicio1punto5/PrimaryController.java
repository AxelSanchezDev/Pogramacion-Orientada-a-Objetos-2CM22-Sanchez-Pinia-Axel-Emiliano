package com.mycompany.ejercicio1punto5;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtAlimentacion;
    @FXML TextField txtRefrigerios;
    @FXML TextField txtTransporte;
    @FXML TextField txtTelefonia;
    @FXML TextField txtOtros;
    @FXML TextField txtTotal;
    @FXML TextField txtMasAlto;
    
    
    
    @FXML
    private void btnCalcular_Click () {
        
    double alimentacion = Double.parseDouble(txtAlimentacion.getText());
    double refrigerios = Double.parseDouble(txtRefrigerios.getText());
    double transporte = Double.parseDouble(txtTransporte.getText());
    double telefonia = Double.parseDouble(txtTelefonia.getText());
    double otros = Double.parseDouble(txtOtros.getText());
    
    double gastos[] = {alimentacion, refrigerios, transporte, telefonia, otros};
    String nombres[] = {"Alimentación", "Refrigerios", "Transporte", "Telefonía", "Otros"};
    double total = alimentacion + refrigerios + transporte + telefonia + otros;
    
    
  
    double masAlto = 0;
    int indiceMayor = 0;
    
    for(int i=0; i<gastos.length; i++){
        if(masAlto < gastos[i]){
            masAlto = gastos[i];
            indiceMayor = i;
        }
    } 
    
    txtMasAlto.setText(nombres[indiceMayor]);
    txtTotal.setText(String.valueOf(total));
}
    
    

    
    
    
        
    
    @FXML
    private void btnLimpiar_Click () {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtMasAlto.clear();
    }
}
