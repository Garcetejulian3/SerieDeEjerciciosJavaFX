package com.cero.javaejercicio01;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio07FormularioDatos extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // elementos visuales
        VBox rootPrincipal = new VBox();
        HBox rootHorizontal = new HBox();

        // BOTONES
        Button botonGuardado = new Button("GUARDAR");
        Button botonEliminar = new Button("CLEAR");



        // NODO HORIZONTAL
        rootHorizontal.getChildren().addAll(botonGuardado,botonEliminar);
        rootHorizontal.setSpacing(30);
        rootHorizontal.setAlignment(Pos.CENTER);

        // NODO GRIDPANE FORMULARIO
        GridPane panelForm = new GridPane();
        panelForm.setAlignment(Pos.CENTER);

        Label labelNombre = new Label("Ingresar su nombre");
        Label labelApellido = new Label("Ingresar su apellido");
        Label labelDni = new Label("Ingresar su DNI");
        Label labelContrasena = new Label("Ingresar su contrasena");

        TextField inputNombre = new TextField();
        TextField inputApellido = new TextField();
        TextField inputDni = new TextField();
        PasswordField inputContrasena = new PasswordField();

        panelForm.add(labelNombre,0,0);
        panelForm.add(labelApellido,1,0);
        panelForm.add(labelDni,0,2);
        panelForm.add(labelContrasena,1,2);

        panelForm.add(inputNombre,0,1);
        panelForm.add(inputApellido,1,1);
        panelForm.add(inputDni,0,3);
        panelForm.add(inputContrasena,1,3);

        panelForm.setPadding(new Insets(20));
        panelForm.setHgap(30);
        panelForm.setVgap(10);

        rootPrincipal.getChildren().addAll(rootHorizontal,panelForm);

        rootPrincipal.setPadding(new Insets(20));
        rootPrincipal.setAlignment(Pos.CENTER);
        rootPrincipal.setSpacing(15);


        // creacion de la escena y configuracion del stage
        Scene scene = new Scene(rootPrincipal,500,400);
        primaryStage.setTitle("Ejercicio de Formulario");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        // LLAMANDO A LOS METODOS PARA LA LOGICA DE LOS BOTONES
        botonGuardado.setOnAction(e -> guardarDatos(inputNombre,inputApellido,inputDni,inputContrasena));
        botonEliminar.setOnAction(e -> eliminarContenido(inputNombre,inputApellido,inputDni,inputContrasena));

    }


    public void guardarDatos(TextField inputNombre,TextField inputApellido,
                             TextField inputDni,PasswordField inputContrasena){

        if (inputNombre.getText().isEmpty() ||
                inputApellido.getText().isEmpty() ||
                inputDni.getText().isEmpty() ||
                inputContrasena.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error de ingresos de datos");
            alert.setHeaderText(null);
            alert.setContentText("Por favor ingresa correctamente los datos en las entrada de datos");
            alert.show();
        }else {
            String nombre = inputNombre.getText();
            String apellido = inputApellido.getText();
            String dni = inputDni.getText();
            String constrasena = inputContrasena.getText();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Datos ingresados correctamente");
            alert.setHeaderText(null);
            alert.setContentText("Los datos fueron guardados correctamente gracias por hacerlo : " + nombre + " " + apellido);
            alert.showAndWait();
        }
    }

    public void eliminarContenido(TextField inputNombre,TextField inputApellido,
                                  TextField inputDni,PasswordField inputContrasena){
        if (inputNombre.getText().isEmpty() ||
                inputApellido.getText().isEmpty() ||
                inputDni.getText().isEmpty() ||
                inputContrasena.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error campos vacios");
            alert.setHeaderText(null);
            alert.setContentText("No hace falta eliminar nada los campos estan vacios!!!");
            alert.show();
        }else {
            inputNombre.setText("");
            inputApellido.setText("");
            inputDni.setText("");
            inputContrasena.setText("");
        }
    }
}
