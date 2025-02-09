package animalshop;

public class Animal {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected String color;

    Animal() {
        setColor("default color");
    }

    public Animal(String color) {
        setColor(color);
    }

    public void move(){
        System.out.println("Animal is movind");
    }
}
