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

public class ContactoController {
    @FXML
    private Button btnEnviarContacto;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtCorreo;
    @FXML
    private Label lblInforme;
    @FXML
    private TextArea txaComentario;

    @FXML
    private void enviarContacto(ActionEvent event) {
        
        if (txtCorreo.getText().contains("@")) {
            txtNombre.setText("");
            txtApellidos.setText("");
            txtCorreo.setText("");
            txaComentario.setText("");
            lblInforme.setText("Datos enviados correctamente");
        } else {
            lblInforme.setText("Correo no válido");
        }
    }
}
