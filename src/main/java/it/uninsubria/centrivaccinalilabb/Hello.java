package it.uninsubria.centrivaccinalilabb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Hello extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Hello.class.getResource("hello-centri-vaccinali.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("CentriVaccinali");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}