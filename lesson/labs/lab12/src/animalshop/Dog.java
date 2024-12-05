package animalshop;

public class Dog extends Animal {
    private String name;
    private String breed;
    private String barkNoise = "Woof";
    private double weight;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public Dog(String name, String breed, double weight, String color) {
        super(color);
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public Dog(String name, String breed, String barkNoise, double weight, String color) {
        this(name, breed, weight, color);
        this.barkNoise = barkNoise;
    }

    public void bark() {
        System.out.println(barkNoise);
    }

    public void bark(String barkNoise) {
        System.out.println(barkNoise);
    }

    public void displayInfo() {
        System.out.println("Dog name: " + getName());
        System.out.println("Dog breed: " + getBreed());
        System.out.println("Bark noise: " + barkNoise);
        System.out.println("Dog weight: " + getWeight());
        System.out.println("Color: " + color);
    }

}

