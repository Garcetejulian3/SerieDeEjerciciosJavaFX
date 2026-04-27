package com.cero.javaejercicio01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio05 extends Application {
    String saludo;
    @Override
    public void start(Stage primaryStage) throws Exception {

        // Root y nodos hijos
        Label textName = new Label("Ingresar Nombre");
        TextField campoNombre = new TextField();
        Button botonSaludo = new Button("Saludar");
        Label textSaludo = new Label();

        // Logica del saludo
        botonSaludo.setOnAction(e -> {
            if (campoNombre.getText() == null || campoNombre.getText().trim().isEmpty() ){
                // Creamos la alerta de tipo ADVERTENCIA
                Alert alerta = new Alert(Alert.AlertType.WARNING);
                alerta.setTitle("Campo obligatorio ingrese un nombre");
                alerta.setHeaderText(null); // Opcional: puedes poner un subtítulo aquí
                alerta.setContentText("Por favor, ingresa un texto antes de continuar.");
                // La mostramos y esperamos a que el usuario presione OK
                alerta.showAndWait();

            }else {
                saludo = campoNombre.getText();
                textSaludo.setText("Saludando a " + saludo);
            }
        });


        VBox root = new VBox();
        root.getChildren().addAll(textName,campoNombre,botonSaludo,textSaludo);
        root.setSpacing(20);
        root.setAlignment(Pos.CENTER);

        //Escenario principal
        Scene scene = new Scene(root,500,350);
        primaryStage.setTitle("Prueba de formulario");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show(); // Importante para mostrar
    }


}
