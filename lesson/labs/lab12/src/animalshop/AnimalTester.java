package animalshop;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Animal("Blue");
        Dog dog1 = new Dog("Ace", "Beagle", 45.6, "Brown");
        Dog dog2 = new Dog("Bailey", "Boerboel", "arf-arf", 80.2, "Black");


        Fish fish1 = new Fish("Goldfish", 0.2, "Golden");

        Fish fish2 = new Fish();

        System.out.println("Dog 1 Info:");
        dog1.displayInfo();
        System.out.println();

        System.out.println("Dog 2 Info:");
        dog2.displayInfo();
        System.out.println();

        System.out.println("Fish Info:");
        fish1.displayInfo();

        System.out.println("Fish 2 Info:");
        fish2.displayInfo();
        animal.move();
        dog1.move();
        fish1.move();

    }
}

