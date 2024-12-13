module org.example.controllibre {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires static lombok;
    requires java.sql;

    opens org.example.controllibre.controller to javafx.fxml;
    exports org.example.controllibre;
}