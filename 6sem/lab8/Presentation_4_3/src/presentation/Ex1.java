package presentation;

public class Ex1 {
	    public static void main(String[] args) {
	        double limit = 4; // Задаем значение limit

	        // Вызов метода forward (итеративный способ)
	        double forwardResult = forward(limit);
	        System.out.println("Результат работы forward: " + forwardResult);

	        // Вызов метода backward (рекурсивный способ)
	        double backwardResult = backward(limit);
	        System.out.println("Результат работы backward: " + backwardResult);
	    }

	    // Метод, который вычисляет сумму итеративно
	    public static double forward(double limit) {
	        double num1 = 5, result = 0; // Определяем переменные

	        // Выполняем сложение num1 limit раз
	        for (double i = 0; i < limit; i++) {
	            result += num1;
	        }

	        return result; // Возвращаем результат
	    }

	    // Метод, который вычисляет сумму рекурсивно
	    public static double backward(double limit) {
	        double num = 5; // Определяем переменную

	        // Базовый случай: если limit <= 1, возвращаем num
	        if (limit <= 1) 
	            return num;
	        else
	            // Рекурсивно вызываем backward, уменьшая limit на 1
	            return backward(limit - 1) + num;
	    }
}
