package integralCalculator;

public class IntegralCalculator {

    // Метод интегрирования методом прямоугольников
    public static double integrateByRectangles(double t, int n) throws IllegalArgumentException {
        if (t <= 0 || n <= 0) {
            throw new IllegalArgumentException("Параметры должны быть положительными: t > 0, n > 0");
        }

        double h = t / n; // Шаг разбиения
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            double x = i * h; // Левая граница прямоугольника
            sum += Math.sqrt(x); // Значение функции в точке x
        }
        
        return sum * h;
    }
  
    // Метод интегрирования методом трапеций
    public static double integrateByTrapezoids(double t, int n) throws IllegalArgumentException {
        if (t <= 0 || n <= 0) {
            throw new IllegalArgumentException("Параметры должны быть положительными: t > 0, n > 0");
        }

        double h = t / n; // Шаг разбиения
        
        double sum = 0.5 * (Math.sqrt(0) + Math.sqrt(t));
        for (int i = 1; i < n; i++) {
            double x = i * h;
            sum += Math.sqrt(x);
        }

        return sum * h;
    }
    

    public static void main(String[] args) {
        double t = 4.0;
        int n = 1000;

        double resultRectangle = integrateByRectangles(t, n);
        double resultTrapezoid = integrateByTrapezoids(t, n);

        // Аналитическое решение: интеграл sqrt(x) dx от 0 до t = (2/3) * t^(3/2)
        double analyticalResult = (2.0 / 3.0) * Math.pow(t, 1.5);

        System.out.println("Метод прямоугольников: " + resultRectangle);
        System.out.println("Метод трапеций: " + resultTrapezoid);
        System.out.println("Аналитический результат: " + analyticalResult);
    }
}
