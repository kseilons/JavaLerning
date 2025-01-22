
package goaltest;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GoalTest extends Application {
    public static Group root = new Group();
    
    @Override
    public void start(Stage primaryStage) {
        //Instantiate a few Goal objects
        Goal goal1 = new Goal(100, 200);
        Goal goal2 = new Goal(200, 200);
//        root.getChildren().add(goal1);
        root.getChildren().addAll(goal1, goal2); // Добавляем в Pane

        Scene scene = new Scene(root, 600, 500, Color.rgb(50,50,50));
        
        primaryStage.setTitle("GoalTest");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
