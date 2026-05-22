package proyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("/proyecto/view/proyecto.fxml")
        );

        Scene scene = new Scene(loader.load());

        stage.setTitle("Conversor de Bases");

        // Icono
        stage.getIcons().add(
            new Image("/proyecto/resources/icon.png")
        );

        stage.setScene(scene);

        stage.setResizable(false);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
