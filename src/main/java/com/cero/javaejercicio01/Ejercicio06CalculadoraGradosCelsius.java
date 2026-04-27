package com.cero.javaejercicio01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ejercicio06CalculadoraGradosCelsius extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // root y sus elementos
        GridPane panelRoot = new GridPane();

        Label textCelsius = new Label("0,0");
        TextField entradaCel = new TextField("1,0");
        Button botonCalc = new Button("Convertir");
        Label resultado = new Label();

        // Llamando a la logica del boton para calcular
        botonCalc.setOnAction(e -> calcular(entradaCel,resultado));

        // Anadiendo los nodos hijos al rootpanel
        panelRoot.setHgap(10);
        panelRoot.setVgap(10);
        panelRoot.setAlignment(Pos.CENTER);
        panelRoot.add(textCelsius,0,0);
        panelRoot.add(entradaCel,0,1);
        panelRoot.add(botonCalc,1,0);
        panelRoot.add(resultado,1,1);



        Scene scene = new Scene(panelRoot,250,250);
        // Configurar el el escenario
        primaryStage.setTitle("Calculadora Conversor de Temperatura");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show(); // Importante para mostrar
    }

    // Logica para el calculo cuando se toca el boton de Convertir del panel
    private void calcular(TextField entradaCel, Label resultado) {
        try {
            // las variables del metodo
            double temperatura = Double.parseDouble(entradaCel.getText().replace(",", "."));
            double resultadoF = (temperatura * 1.8) + 32;


            resultado.setText(String.format("%.2f °F", resultadoF));

        } catch (NumberFormatException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de entrada");
            alerta.setHeaderText(null);
            alerta.setContentText("Por favor, ingresa solo números.");
            alerta.showAndWait();

            entradaCel.clear(); // Limpia el cuadro de texto
            entradaCel.requestFocus(); // Pone el cursor listo para escribir
            resultado.setText("Entrada inválida");
        }
    }
}
