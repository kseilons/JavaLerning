package presentation;

public class FibonacciExample {
    // Метод для вычисления n-го числа Фибоначчи
    public static double fibonacci(double d) {
        if (d < 2) {
            return d;  // Базовый случай: F(0) = 0, F(1) = 1
        } else {
            return fibonacci(d - 1) + fibonacci(d - 2); // Рекурсивный вызов
        }
    }

    public static void main(String[] args) {
        int n = 5; // Вычислим 5-е число Фибоначчи
        double result = fibonacci(n);
        System.out.println("Число Фибоначчи F(" + n + ") = " + result);
    }
}

