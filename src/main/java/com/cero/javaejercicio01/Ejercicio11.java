package com.cero.javaejercicio01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ejercicio11 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        // 1. Cargamos el archivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/VistaPrincipal.fxml"));
        Parent root = loader.load();

        // 2. Lo ponemos en la escena
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
