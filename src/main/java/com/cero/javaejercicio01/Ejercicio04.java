package com.cero.javaejercicio01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio04 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox();
        Label textoPr = new Label("Prueba de formulario");
        Button botonAccept = new Button("Aceptar");
        Scene escenario = new Scene(root,600,400);

        // Logica del boton para que haga algo
        botonAccept.setOnAction(e -> System.out.println("El boton funciona"));


        root.getChildren().addAll(textoPr,botonAccept);
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);

        primaryStage.setTitle("Prueba de formulario");
        primaryStage.setScene(escenario);
        primaryStage.setResizable(false);
        primaryStage.show(); // Importante para mostrar
    }
}
