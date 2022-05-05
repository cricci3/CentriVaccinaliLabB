package it.uninsubria.centrivaccinalilabb.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ControllerHelloCentriVaccinali {
    public Button btn_operatore, btn_cittadino;
    private Scene scene;
    private Stage stage;
    private Parent root;

    public void switchToOperatore(ActionEvent event){
        String sceneFile = "resources/centrivaccinalilabb/hello-operatore.fxml";
        URL url = getClass().getClassLoader().getResource(sceneFile);
        try {
            root = FXMLLoader.load(url);
            System.out.println("  fxmlResource = " + sceneFile);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
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
        try {
            root = FXMLLoader.load(getClass().getResource("hello-cittadino.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
