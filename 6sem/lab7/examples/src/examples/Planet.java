package examples;

public class Planet {
    String name;
    double distanceToSun; // расстояние до Солнца (например, в миллионах км)
    double mass;          // масса (относительно Земли)
    double diameter;      // диаметр (в км)

    // "Потоки" для сортировки
    Planet nextDistance;
    Planet nextMass;
    Planet nextDiameter;

    public Planet(String name, double distanceToSun, double mass, double diameter) {
        this.name = name;
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this.diameter = diameter;
        nextDistance = null;
        nextMass = null;
        nextDiameter = null;
    }
}
