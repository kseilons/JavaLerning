package animalshop;

public class Animal {
    protected String breed;
    protected String color;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Animal(String color) {
        this.color = color;
    }

}
