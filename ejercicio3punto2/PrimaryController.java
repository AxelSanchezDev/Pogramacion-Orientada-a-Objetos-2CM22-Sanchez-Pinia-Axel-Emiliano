package com.mycompany.ejercicio3punto2;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {

    @FXML private Button btnIniciar;
    @FXML private ProgressBar progressLiebre;
    @FXML private ProgressBar progressTortuga;
    @FXML private Label lblEstadoLiebre;
    @FXML private Label lblEstadoTortuga;

    @FXML
    private void btnIniciar_Click() {
        btnIniciar.setDisable(true);
        progressLiebre.setProgress(0);
        progressTortuga.setProgress(0);

        Thread liebre = new Thread(() -> {
            try {
                for (int i = 1; i <= 100; i++) {
                    Thread.sleep(80);
                    double p = i / 100.0;
                    
                    if (i == 50) {
                        Platform.runLater(() -> lblEstadoLiebre.setText("Se durmió"));
                        Thread.sleep(3500);
                    } else if (i == 51) {
                        Platform.runLater(() -> lblEstadoLiebre.setText("Corriendo"));
                    }
                    
                    Platform.runLater(() -> progressLiebre.setProgress(p));
                    
                    if (i == 100) {
                        Platform.runLater(() -> lblEstadoLiebre.setText("Llegó"));
                    }
                }
            } catch (Exception e) {
            }
        });

        Thread tortuga = new Thread(() -> {
            try {
                Platform.runLater(() -> lblEstadoTortuga.setText("Corriendo"));
                for (int i = 1; i <= 100; i++) {
                    Thread.sleep(110);
                    double p = i / 100.0;
                    
                    Platform.runLater(() -> progressTortuga.setProgress(p));
                    
                    if (i == 100) {
                        Platform.runLater(() -> lblEstadoTortuga.setText("Ganó"));
                    }
                }
                Platform.runLater(() -> btnIniciar.setDisable(false));
            } catch (Exception e) {
            }
        });

        liebre.start();
        tortuga.start();
    }
}