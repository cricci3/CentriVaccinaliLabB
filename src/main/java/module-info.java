module com.example.centrivaccinalilabb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.centrivaccinalilabb to javafx.fxml;
    exports com.example.centrivaccinalilabb;
}