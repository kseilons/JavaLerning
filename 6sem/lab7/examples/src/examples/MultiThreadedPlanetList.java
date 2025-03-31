package examples;

public class MultiThreadedPlanetList {
    private Planet headDistance;
    private Planet headMass;
    private Planet headDiameter;

    public MultiThreadedPlanetList() {
        headDistance = null;
        headMass = null;
        headDiameter = null;
    }

    public void addPlanet(Planet planet) {
        headDistance = insertSortedByDistance(headDistance, planet);
        headMass = insertSortedByMass(headMass, planet);
        headDiameter = insertSortedByDiameter(headDiameter, planet);
    }

    private Planet insertSortedByDistance(Planet head, Planet planet) {
        if (head == null || planet.distanceToSun < head.distanceToSun) {
            planet.nextDistance = head;
            return planet;
        }
        Planet current = head;
        while (current.nextDistance != null && current.nextDistance.distanceToSun < planet.distanceToSun) {
            current = current.nextDistance;
        }
        planet.nextDistance = current.nextDistance;
        current.nextDistance = planet;
        return head;
    }

    private Planet insertSortedByMass(Planet head, Planet planet) {
        if (head == null || planet.mass < head.mass) {
            planet.nextMass = head;
            return planet;
        }
        Planet current = head;
        while (current.nextMass != null && current.nextMass.mass < planet.mass) {
            current = current.nextMass;
        }
        planet.nextMass = current.nextMass;
        current.nextMass = planet;
        return head;
    }

    private Planet insertSortedByDiameter(Planet head, Planet planet) {
        if (head == null || planet.diameter < head.diameter) {
            planet.nextDiameter = head;
            return planet;
        }
        Planet current = head;
        while (current.nextDiameter != null && current.nextDiameter.diameter < planet.diameter) {
            current = current.nextDiameter;
        }
        planet.nextDiameter = current.nextDiameter;
        current.nextDiameter = planet;
        return head;
    }

    public void printByDistance() {
        System.out.println("Планеты по расстоянию:");
        Planet current = headDistance;
        while (current != null) {
            System.out.println(current.name + " (" + current.distanceToSun + " млн км)");
            current = current.nextDistance;
        }
    }

    public void printByMass() {
        System.out.println("Планеты по массе:");
        Planet current = headMass;
        while (current != null) {
            System.out.println(current.name + " (" + current.mass + " масс Земли)");
            current = current.nextMass;
        }
    }

    public void printByDiameter() {
        System.out.println("Планеты по диаметру:");
        Planet current = headDiameter;
        while (current != null) {
            System.out.println(current.name + " (" + current.diameter + " км)");
            current = current.nextDiameter;
        }
    }

    public static void main(String[] args) {
        MultiThreadedPlanetList planetList = new MultiThreadedPlanetList();
        planetList.addPlanet(new Planet("Mercury", 57.9, 0.055, 4879));
        planetList.addPlanet(new Planet("Venus", 108.2, 0.815, 12104));
        planetList.addPlanet(new Planet("Earth", 149.6, 1.0, 12756));
        planetList.addPlanet(new Planet("Mars", 227.9, 0.107, 6792));
        planetList.addPlanet(new Planet("Jupiter", 778.5, 317.8, 142984));
        planetList.addPlanet(new Planet("Saturn", 1433.5, 95.2, 120536));
        planetList.addPlanet(new Planet("Uranus", 2872.5, 14.5, 51118));
        planetList.addPlanet(new Planet("Neptune", 4495.1, 17.1, 49528));

        planetList.printByDistance();
        System.out.println();
        planetList.printByMass();
        System.out.println();
        planetList.printByDiameter();
    }
}
