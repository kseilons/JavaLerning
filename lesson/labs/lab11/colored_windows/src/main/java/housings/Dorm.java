package housings;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.Random;

public class Dorm extends Pane {

    private final String name;
    private int residents; // Количество жильцов = ширина * высота / 100
    private final Rectangle rectangle;
    private final Text label;

    private double mouseXOffset;
    private double mouseYOffset;

    public double getDormWidth() {
        return width;
    }

    public double getDormHeight() {
        return height;
    }

    private double width;
    private double height;

    private boolean isResizing = false; // Флаг изменения размера
    private CentersManager centersManager;

    public Dorm(String name, double x1, double y1, double x2, double y2, CentersManager centersManager) {
        this.name = name;
        this.centersManager = centersManager;

        // Вычисляем ширину и высоту из координат
        width = Math.abs(x2 - x1);
        height = Math.abs(y2 - y1);

        // Считаем количество жильцов
        this.residents = (int) (width * height / 100.0);

        // Создаем прямоугольник
        setLayoutX(Math.min(x1, x2));
        setLayoutY( Math.min(y1, y2));
        rectangle = new Rectangle(0, 0, width, height);
        rectangle.setFill(generateRandomColor());
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(1);

        // Создаем текст с названием общежития и количеством жильцов
        label = new Text(name + ": " + residents);
        label.setFill(Color.BLACK);
        label.setX(5); // Смещение текста внутри прямоугольника
        label.setY(15);

        // Добавляем прямоугольник и текст в контейнер
        getChildren().addAll(rectangle, label);

        // Добавляем обработчики для перетаскивания и изменения размера
        addHandler();
    }

    private Color generateRandomColor() {
        Random random = new Random();
        return Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble(), 0.5); // Прозрачность 50%
    }

    private void addHandler() {
        setOnMousePressed(event -> {
            mouseXOffset = event.getX();
            mouseYOffset = event.getY();

            // Определяем, начинается ли изменение размера
            isResizing = isInResizeCorner(event);
        });

        setOnMouseDragged(dragEvent -> {
            // Проверяем, тянется ли угол прямоугольника
            if (isResizing) {
                rectangle.setWidth(Math.max(50, dragEvent.getX()));
                rectangle.setHeight(Math.max(50, dragEvent.getY()));

                // Обновляем количество жильцов и текст
                residents = (int) (rectangle.getWidth() * rectangle.getHeight() / 100);
                label.setText(name + ": " + residents);

            } else {
                double x = dragEvent.getSceneX() - mouseXOffset;
                double y = dragEvent.getSceneY() - mouseYOffset;
                this.setLayoutX(x);
                this.setLayoutY(y);
            }
            centersManager.updateCenters(); // Вызываем обновление центров

        });
        setOnMouseReleased(event -> {

            // Сбрасываем флаг изменения размера после завершения
            isResizing = false;
        });
    }


    private boolean isInResizeCorner(javafx.scene.input.MouseEvent event) {
        double mouseX = event.getX();
        double mouseY = event.getY();
        double cornerSize = 15; // Размер зоны для растягивания
        return (mouseX >= rectangle.getWidth() - cornerSize && mouseY >= rectangle.getHeight() - cornerSize);
    }

    public String getName() {
        return name;
    }

    public int getResidents() {
        return residents;
    }
}
