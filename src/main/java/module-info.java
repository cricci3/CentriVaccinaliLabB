module CentriVaccinaliLabB {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens it.uninsubria.centrivaccinalilabb to javafx.fxml;
    exports it.uninsubria.centrivaccinalilabb;
    exports it.uninsubria.centrivaccinalilabb.controllers;
    opens it.uninsubria.centrivaccinalilabb.controllers to javafx.fxml;
}