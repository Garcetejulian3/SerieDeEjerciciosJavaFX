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
