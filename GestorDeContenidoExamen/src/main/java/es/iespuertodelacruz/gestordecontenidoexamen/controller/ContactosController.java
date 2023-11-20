/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package es.iespuertodelacruz.gestordecontenidoexamen.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author dam2
 */
public class ContactosController implements Initializable {


    @FXML
    private Label lblnombre;
    @FXML
    private Label lblapellidos;
    @FXML
    private Label lblcorreo;
    @FXML
    private Label lblcomentario;
    @FXML
    private TextField txtnombre;
    @FXML
    private TextField txtapellidos;
    @FXML
    private TextField txtcorreo;
    @FXML
    private Button btnenviar;
    @FXML
    private Label lblresultados;
    @FXML
    private TextArea txacomentario;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void enviarInfo(ActionEvent event) {
        if(txtcorreo.getText().contains("@")){
            lblresultados.setText("Datos Enviados");
            txtapellidos.setText("");
            txtcorreo.setText("");
            txtnombre.setText("");
            txacomentario.setText("");
        }else{
            lblresultados.setText("Correo No Valido");
        }
        
    }

}
