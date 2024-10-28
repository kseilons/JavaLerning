package prisontest;

public class Prisoner2 {
    //Fields 
    private String name;
    private double height;
    private int sentence;
    private Cell2 cell;

    public static int getPrisonerCount() {
        return prisonerCount;
    }

    private static int prisonerCount = 0;

    public int getBookingNumber() {
        return bookingNumber;
    }

    private int bookingNumber;

    //Constructor
    public Prisoner2(String name, double height, int sentence, Cell2 cell){
 	this.name = name;
 	this.height = height;
 	this.sentence = sentence;
    this.cell = cell;
    prisonerCount++;
    this.bookingNumber = prisonerCount;
    }

    
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        System.out.println("Name: " +getName());
        System.out.println("Height: " +getHeight() +"m");
        System.out.println("Sentence: " +getSentence() +" yrs");
        System.out.println("Cell: " +getCell().getName());
        System.out.println("prisonerCount: " + prisonerCount);
        System.out.println("bookingNumber: " + getBookingNumber());
    }
    
    //Getters
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public int getSentence() {
        return sentence;
    }
    public Cell2 getCell() {
        return cell;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    public void setCell(Cell2 cell) {
        this.cell = cell;
    }
}
