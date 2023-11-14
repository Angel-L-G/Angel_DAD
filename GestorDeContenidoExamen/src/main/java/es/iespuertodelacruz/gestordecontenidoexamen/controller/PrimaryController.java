package es.iespuertodelacruz.gestordecontenidoexamen.controller;

import es.iespuertodelacruz.gestordecontenidoexamen.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class PrimaryController {

    @FXML
    private Button buttonMas;
    
    @FXML
    private Button btnRegistro;
    @FXML
    private TextField inputUsuario;
    @FXML
    private TextField inputContrasenha;
    @FXML
    private TextField inputEmail;
    @FXML
    private TextField inputRepetirContrasenha;
    @FXML
    private Circle profilePicture;
    @FXML
    private Text profileName;
    @FXML
    private Text settings;
    @FXML
    private ImageView settingsImage;
    @FXML
    private Button btnGoToLogin;
    @FXML
    private Button btnGoToRegister;
    
    @FXML
    private ImageView imgPistacho;
    
    @FXML
    private void abrirGestor(ActionEvent event) throws IOException {
        App.setRoot("Gestor",1077,700);
    }
    
    @FXML
    private void abrirGestorDesdeLogin(ActionEvent event) throws IOException {
        App.setRoot("Gestor",1077,700);
    }
    

    @FXML
    private void irALogin(ActionEvent event) throws IOException{
        App.setRoot("Login",634,468);
    }

    @FXML
    private void irARegister(ActionEvent event) throws IOException{
        App.setRoot("Register",634,468);
    }
    

    

    
}
