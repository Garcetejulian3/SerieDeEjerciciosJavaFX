package com.cero.javaejercicio01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ejercicio02 extends Application {
    String nombreUsuario = "Julian";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label etiqueta = new Label("Hola esta es la etiqueta");
        Button boton = new Button("!Haz click aqui");
        // creamos el contenedor raiz
        StackPane root = new StackPane();
        // Anadimos los hijos al nodo raiz
        root.getChildren().addAll(boton,etiqueta);

        // creamos la escena definiendo el alto y el ancho
        Scene scene = new Scene(root,600,400);

        // Configurar el el escenario
        primaryStage.setTitle("Session de : " + nombreUsuario);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show(); // Importante para mostrar
    }
}
