package labs.lab5.practic4;

import java.util.Random;

public class ComputeMethods {
    public double fToC (double degreesF) {
        double C = (5 * (degreesF -32)) / 9;
        return C;
    }
    public double hypotenuse(int a, int b) {
        double c = Math.sqrt(a * a + b * b);
        return c;
    }
    public int roll() {
        Random rand = new Random();
        int firstThrow = rand.nextInt(6) + 1;
        int secondThrow = rand.nextInt(6) + 1;
        int sum = firstThrow + secondThrow;
        return sum;
    }
}
