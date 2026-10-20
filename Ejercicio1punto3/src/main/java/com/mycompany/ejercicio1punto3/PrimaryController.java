package com.mycompany.ejercicio1punto3;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtNumero;
    @FXML private TextField txtCantCif;
    @FXML private TextField txtSumCifImp;
    @FXML private TextField txtSumCifPar;
    @FXML private TextField txtSumTot;
    @FXML private TextField txtCM;
    @FXML private TextField txtCm;
    @FXML private TextArea txtDivisores;

    @FXML
    private void btnAnalizar_Click() {
        int num = Integer.parseInt(txtNumero.getText());
        int num1 = num;

        int contCifras = 0;
        int sumaImpares = 0;
        int sumaPares = 0;
        int sumaTotal = 0;
        int cifraMayor = 0;
        int cifraMenor = 9;

        while (num1 > 0) {
            int digito = num1 % 10;
            contCifras++;
            sumaTotal = sumaTotal + digito;

            if (digito % 2 == 0) {
                sumaPares = sumaPares + digito;
            } else {
                sumaImpares = sumaImpares + digito;
            }

            if (digito > cifraMayor) {
                cifraMayor = digito;
            }
            if (digito < cifraMenor) {
                cifraMenor = digito;
            }

            num1 = num1 / 10; 
        }

        String listaDivisores = "";
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                listaDivisores = listaDivisores + i + "\n";
            }
        }

        txtCantCif.setText(String.valueOf(contCifras));
        txtSumCifImp.setText(String.valueOf(sumaImpares));
        txtSumCifPar.setText(String.valueOf(sumaPares));
        txtSumTot.setText(String.valueOf(sumaTotal));
        txtCM.setText(String.valueOf(cifraMayor));
        txtCm.setText(String.valueOf(cifraMenor));
        txtDivisores.setText(listaDivisores);
    }

    @FXML
    private void btnLimpiar_Click() {
        txtNumero.clear();
        txtCantCif.clear();
        txtSumCifImp.clear();
        txtSumCifPar.clear();
        txtSumTot.clear();
        txtCM.clear();
        txtCm.clear();
        txtDivisores.clear();
    }
}