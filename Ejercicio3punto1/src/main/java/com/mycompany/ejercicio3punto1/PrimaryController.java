package com.mycompany.ejercicio3punto1;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtClicks;
    @FXML private Button btnContar;
    @FXML private Button btnEsperar;
    @FXML private ProgressBar progressBar;

    private int clicks = 0;

    @FXML
    private void btnContar_Click() {
        clicks++;
        txtClicks.setText(String.valueOf(clicks));
    }

    @FXML
    private void btnEsperar_Click() {
        btnEsperar.setDisable(true);
        progressBar.setProgress(0);

        Thread hilo = new Thread(() -> {
            try {
                for (int i = 1; i <= 100; i++) {
                    Thread.sleep(100);
                    double progreso = i / 100.0;
                    
                    Platform.runLater(() -> {
                        progressBar.setProgress(progreso);
                    });
                }
            } catch (InterruptedException e) {
            } finally {
                Platform.runLater(() -> {
                    btnEsperar.setDisable(false);
                });
            }
        });

        hilo.start();
    }
}