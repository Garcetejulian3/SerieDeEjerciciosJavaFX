package com.cero.javaejercicio01;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio08ListaTareas extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {

        ListView<String> listaTareas = new ListView<>();


        // NODO HORIZONTAL PARA EL INPUT Y LABEL
        HBox nodoEntradaDatos = new HBox();
        TextField tareaEntrada = new TextField();
        Button botonGuardar = new Button("AGREGAR");

        nodoEntradaDatos.getChildren().addAll(tareaEntrada,botonGuardar);
        nodoEntradaDatos.setSpacing(15);
        nodoEntradaDatos.setAlignment(Pos.CENTER);



        // NODO DE ACCIONES
        TextField nuevaTarea = new TextField();

        listaTareas.setOnMouseClicked(e -> {
                int idTarea = listaTareas.getSelectionModel().getSelectedIndex();

                if (idTarea>=0){
                    String tareaEditar = listaTareas.getItems().get(idTarea);
                    nuevaTarea.setText(tareaEditar);
                }

        });


        Button botonEliminar = new Button("Eliminar Tarea");
        Button botonEditar = new Button("Editar Tarea");

        HBox nodoAccionesV = new HBox();
        nodoAccionesV.getChildren().addAll(botonEliminar,botonEditar,nuevaTarea);
        nodoAccionesV.setSpacing(15);
        nodoAccionesV.setAlignment(Pos.CENTER);
        nodoAccionesV.setPadding(new Insets(15));


        // NODO PRINCIPAL




        //Label tareasLista = new Label();
        VBox rootPrincipal = new VBox();

        rootPrincipal.getChildren().addAll(nodoEntradaDatos,listaTareas,nodoAccionesV);
        rootPrincipal.setSpacing(15);
        rootPrincipal.setAlignment(Pos.CENTER);


        // LOGICA DE LOS BOTONES
        botonGuardar.setOnAction(e -> guardadoTarea(listaTareas,tareaEntrada));
        botonEliminar.setOnAction(e -> eliminarTarea(listaTareas,tareaEntrada));
        botonEditar.setOnAction(e -> editarTarea(listaTareas,nuevaTarea));


        // CREACION DE LA ESCENA Y STAGE
        Scene scene = new Scene(rootPrincipal,500,400);
        primaryStage.setTitle("Ejercicio de Formulario");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public void guardadoTarea(ListView<String> listaTareas, TextField tareaEntrada){
        String nuevaTarea = tareaEntrada.getText();

        if (nuevaTarea.trim().isEmpty()) return;

        listaTareas.getItems().add(nuevaTarea);

        tareaEntrada.clear();

    }

    public void eliminarTarea(ListView<String> listaTareas, TextField tareaEntrada){

        int idTarea = listaTareas.getSelectionModel().getSelectedIndex();
        System.out.println("Tarea seleccionada : " + listaTareas.getItems().get(idTarea));

        if (idTarea >= 0 ){
            listaTareas.getItems().remove(idTarea);
        }
    }

    public void editarTarea(ListView<String> listaTareas, TextField tareaEntrada){
        int idTarea = listaTareas.getSelectionModel().getSelectedIndex();
        if (idTarea >= 0 ){
            String tareaNueva = tareaEntrada.getText();
            if (tareaNueva.trim().isEmpty()) return;
            listaTareas.getItems().set(idTarea,tareaNueva);
        }
    }
}
