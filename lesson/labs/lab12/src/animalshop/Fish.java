package animalshop;

public class Fish extends Animal {
    private String species;
    private double length;


    public Fish(String species, double length, String color) {
        super(color);
        this.species = species;
        this.length = length;
    }

    public String getSpecies() {
        return species;
    }

    public double getLength() {
        return length;
    }

    public void displayInfo() {
        System.out.println("Fish species: " + species);
        System.out.println("Fish length: " + length);
        System.out.println("Color: " + color);
    }
}
