package start.src;

interface ISomeInterface extends IOtherInterface{
    int SOME_VARIABLE = 5; 
    int I = 5;
    void addTwoDigits(int one, int two);
        // Метод по умолчанию
    default void defaultMethod() {
        System.out.println("Это метод по умолчанию в интерфейсе MyInterface");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("Это статический метод в интерфейсе MyInterface");
    }
}


interface IOtherInterface {
    void someMethod();
}

interface Bancable {
    void bounce();
}


class Example implements ISomeInterface, Bancable {
    public void addTwoDigits(int one, int two) {
        Bancable bancable = new Bancable() {
            @Override
            public void bounce() {
                System.out.println("Hello");
            }
        };
        bancable.bounce();
    }

    public void someMethod() {

    }

    public void bounce() {

    }

    public void main() {
        Example example = new Example();
        System.out.println("hello from main");
        example.addTwoDigits(SOME_VARIABLE, I);
    }
}