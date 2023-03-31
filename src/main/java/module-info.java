module com.example.fracciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fracciones to javafx.fxml;
    exports com.example.fracciones;
}