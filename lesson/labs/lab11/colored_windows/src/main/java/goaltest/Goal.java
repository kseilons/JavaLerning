
package goaltest;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;

import java.util.Objects;

public class Goal extends Pane {
    private Image dukeImage;
    private ImageView dukeImageView;
    private Image gloveImage;
    private ImageView gloveImageView;
    private AudioClip tone;

    private double mouseXOffset;
    private double mouseYOffset;

    public Goal(double x, double y) {
        dukeImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Images/Duke.png")));
        dukeImageView = new ImageView(dukeImage);
        this.setLayoutX(x);
        this.setLayoutY(y);

        gloveImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Images/Glove.png")));
        gloveImageView = new ImageView(gloveImage);
        gloveImageView.setPreserveRatio(true);
        gloveImageView.setFitWidth(30);
        gloveImageView.setLayoutX(17);

        tone = new AudioClip(Objects.requireNonNull(getClass().getResource("Audio/Note5.wav")).toString());

        getChildren().addAll(dukeImageView, gloveImageView);
        interactions();
    }


    private void interactions() {
        this.setOnMousePressed(event -> {
            tone.play();
            mouseXOffset = event.getX();
            mouseYOffset = event.getY();
        });
        this.setOnMouseDragged(this::moveGoal);
    }
    private void moveGoal(MouseEvent event) {
        double x = event.getSceneX() - mouseXOffset;
        double y = event.getSceneY() - mouseYOffset;
        this.setLayoutX(x);
        this.setLayoutY(y);
        System.out.println("Перетаскивание: x=" + x + ", y=" + y);
    }
}
