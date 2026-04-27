package com.cero.javaejercicio01.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PerfilController {

    // Esta anotación vincula la variable con el fx:id del FXML
    @FXML
    private Button btnHola;

    // Esta anotación vincula el método con el onAction del FXML
    @FXML
    void saludar() {
        System.out.println("¡Hola desde Scene Builder!");
        btnHola.setText("¡Presionado!");
    }
}
