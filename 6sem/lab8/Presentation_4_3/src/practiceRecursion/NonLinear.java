package practiceRecursion;

import java.util.Scanner;

public class NonLinear {

    // Метод, который вычисляет число Фибоначчи
    public static double fibonacci(double d) {
        // Базовый случай: если значение меньше 2, возвращаем d
        if (d < 2) {
            return d;
        } else {
            // Рекурсивная ветка: возвращаем сумму двух предыдущих чисел Фибоначчи
            return fibonacci(d - 1) + fibonacci(d - 2);
        }
    }

    public static void main(String[] args) {
    	int d;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число для вычисления чисел Фибоначчи: ");
        
        // Проверяем, является ли введенное значение целым числом
        if (scanner.hasNextInt()) {
            d = scanner.nextInt();  
        } else {
            System.out.println("Введено не целое число. Используется значение по умолчанию: 5.");
            d = 5;
        }

        // Выводим результаты для индексов от 0 до d
        for (int i = 0; i <= d; i++) {
            double result = fibonacci(i);
            System.out.println("Fibonacci index [" + i + "] value [" + result + "]");
        }
    }
}

