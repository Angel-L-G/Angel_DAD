package es.iespuertodelacruz.gestordecontenidoexamen.controller;

import es.iespuertodelacruz.gestordecontenidoexamen.App;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PrimaryController {
<<<<<<< HEAD
    
=======

>>>>>>> 2450dd6950e685a8b53661272f9b90a94e37a006
    @FXML
    private Button btnGoToLogin;
    @FXML
    private Button btnGoToRegister;
    @FXML
<<<<<<< HEAD
=======
    private Button btnContacto;
    
    
>>>>>>> 2450dd6950e685a8b53661272f9b90a94e37a006
    private void abrirGestor(ActionEvent event) throws IOException {
        App.setRoot("Gestor",1077,700);
    }
    
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
<<<<<<< HEAD
    
    @FXML
    private void btnIrContacto(ActionEvent event) {
        try {
            App.setRoot("Contacto", 600, 430);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
=======

    @FXML
    private void redirigirContacto(ActionEvent event) throws IOException {
        App.setRoot("Contactos",600,400);
    }
>>>>>>> 2450dd6950e685a8b53661272f9b90a94e37a006
}
