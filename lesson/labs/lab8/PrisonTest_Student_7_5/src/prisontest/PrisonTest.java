package prisontest;

public class PrisonTest {
    public static void main(String[] args){
        Cell cell = new Cell("twith banned cell", false, 1234);
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cell);
        bubba.display();
        bubba.getCell().openCell(1235);
        bubba.getCell().openCell(1234);
        System.out.println(bubba.getHeight());
        System.out.println(bubba.getName());
        System.out.println(bubba.getCell().getName());
    }
}
