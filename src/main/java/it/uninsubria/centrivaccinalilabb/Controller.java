package it.uninsubria.centrivaccinalilabb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {
    private Scene scene;
    private Stage stage;
    private Parent root;

    @FXML
    private Button btn_operatore;

    @FXML
    private Button btn_cittadino;

    @FXML
    protected void onButtonOperatoreClick(ActionEvent event){
        FXMLLoader fxmlLoader = new FXMLLoader(Hello.class.getResource("login-operatore.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}