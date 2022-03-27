package eu.mapidev.calculator.phoenix;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ApplicationLauncher extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationLauncher.class.getClassLoader().getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Phoenix Calculator");
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();

        MainController controller = fxmlLoader.getController();
        controller.setPrimaryStage(stage);
    }

    @Override
    public void init() throws Exception {
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("javafx.preloader", ApplicationLoader.class.getCanonicalName());
        launch();
    }
}