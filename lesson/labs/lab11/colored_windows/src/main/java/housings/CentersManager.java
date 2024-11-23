package housings;

import javafx.scene.layout.Pane;

import java.util.List;

public class CentersManager extends Pane {
    private final List<Dorm> dorms;
    private final List<Student> group;

    public Center getCampusCenter() {
        return campusCenter;
    }

    public Center getGroupCenter() {
        return groupCenter;
    }

    private final Center campusCenter;
    private final Center groupCenter;

    public CentersManager(List<Dorm> dorms, List<Student> group, Pane root) {
        this.dorms = dorms;
        this.group = group;
        this.campusCenter = new Center(javafx.scene.paint.Color.RED, "Campus Center");
        this.groupCenter = new Center(javafx.scene.paint.Color.BLUE, "Group Center");

    }

    public void updateCenters() {
        System.out.println("updateCenters");
        // Центр массы общежитий
        double totalWeight = 0, weightedX = 0, weightedY = 0;
        for (Dorm dorm : dorms) {
            System.out.println(dorm.getLayoutX());
            System.out.println(dorm.getWidth());
            double centerX = dorm.getLayoutX() + dorm.getDormWidth() / 2;
            double centerY = dorm.getLayoutY() + dorm.getDormHeight() / 2;
            double residents = dorm.getResidents();
            totalWeight += residents;
            weightedX += centerX * residents;
            weightedY += centerY * residents;
        }
        double campusCenterX = weightedX / totalWeight;
        double campusCenterY = weightedY / totalWeight;

        // Центр учебной группы
        double groupX = 0, groupY = 0;
        for (Student student : group) {
            Dorm dorm = student.getDorm();
            double centerX = dorm.getLayoutX() + dorm.getDormWidth() / 2;
            double centerY = dorm.getLayoutY() + dorm.getDormHeight() / 2;
            groupX += centerX;
            groupY += centerY;
        }
        groupX /= group.size();
        groupY /= group.size();

        // Обновляем положения меток
        campusCenter.update(campusCenterX, campusCenterY);
        groupCenter.update(groupX, groupY);
    }
}
