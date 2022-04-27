module com.example.centrivaccinalilabb {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.uninsubria.centrivaccinalilabb to javafx.fxml;
    exports it.uninsubria.centrivaccinalilabb;
}