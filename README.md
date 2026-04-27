# 📘 Guía Completa de JavaFX (De Básico a Avanzado)

Guía progresiva para aprender JavaFX desde cero hasta un nivel más profesional.  
Incluye fundamentos, layouts, eventos, validaciones, GridPane, CSS, FXML y más.

---

# 🧱 1. Fundamentos: Stage, Scene y Root

JavaFX funciona como un teatro:

- **Stage (Escenario)** → Ventana principal  
- **Scene (Escena)** → Contenido dentro de la ventana  
- **Root Node** → Contenedor principal  

## 🧩 Estructura básica

```java
public class App extends Application {

   @Override
   public void start(Stage primaryStage) {

       StackPane root = new StackPane();

       Scene scene = new Scene(root, 600, 400);

       primaryStage.setTitle("Sesión de: " + nombreUsuario);
       primaryStage.setScene(scene);
       primaryStage.setResizable(false);
       primaryStage.show();
   }
}
🎭 2. Nodos y Controles

Todo en JavaFX es un Node.

🏷️ Label
Label etiqueta = new Label("Hola");
etiqueta.setText("Nuevo texto");
🖱️ Button
Button boton = new Button("Click");
⚡ Evento
boton.setOnAction(e -> {
    System.out.println("¡El botón funciona!");
});
➕ Agregar al root
root.getChildren().addAll(etiqueta, boton);
📦 3. Layouts
❌ StackPane

Apila elementos (uno encima de otro)

✅ VBox
VBox root = new VBox();
✅ HBox
HBox root = new HBox();
🎯 Propiedades
root.setSpacing(10);
root.setAlignment(Pos.CENTER);
🧪 Ejemplo
VBox root = new VBox();

Label textoPr = new Label("Prueba");
Button botonAccept = new Button("Aceptar");

root.getChildren().addAll(textoPr, botonAccept);
root.setSpacing(20);
root.setAlignment(Pos.CENTER);
📥 4. Entrada de Datos (TextField)
TextField campo = new TextField();
String texto = campo.getText();
✅ Validación
if (campo.getText().trim().isEmpty()) {
   System.out.println("Vacío");
}
⚠️ 5. Alertas
Alert alerta = new Alert(Alert.AlertType.WARNING);
alerta.setTitle("Error");
alerta.setContentText("Campo vacío");
alerta.showAndWait();
🧠 6. Lógica Completa (Ejemplo)
botonSaludo.setOnAction(e -> {

   if (campoNombre.getText() == null || campoNombre.getText().trim().isEmpty()) {

       Alert alerta = new Alert(Alert.AlertType.WARNING);
       alerta.setTitle("Campo obligatorio");
       alerta.setContentText("Ingresa un nombre");
       alerta.showAndWait();

   } else {
       String saludo = campoNombre.getText();
       textSaludo.setText("Saludando a " + saludo);
   }
});
🧮 7. GridPane
📍 Coordenadas
grid.add(nodo, columna, fila);
⚙️ Configuración
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(new Insets(20));
grid.setAlignment(Pos.CENTER);
🎯 Alineación individual
GridPane.setHalignment(botonCalc, HPos.RIGHT);
🔢 8. Parsing (String → Número)
double num = Double.parseDouble(texto);

Corrección de comas:

texto.replace(",", ".");
🌡️ 9. Ejemplo: Conversor
try {
   double temperatura = Double.parseDouble(entradaCel.getText().replace(",", "."));
   double resultadoF = (temperatura * 1.8) + 32;

   resultado.setText(String.format("%.2f °F", resultadoF));

} catch (NumberFormatException e) {

   Alert alerta = new Alert(Alert.AlertType.ERROR);
   alerta.setContentText("Solo números");
   alerta.showAndWait();

   entradaCel.clear();
   entradaCel.requestFocus();
   resultado.setText("Entrada inválida");
}
🎨 10. CSS en JavaFX
Inline
boton.setStyle("-fx-background-color: red;");
Archivo externo
scene.getStylesheets().add("estilos.css");
Selectores
#id → único
.clase → grupo
🖼️ 11. Imágenes
Image
Image img = new Image("file:foto.png");
ImageView
ImageView vista = new ImageView(img);

vista.setFitWidth(200);
vista.setPreserveRatio(true);
📋 12. ListView
📦 Operaciones
lista.getItems().add("Tarea");
lista.getItems().remove(0);
lista.getItems().clear();
🎯 Selección
String tarea = lista.getSelectionModel().getSelectedItem();
int index = lista.getSelectionModel().getSelectedIndex();
🖱️ Eventos
lista.setOnMouseClicked(e -> {
   if (e.getClickCount() == 2) {
       System.out.println("Doble click");
   }
});
✏️ Editar / eliminar
lista.getItems().remove(index);
lista.getItems().set(index, "Nueva tarea");
🔘 13. Button (Profundización)
Eventos
button.setOnAction(...)
button.fire()
Estado
button.setDisable(true);
Tamaño
button.setPrefWidth(100);
Tooltip
button.setTooltip(new Tooltip("Click"));
🏗️ 14. FXML

Separación profesional:

FXML → interfaz
Controller → lógica
CSS → estilos
🧩 15. Scene Builder

Herramienta visual Drag & Drop

🎮 16. Controller
public class PrincipalController {

   @FXML
   private Button btnHola;

   @FXML
   void saludar() {
       btnHola.setText("¡Presionado!");
   }
}
Vinculación en FXML
<Button fx:id="btnHola" onAction="#saludar"/>
🚚 17. Cargar FXML
FXMLLoader loader = new FXMLLoader(
    getClass().getResource("/vista/VistaPrincipal.fxml")
);

Parent root = loader.load();

Scene scene = new Scene(root);
primaryStage.setScene(scene);
primaryStage.show();
🧠 Conceptos clave finales
JavaFX funciona con un árbol de nodos
Todo input del usuario es String
Siempre validar datos
Separar lógica (Controller) de vista (FXML)
🚀 Progresión lograda

✔ Ventanas
✔ Controles
✔ Layouts
✔ Inputs
✔ Validación
✔ Eventos
✔ Grid
✔ Parsing
✔ Manejo de errores
✔ CSS
✔ Imágenes
✔ Listas
✔ FXML profesional

📌 Autor

Julian Garcete
Backend Developer en formación 🚀
