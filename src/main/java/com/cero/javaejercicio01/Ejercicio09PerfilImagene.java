package com.cero.javaejercicio01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio09PerfilImagene extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        // NODOS
        Image fotoPerfil = new Image("/Gandalf Phone Wallpaper.jpg");
        ImageView visor = new ImageView(fotoPerfil);

        visor.setFitHeight(200); // ANCHO
        visor.setPreserveRatio(true); // MANTIENE LA PROPORSION PARA QUE NO SE VEA ESTIRADO


        Label nombre = new Label("Gandafl El Gris");
        Label profesion = new Label("Mago / Piromantico ETC");

        profesion.setWrapText(true);
        profesion.setMaxWidth(150);

        Button botonDetalles = new Button("Ver Detalles");
        Button botonVerMenos = new Button("Ver Menos");

        botonVerMenos.setVisible(false);


        // OTROS ROOT
        VBox detallesPerfil = new VBox();
        detallesPerfil.getChildren().addAll(nombre,profesion,botonDetalles,botonVerMenos);
        detallesPerfil.setAlignment(Pos.CENTER);
        detallesPerfil.setSpacing(10);
        detallesPerfil.setPrefWidth(180);

        // ROOT PRINCIPAL
        HBox root = new HBox();
        root.getChildren().addAll(visor,detallesPerfil);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);



        // ESCENE PRINCIPAL
        Scene scene = new Scene(root,350,250);
        primaryStage.setTitle("Perfil de Ususario");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

        // LOGICA DE BOTONES
        botonDetalles.setOnAction(e -> verDetalles(profesion,botonDetalles,botonVerMenos));
        botonVerMenos.setOnAction(e -> verMenos(profesion,botonDetalles,botonVerMenos));

        // ESTILOS
        root.setStyle(  "-fx-background-color: #2c3e50 ;" +
                "-fx-padding: 10;" +
                "-fx-background-radius: 15;");
        nombre.setStyle("-fx-text-fill: white;" +
                "-fx-font-size: 18px;" +
                "-fx-font-weight: bold;");
        botonDetalles.setStyle("-fx-background-color: #27ae60;" +
                "-fx-text-fill: white");
        botonVerMenos.setStyle("-fx-background-color: #27ae60;" +
                "-fx-text-fill: white");
        profesion.setStyle("-fx-text-fill: white");

        botonDetalles.setOnMouseEntered(event -> {
            botonDetalles.setStyle("-fx-background-color: #2ecc71; -fx-text-fill: white;");
        });
        botonVerMenos.setOnMouseExited(event -> {
            botonVerMenos.setStyle("-fx-background-color: #27ae60; -fx-text-fill: white;");
        });

        botonVerMenos.setOnMouseEntered(event -> {
            botonVerMenos.setStyle("-fx-background-color: #2ecc71; -fx-text-fill: white;");
        });
        botonDetalles.setOnMouseExited(event -> {
            botonDetalles.setStyle("-fx-background-color: #27ae60; -fx-text-fill: white;");
        });



    }

    public void verDetalles(Label profesion,Button botonDetalles,Button botonVerMenos){
        profesion.setText("Mago / Piromantico ETC \n" +
                          "Amigo de los Hobbyts   \n" +
                          "Es conocido con muchos nombres en la tierra media\n");
        botonDetalles.setVisible(false);
        botonVerMenos.setVisible(true);

    }

    public void verMenos(Label profesion,Button botonDetalles,Button botonVerMenos){
        profesion.setText("Mago / Piromantico ETC ");
        botonDetalles.setVisible(true);
        botonVerMenos.setVisible(false);
    }


}
