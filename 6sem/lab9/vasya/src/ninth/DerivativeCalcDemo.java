package ninth;

//Функциональный интерфейс для математических функций
interface MyFunction {
 // Метод, принимающий double и возвращающий double
 double f(double x);
}

//Главный класс для вычисления производных
class DerivativeCalcDemo {
 // Метод для вычисления производной функции
 static MyFunction Derivative(MyFunction ref) {
     // Малое приращение для численного дифференцирования
     double dx = 1e-5;
     
     // Возвращаем лямбда-выражение, вычисляющее производную
     return (double x) -> {
         return (ref.f(x + dx) - ref.f(x)) / dx;
     };
 }

 public static void main(String[] args) {
     // Вычисляем производную для первой функции: f(x) = x*(3-x)
     MyFunction A = Derivative((double x) -> { return x * (3 - x); });
     
     // Вычисляем производную для второй функции: f(x) = x*e^(-x)
     MyFunction B = Derivative((double x) -> { return x * Math.exp(-x); });
     
     // Выводим результаты для первой функции и аналитическое решение
     System.out.println("Производная для первой функции");
     System.out.println("Численно:\tАналитически:");
     for (double t = 0; t <= 5; t++) {
         System.out.printf("%8.5f\t%8.5f\n", A.f(t), (3 - 2 * t));
     }
     
     // Выводим результаты для второй функции и аналитическое решение
     System.out.println("Производная для второй функции");
     System.out.println("Численно:\tАналитически:");
     for (double t = 0; t <= 5; t++) {
         System.out.printf("%8.5f\t%8.5f\n", B.f(t), Math.exp(-t) * (1 - t));
     }
 }
}