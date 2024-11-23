package housings;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CampusMap extends Application {

    private final List<Dorm> dorms = new ArrayList<>();
    private final List<Student> group = new ArrayList<>();
    private final Center campusCenter = new Center(Color.RED, "Campus Center");
    private final Center groupCenter = new Center(Color.BLUE, "Group Center");

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Image backgroundImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Images/map.png")));
        ImageView backgroundImageView = new ImageView(backgroundImage);

        CentersManager centersManager = new CentersManager(dorms, group, root);

        root.getChildren().add(backgroundImageView);
        // Добавляем 10 общежитий
        for (int i = 1; i <= 10; i++) {
            String name = "Dorm " + i;
            double x = 50 + (i % 5) * 150; // Смещение по X
            double y = 50 + (i / 5) * 150; // Смещение по Y
            Dorm dorm = new Dorm(name, x, y, x + 100, y+ 100, centersManager);
            dorms.add(dorm);
            root.getChildren().add(dorm);
        }

        // Добавляем 4 студентов
        for (int i = 1; i <= 4; i++) {
            String studentName = "Student " + i;
            Dorm assignedDorm = dorms.get(i % dorms.size()); // Назначаем студента в одно из общежитий
            Student student = new Student(studentName, assignedDorm);
            group.add(student);
        }
        centersManager.updateCenters();

        // Добавляем элементы на экран
        root.getChildren().addAll(centersManager.getCampusCenter(),
                centersManager.getGroupCenter());

        Scene scene = new Scene(root, 965, 796);
        primaryStage.setTitle("Dorm Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}