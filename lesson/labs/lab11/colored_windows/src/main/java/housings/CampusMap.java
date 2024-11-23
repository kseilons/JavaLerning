package housings;

import goaltest.Goal;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class CampusMap extends Application {
    // Хранилище данных об общежитиях
    private final Map<String, Dorm> dorms = new HashMap<>();

    @Override
    public void start(Stage primaryStage) {
        // Создаем основные компоненты
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawCampusMap(gc);

        // Панель управления
        VBox controls = new VBox(10);
        controls.setAlignment(Pos.TOP_LEFT);
        Label dormLabel = new Label("Добавление общежития:");
        TextField dormNameField = new TextField();
        dormNameField.setPromptText("Название общежития");
        Button addDormButton = new Button("Добавить");

        controls.getChildren().addAll(dormLabel, dormNameField, addDormButton);

        // Корневой макет
        BorderPane root = new BorderPane();
        root.setCenter(canvas);
        root.setRight(controls);

        // Настраиваем сцены
        Scene scene = new Scene(root, 1000, 600);

        // Добавление новых общежитий
        addDormButton.setOnAction(e -> {
            String dormName = dormNameField.getText().trim();
            if (!dormName.isEmpty() && !dorms.containsKey(dormName)) {
                dorms.put(dormName, new Dorm(dormName, Math.random() * 700, Math.random() * 500));
                drawCampusMap(gc);
            }
            dormNameField.clear();
        });

        // Настройка основного окна
        primaryStage.setTitle("Карта кампуса");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Метод отрисовки карты кампуса и общежитий
    private void drawCampusMap(GraphicsContext gc) {
        gc.clearRect(0, 0, 800, 600);

        // Фон карты
        gc.setFill(Color.LIGHTBLUE);
        gc.fillRect(0, 0, 800, 600);

        // Отрисовка общежитий
        gc.setFill(Color.ORANGE);
        for (Dorm dorm : dorms.values()) {
            gc.fillOval(dorm.getX() - 20, dorm.getY() - 20, 40, 40);
            gc.setFill(Color.BLACK);
            gc.fillText(dorm.getName(), dorm.getX() - 20, dorm.getY() - 30);
            gc.setFill(Color.ORANGE);
        }

        // Отрисовка центральной точки
        double[] centralPoint = getCentralPoint();
        gc.setFill(Color.RED);
        gc.fillOval(centralPoint[0] - 10, centralPoint[1] - 10, 20, 20);
        gc.setFill(Color.BLACK);
        gc.fillText("Центр", centralPoint[0] - 15, centralPoint[1] - 15);
    }

    // Метод вычисления центральной точки
    private double[] getCentralPoint() {
        double sumX = 0, sumY = 0;
        int totalResidents = 0;

        for (Dorm dorm : dorms.values()) {
            sumX += dorm.getX() * dorm.getResidents();
            sumY += dorm.getY() * dorm.getResidents();
            totalResidents += dorm.getResidents();
        }

        double centerX = totalResidents > 0 ? sumX / totalResidents : 400;
        double centerY = totalResidents > 0 ? sumY / totalResidents : 300;

        return new double[]{centerX, centerY};
    }
    public static void main(String[] args) {
        launch(args);
    }
}
