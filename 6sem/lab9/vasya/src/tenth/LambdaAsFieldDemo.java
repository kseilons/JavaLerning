package tenth;
//Функциональный интерфейс
interface MyInterface {
 // Метод, принимающий int и возвращающий int
 int getNumber(int n);
}

//Класс с полем-функцией
class MyClass {
 // Приватное поле для хранения функции
 private MyInterface ref;
 
 // Конструктор
 MyClass(MyInterface mi) {
     set(mi);
 }
 
 // Метод для установки функции
 void set(MyInterface mi) {
     ref = mi;
 }
 
 // Метод для выполнения функции
 int get(int n) {
     // Вызов функции, хранящейся в поле ref
     return ref.getNumber(n);
 }
}

//Главный класс
class LambdaAsFieldDemo {
 public static void main(String[] args) {
     // Создаем объект MyClass с лямбда-выражением (квадрат числа)
     MyClass obj = new MyClass((int n) -> { return n * n; });
     
     // Выводим результаты
     System.out.println("Числа:");
     for (int k = 0; k <= 5; k++) {
         System.out.print(k + "\t");
     }
     
     System.out.println("\nКвадраты чисел:");
     for (int k = 0; k <= 5; k++) {
         System.out.print(obj.get(k) + "\t");
     }
     
     // Меняем функцию на кубы чисел
     obj.set((int n) -> { return n * n * n; });
     
     // Выводим новые результаты
     System.out.println("\nКубы чисел:");
     for (int k = 0; k <= 5; k++) {
         System.out.print(obj.get(k) + "\t");
     }
     System.out.println("");
 }
}