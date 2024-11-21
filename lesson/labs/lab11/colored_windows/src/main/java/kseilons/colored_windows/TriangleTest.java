package kseilons.colored_windows;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Random;

public class TriangleTest extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.getPoints().addAll(
                 0.0, 100.0,
                100.0, 100.0,
                100.0, 0.0
        );
        LinearGradient gradient = new LinearGradient(
                0, 0, 1, 0, // Направление градиента
                true, CycleMethod.NO_CYCLE, // Не повторяется
                new Stop(0, Color.BLACK), // Начальный точка
                new Stop(1, Color.BLUE) // Конечная точка
        );
        polygon.setFill(gradient);

        root.getChildren().add(polygon);
        Scene scene = new Scene(root, 400, 400, Color.BLACK);
        stage.setScene(scene);
        stage.setTitle("Color changer");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}