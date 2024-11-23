package housings;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Center extends Pane {
    private final Circle marker;
    private final Label label;

    public Center(Color color, String labelText) {
        marker = new Circle(5, color);
        marker.setOpacity(0.5);

        label = new Label(labelText);
        label.setTextFill(color);
        setMouseTransparent(true);

        this.getChildren().addAll(marker, label);
    }

    public void update(double x, double y) {
        System.out.println(x + " " + y);
        setLayoutX(x);
        setLayoutY(y);
        label.setLayoutX(10);
        label.setText(String.format("%s: (%.1f, %.1f)", label.getText().split(":")[0], x, y));
    }

}
