package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ZooApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Смотреть капибар!");
        VBox root = new VBox(button);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Зоопарк");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
