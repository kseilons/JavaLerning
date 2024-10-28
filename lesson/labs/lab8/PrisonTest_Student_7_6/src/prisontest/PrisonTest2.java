package prisontest;

public class PrisonTest2 {
    public static void main(String[] args){
        Cell2 cellA1 = new Cell2("A1", false, 1234);
        Cell2 cellB1 = new Cell2("B1", false, 1234);
        Cell2 cellC1 = new Cell2("C1", false, 1234);
        Cell2 cellD1 = new Cell2("D1", false, 1234);
        
        Prisoner2 bubba = new Prisoner2("Bubba", 2.08, 4, cellA1);
        System.out.println(Prisoner2.getPrisonerCount());
//        bubba.display();
//        Prisoner2 biba = new Prisoner2("Biba", 2.08, 4, cellA1);
//        biba.display();
//        bubba.display();

        
    }
}
