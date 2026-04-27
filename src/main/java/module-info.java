module com.cero.javaejercicio01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cero.javaejercicio01 to javafx.fxml;
    opens com.cero.javaejercicio01.controllers to javafx.fxml;
    exports com.cero.javaejercicio01;
}