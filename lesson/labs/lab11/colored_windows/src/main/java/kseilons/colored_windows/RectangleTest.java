package kseilons.colored_windows;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Random;

public class RectangleTest extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();

        Color color = Color.rgb(122, 33, 255);
        Color color2 = Color.rgb(0, 22, 44);
        Color color3 = Color.rgb(5, 33, 255);

        Rectangle rectangle = new Rectangle();
        rectangle.setFill(color2);
        rectangle.setStroke(color3); //border
        rectangle.setStrokeWidth(3);
        rectangle.setArcWidth(20); // закругление
        rectangle.setArcHeight(50);
        rectangle.setX(10);
        rectangle.setY(10);
        rectangle.setWidth(100);
        rectangle.setHeight(150);
        root.getChildren().add(rectangle);


        Scene scene = new Scene(root, 400, 400, color);
        stage.setScene(scene);
        stage.setTitle("Color changer");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}