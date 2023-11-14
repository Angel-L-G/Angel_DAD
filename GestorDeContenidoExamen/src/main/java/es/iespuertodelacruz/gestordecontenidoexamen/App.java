package es.iespuertodelacruz.gestordecontenidoexamen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Stage primaryStage; // Nueva variable para almacenar la referencia a la ventana principal

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage; // Almacenar la referencia a la ventana principal
        scene = new Scene(loadFXML("PaginaMain"), 767, 535);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    // Método para cambiar de ventanas
    public static void setRoot(String fxml, int width, int height) throws IOException {
        scene.setRoot(loadFXML(fxml));
        primaryStage.setWidth(width);
        primaryStage.setHeight(height);
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}