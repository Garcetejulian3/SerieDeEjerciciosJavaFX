package com.cero.javaejercicio01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ejercicio01 extends Application {

    String nombreUsuario = "Julian";
    @Override
    public void start(Stage primaryStage) throws Exception {

        // creamos el contenedor raiz
        StackPane root = new StackPane();

        // creamos la escena definiendo el alto y el ancho
        Scene scene = new Scene(root,600,400);

        // Configurar el el escenario
        primaryStage.setTitle("Session de : " + nombreUsuario);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show(); // Importante para mostrar




    }
}
