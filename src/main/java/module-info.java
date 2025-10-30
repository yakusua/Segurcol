module org.example.segurcol {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.segurcol to javafx.fxml;
    exports org.example.segurcol;
}