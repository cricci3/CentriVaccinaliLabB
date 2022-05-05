module CentriVaccinaliLabB {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens it.uninsubria.centrivaccinalilabb to javafx.fxml;
    exports it.uninsubria.centrivaccinalilabb;
}