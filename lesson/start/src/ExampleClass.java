package start.src;

public class ExampleClass {
    
}


class Car {
    int speed;
    void Run() {}

    void Stop() {
        speed = 0;
    }
}

class Car2 {
    int speed2;
    void Run2() {}


    void Stop2() {
        speed2 = 0;
    }
}


class Ferrary extends Car {
    @Override
    void Run() {
        speed = 25;
    }
}