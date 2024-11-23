package kseilons.colored_windows;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Random;

public class ColoredWindow extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Color changer");
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), actionEvent -> {
                    Random random = new Random();
                    double v = random.nextDouble();
                    double v1 = random.nextDouble();
                    double v2 = random.nextDouble();
//                    double v = 0.5;
//                    double v1 = 0.5;
//                    double v2 = 0;
                    System.out.printf("v= %f, v1 = %f, v2 = %f\n", v, v1, v2);
                    Color color = Color.color(v, v1, v2);
                    scene.setFill(color);
                })

        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}