package practiceRecursion;

import java.util.Scanner;

public class Linear {

    // Метод, который вычисляет факториал
    public static int factorial(int n) {
        // Базовый случай
        if (n <= 1) {
            return 1;
        } else {
            // Рекурсивная ветка
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int d;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число для вычисления факториала: ");
        
        // Проверяем, является ли введенное значение целым числом
        if (scanner.hasNextInt()) {
            d = scanner.nextInt();  
        } else {
            System.out.println("Введено не целое число. Используется значение по умолчанию: 5.");
            d = 5;
        }

        int result = factorial(d);

        System.out.println("Factorial [" + result + "] of [" + d + "]");

        scanner.close();
    }
}
