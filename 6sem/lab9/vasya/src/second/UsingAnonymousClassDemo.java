package second;

//Определение интерфейса
interface MyNums {
 // Метод по умолчанию для отображения информации
 default void show(int n) {
     System.out.println("Аргумент: " + n);
     System.out.println("Результат: " + get(n));
 }
 
 // Абстрактный метод, который нужно реализовать
 int get(int n);
}

//Главный класс демонстрации анонимного класса
class UsingAnonymousClassDemo {
 public static void main(String[] args) {
     // Создание анонимного класса
     // и присваивание его экземпляра переменной интерфейса:
     MyNums A = new MyNums() {
         // Реализация абстрактного метода:
         public int get(int n) {
             int k, s = 0;
             // Вычисление суммы чисел от 1 до n
             for (k = 1; k <= n; k++) {
                 s += k;
             }
             return s;
         }
     };
     
     System.out.println("Использование анонимного класса:");
     A.show(10);
     System.out.println("Проверка: " + A.get(10));
     
     // Создание новой ссылки на тот же объект
     MyNums B = A;
     System.out.println("Новый анонимный класс:");
     
     // Создание нового анонимного класса
     // с другой реализацией метода:
     A = new MyNums() {
         // Новая реализация метода:
         public int get(int n) {
             return n * n;  // Возвращаем квадрат числа
         }
     };
     
     System.out.println("Вызов show() из A:");
     A.show(10);  // Выведет квадрат числа (100)
     System.out.println("Вызов show() из B:");
     B.show(10);  // Выведет сумму чисел (55)
 }
}