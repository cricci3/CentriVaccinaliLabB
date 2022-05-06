package it.uninsubria.centrivaccinalilabb.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ControllerHelloCentriVaccinali{
    public Button btn_operatore, btn_cittadino;
    private Scene scene;
    private Stage stage;
    private Parent root;

    public void switchToOperatore(ActionEvent event){
        String sceneFile = "/it/uninsubria/centrivaccinalilabb/hello-operatore.fxml";
        URL url = getClass().getResource(sceneFile);
        try {
            FXMLLoader fxmlLoader;

            fxmlLoader = new FXMLLoader(getClass().getResource(sceneFile));
            root = (Parent) fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            System.out.println( "Exception on FXMLLoader.load()" );
            System.out.println( "  * url: " + url );
            System.out.println( "  * " + e );
            System.out.println( "    ----------------------------------------\n" );
        }
    }

    public void switchToCittadino(ActionEvent event) throws IOException {
        String sceneFile = "/it/uninsubria/centrivaccinalilabb/hello-cittadino.fxml";
        URL url = getClass().getResource(sceneFile);
        try {
            FXMLLoader fxmlLoader;

            fxmlLoader = new FXMLLoader(getClass().getResource(sceneFile));
            root = (Parent) fxmlLoader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            System.out.println( "Exception on FXMLLoader.load()" );
            System.out.println( "  * url: " + url );
            System.out.println( "  * " + e );
            System.out.println( "    ----------------------------------------\n" );
        }
    }
}
