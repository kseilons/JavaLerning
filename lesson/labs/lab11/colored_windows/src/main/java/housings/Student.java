package housings;

public class Student {
    private final String name;
    private final Dorm dorm;

    public Student(String name, Dorm dorm) {
        this.name = name;
        this.dorm = dorm;
    }

    public Dorm getDorm() {
        return dorm;
    }

    public String getName() {
        return name;
    }
}
