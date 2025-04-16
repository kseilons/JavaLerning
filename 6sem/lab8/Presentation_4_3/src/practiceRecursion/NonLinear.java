package practiceRecursion;

import java.util.Scanner;

public class NonLinear {

    public static double fibonacci(double d) {
        if (d < 2) {
            return d;
        } else {
            return fibonacci(d - 1) + fibonacci(d - 2);
        }
    }

    public static void main(String[] args) {
    	int d;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число для вычисления чисел Фибоначчи: ");

        if (scanner.hasNextInt()) {
            d = scanner.nextInt();  
        } else {
            System.out.println("Введено не целое число. Используется значение по умолчанию: 5.");
            d = 5;
        }

        for (int i = 0; i <= d; i++) {
            double result = fibonacci(i);
            System.out.println("Fibonacci index [" + i + "] value [" + result + "]");
        }
    }
}

