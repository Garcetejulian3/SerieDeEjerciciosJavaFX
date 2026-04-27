package com.cero.javaejercicio01;

import com.cero.javaejercicio01.models.Usuario;
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

public class Ejercicio10 extends Application {

    private Label lblNombre = new Label();
    private Label lblProfesion = new Label();
    private Label lblDescripcion = new Label();

    private Button botonDetalles = new Button("Ver Detalles");
    private Button botonVerMenos = new Button("Ver Menos");
    private Button cambiarPersonaje = new Button("Cambiar de personaje");

    private Image fotoPerfil;
    private ImageView visor = new ImageView(fotoPerfil);

    public  Usuario gandalf = new Usuario("Ganfalf","Mago/Piromante","Amigo cercano de los Hobbit y salvador de la tierra media", "/Gandalf Phone Wallpaper.jpg");
    public Usuario aragorn = new Usuario("Aragorn", "Guerrero/Ranger", "Heredero de Gondor, líder valiente y hábil espadachín que lucha por la Tierra Media", "/aragorn.jpg");
    public Usuario legolas = new Usuario("Legolas", "Arquero/Elfo", "Príncipe elfo con una precisión increíble con el arco y gran agilidad en combate", "/legolas.jpg");

    @Override
    public void start(Stage primaryStage) throws Exception {


        // OTROS ROOT
        VBox detallesPerfil = new VBox();
        detallesPerfil.getChildren().addAll(lblNombre,lblProfesion,lblDescripcion,botonDetalles,botonVerMenos);

        detallesPerfil.setAlignment(Pos.CENTER);
        detallesPerfil.setSpacing(10);
        detallesPerfil.setPrefWidth(180);

        // ROOT DE IMAGEN DE PERFIL Y BOTON DE ELECCION DE PERSONAJE
        VBox rootImagen = new VBox();
        rootImagen.getChildren().addAll(visor,cambiarPersonaje);
        rootImagen.setAlignment(Pos.CENTER);
        rootImagen.setSpacing(10);

        // ROOT PRINCIPAL
        HBox root = new HBox();
        root.getChildren().addAll(rootImagen,detallesPerfil);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);



        // ESCENE PRINCIPAL
        Scene scene = new Scene(root,350,250);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
        primaryStage.setTitle("Perfil de Ususario");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();


        // DISENO UI
        root.setId("root-principal");
        lblNombre.getStyleClass().add("texto-blanco");
        lblProfesion.getStyleClass().add("texto-blanco");
        lblDescripcion.getStyleClass().add("texto-blanco");

        botonDetalles.getStyleClass().add("boton-accion");
        botonVerMenos.getStyleClass().add("boton-accion");
        cambiarPersonaje.getStyleClass().add("boton-accion");


        lblDescripcion.setVisible(false);
        botonVerMenos.setVisible(false);

        visor.setFitHeight(200); // ANCHO
        visor.setPreserveRatio(true); // MANTIENE LA PROPORSION PARA QUE NO SE VEA ESTIRADO

        lblProfesion.setWrapText(true);
        lblProfesion.setMaxWidth(150);

        lblDescripcion.setWrapText(true);
        lblDescripcion.setMaxWidth(150);




        // LOGICA DE BOTONES
        botonDetalles.setOnAction(e -> verDetalles(lblProfesion,botonDetalles,botonVerMenos));
        botonVerMenos.setOnAction(e -> verMenos(lblProfesion,botonDetalles,botonVerMenos));
        cambiarPersonaje.setOnAction(e -> cambiarPersonaje());

        // LOGICA
        actualizarInterfaz(gandalf);

    }

    public void cambiarPersonaje(){
        Stage ventanaEleccion = new Stage();
        VBox root = new VBox(10);

        Button btnGandalf  = new Button("Galdalf");
        Button btnAragorn  = new Button("Aragorn");
        Button btnLegolas  = new Button("Legolas");

        btnGandalf.setOnAction(event -> {
            actualizarInterfaz(gandalf);
            ventanaEleccion.close();
        });

        btnAragorn.setOnAction(event -> {
            actualizarInterfaz(aragorn);
            ventanaEleccion.close();
        });

        btnLegolas.setOnAction(event -> {
            actualizarInterfaz(legolas);
            ventanaEleccion.close();
        });

        Scene scene = new Scene(root,200,150);
        root.getChildren().addAll(btnGandalf,btnAragorn,btnLegolas);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        ventanaEleccion.setScene(scene);
        ventanaEleccion.setTitle("Elegir personaje");
        ventanaEleccion.show();

    }

    public void actualizarInterfaz(Usuario usu){
        lblNombre.setText(usu.getNombre());
        lblProfesion.setText(usu.getProfesion());
        lblDescripcion.setText(usu.getBioCorta());
        Image nuevaImagen = new Image(
                getClass().getResource(usu.getRutaImagen()).toExternalForm()
        );
        visor.setImage(nuevaImagen);
    }


    public void verDetalles(Label profesion,Button botonDetalles,Button botonVerMenos){
        lblDescripcion.setVisible(true);
        botonDetalles.setVisible(false);
        botonVerMenos.setVisible(true);

    }

    public void verMenos(Label profesion,Button botonDetalles,Button botonVerMenos){
        lblDescripcion.setVisible(false);
        botonDetalles.setVisible(true);
        botonVerMenos.setVisible(false);
    }
}
