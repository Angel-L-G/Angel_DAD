package org.openjfx.ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class PrimaryController {

	@FXML
	private TextField sendTextField;
	
	@FXML
	private TextArea reciverTxtArea;
	
    @FXML
    private void switchToSecondary() throws IOException {
    	//Leo TextField
    	String textoRecivido = sendTextField.getText().concat("\n");    	
   	
    	//Escribo en TextArea
    	reciverTxtArea.appendText(textoRecivido);
    	
    	//Limpio TextFiel
    	sendTextField.clear();
    }
    
    @FXML
    private void openFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");

        // event es un MenuItem
        // Obtén el menú contextual desde el evento
        ContextMenu contextMenu = new ContextMenu();
        if (event.getSource() instanceof MenuItem) {
            MenuItem menuItem = (MenuItem) event.getSource();
            contextMenu = menuItem.getParentPopup();
        }
        
        // Obtenemos el escenario (Stage) del menú contextual
        Stage stage = (Stage) contextMenu.getOwnerWindow();

        File file = fileChooser.showOpenDialog(stage);

        if (file != null) {
            try (BufferedReader bufferReader = new BufferedReader(new FileReader(file))) {
                reciverTxtArea.clear();
                String linea;
                while ((linea = bufferReader.readLine()) != null) {
                    reciverTxtArea.appendText(linea + "\n");
                }
            } catch (FileNotFoundException e) {
            	// Manejo de la excepción de archivo no encontrado
				e.printStackTrace();
			} catch (IOException e) {
				 // Manejo de otras excepciones de E/S
				e.printStackTrace();
			}
        }
    }

     
     @FXML
     private void saveFile(ActionEvent even)  {
    	    FileChooser fileChooser = new FileChooser();
    	    fileChooser.setTitle("Save Resource File");
    	    fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
    	    
    	    File file = fileChooser.showSaveDialog(reciverTxtArea.getScene().getWindow());
    	    
    	    if (file != null) {
    	        try (PrintWriter writer = new PrintWriter(file, "UTF-8")) {
    	            writer.print(reciverTxtArea.getText());
    	        } catch (IOException e) {
    	            e.printStackTrace(); // Manejo de errores
    	        }
    	    }    	    	 
     }    
}
