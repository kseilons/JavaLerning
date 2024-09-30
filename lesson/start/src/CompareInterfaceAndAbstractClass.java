package start.src;

public class CompareInterfaceAndAbstractClass {
    public static void main() {
        Dog dog = new Dog();
        dog.makeNoize();

        Cat cat  = new Cat();
        cat.makeNoize();
    }
}

class Dog implements AnimalZoo {
    public void makeNoize() {
        System.out.println("auh");
    }
}

class Cat implements AnimalZoo {
    public void makeNoize() {
        System.out.println("mouh");
    }
}

abstract class Animal {
    abstract void makeNoize();
}

interface AnimalZoo {
    abstract void makeNoize();
}