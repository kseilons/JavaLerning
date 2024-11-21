package kseilons.batton2;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author kseilons
 */
public class JavaFXApplication1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Создание текстового элемента
        Text text = new Text();

        // Устанавливаем содержимое текста
        text.setText("Это новый Text компонент");

        // Устанавливаем шрифт и размер
        text.setFont(new Font("Verdana", 40));

        // Устанавливаем цвет текста
        text.setFill(Color.BLUE);

        // Создаем тень и устанавливаем на текст
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(3.0);
        dropShadow.setOffsetY(3.0);
        dropShadow.setColor(Color.GRAY);
        text.setEffect(dropShadow);

        // Устанавливаем позицию текста
        text.setX(50);
        text.setY(150);

        // Вращаем текст
        text.setRotate(15);

        Button btn1 = new Button();
        Button btn2 = new Button();
        btn1.setText("Нажми на меня'");
        btn2.setText("Скажи пока'");
        btn1.setOnAction(event -> {
            text.setText("Ура новый текст");
            text.setRotate(-15);
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Анимация вращения
                RotateTransition rotateTransition = new RotateTransition(Duration.seconds(2), text);
                rotateTransition.setByAngle(360);

                // Анимация исчезновения
                FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2), text);
                fadeTransition.setFromValue(1.0);
                fadeTransition.setToValue(0.0);

                // Пауза в одну секунду
                PauseTransition pause = new PauseTransition(Duration.millis(501));

                // Запуск анимаций после паузы
                pause.setOnFinished(e -> {
                    rotateTransition.play();
                    fadeTransition.play();
                });

                pause.play();
            }
        });

        HBox panel = new HBox();
        panel.getChildren().addAll(btn1, btn2);
        panel.setTranslateY(300);
        Group root = new Group();


        root.getChildren().addAll(panel, text);

        Scene scene = new Scene(root, 700, 500);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
