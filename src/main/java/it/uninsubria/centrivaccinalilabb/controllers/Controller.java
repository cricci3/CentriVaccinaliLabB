package it.uninsubria.centrivaccinalilabb.controllers;

import it.uninsubria.centrivaccinalilabb.Hello;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Controller {
    private Scene scene;
    private Stage stage;
    private Parent root;



    @FXML
    private Button btn_operatore, btn_cittadino, btn_loginOperatore, btn_newCentro, btn_newVaccinato,
            btn_addVaccinato, btn_cercaInfo, btn_registrazione, btn_login, btn_ricercaNome, btn_ricercaTipo,
            btn_registraCittadino, btn_loginCittadino;

    @FXML
    private TextField tf_usernameOperatore, tf_passwordOpertore, tf_nomeCentro, tf_indirizzo, tf_comune,
            tf_cap, tf_provincia, tf_nomeVaccinato, tf_cognomeVaccinato, tf_cf, tf_ricercaNome, tf_ricercaComune,
            tf_nomeRegistrazione, tf_cognomeRegistrazione, tf_cfRegistrazione, tf_emailRegistrazione,
            tf_usernameRegistrazione, tf_passwordRegistrazione, tf_idRegistrazione, tf_usernameLogin, tf_passwordLogin;

    @FXML
    private Label label_loginErroreOperatore, label_loginErroreCittadino;

    @FXML
    private  ChoiceBox<String> box_tipologia, box_nomeVaccino, box_nomeCV, box_ricercaTipo;

    @FXML
    private DatePicker date_dataV;


    @FXML
    protected void onButtonOperatoreClick(ActionEvent event){
        FXMLLoader fxmlLoader = new FXMLLoader(Hello.class.getResource("login-operatore.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}