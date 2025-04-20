// Функциональный интерфейс:
interface MyFunction {
    double f(double x);
}

// Главный класс:
class IntegralCalcDemo {

    // 1. Метод трапеций (уже был)
    static double integrateTrapezoidal(MyFunction obj, double a, double b) {
        int n = 1000;
        double h = (b - a) / n;
        double s = (obj.f(a) + obj.f(b)) * h / 2;
        for (int k = 1; k <= n - 1; k++) {
            s += h * obj.f(a + k * h);
        }
        return s;
    }

    // 2. Метод прямоугольников (левый)
    static double integrateRectangles(MyFunction obj, double a, double b) {
        int n = 1000;
        double h = (b - a) / n;
        double s = 0;
        for (int k = 0; k < n; k++) {
            s += h * obj.f(a + k * h);
        }
        return s;
    }

    // 3. Метод Монте-Карло
    static double integrateMonteCarlo(MyFunction obj, double a, double b, int samples) {
        double sum = 0;
        for (int i = 0; i < samples; i++) {
            double x = a + Math.random() * (b - a);
            sum += obj.f(x);
        }
        return (b - a) * sum / samples;
    }

    // Главный метод:
    public static void main(String[] args) {
        // Тестируем все три метода на разных функциях
        System.out.println("Метод трапеций: " + integrateTrapezoidal((double x) -> x * (1 - x), 0, 1) + " (точное: " + (1.0 / 6) + ")");
        System.out.println("Метод прямоугольников: " + integrateRectangles((double x) -> x * (1 - x), 0, 1) + " (точное: " + (1.0 / 6) + ")");
        System.out.println("Метод Монте-Карло: " + integrateMonteCarlo((double x) -> x * (1 - x), 0, 1, 100_000) + " (точное: " + (1.0 / 6) + ")");

        System.out.println("\nМетод трапеций (1/x): " + integrateTrapezoidal((double x) -> 1 / x, 1, 2) + " (точное: " + Math.log(2) + ")");
        System.out.println("Метод прямоугольников (1/x): " + integrateRectangles((double x) -> 1 / x, 1, 2) + " (точное: " + Math.log(2) + ")");
        System.out.println("Метод Монте-Карло (1/x): " + integrateMonteCarlo((double x) -> 1 / x, 1, 2, 100_000) + " (точное: " + Math.log(2) + ")");

        System.out.println("\nМетод трапеций (exp(-x)): " + integrateTrapezoidal((double x) -> Math.exp(-x), 0, 10) + " (точное: " + (1 - Math.exp(-10)) + ")");
        System.out.println("Метод прямоугольников (exp(-x)): " + integrateRectangles((double x) -> Math.exp(-x), 0, 10) + " (точное: " + (1 - Math.exp(-10)) + ")");
        System.out.println("Метод Монте-Карло (exp(-x)): " + integrateMonteCarlo((double x) -> Math.exp(-x), 0, 10, 100_000) + " (точное: " + (1 - Math.exp(-10)) + ")");
    }
}