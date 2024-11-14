package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // Charger le fichier FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("test.fxml")); // Chemin vers votre fichier FXML
            AnchorPane root = loader.load();

            // Créer la scène
            Scene scene = new Scene(root, 400, 400);

            // Ajouter des styles CSS si nécessaire
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

            // Configurer et afficher la fenêtre principale
            primaryStage.setTitle("JavaFX Application");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
