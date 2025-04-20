package eigth;

//Класс с перегруженными методами
class MyClass {
 // Поле класса
 int number;
 
 // Перегруженные методы set()
 void set() {          // Версия без параметров
     number = 0;
 }
 
 void set(int n) {     // Версия с параметром
     number = n;
 }
}

//Функциональный интерфейс без параметров
interface Alpha {
 void none();
}

//Функциональный интерфейс с одним параметром
interface Bravo {
 void one(int n);
}

//Главный класс демонстрации
class OverloadedMethRefDemo {
 public static void main(String[] args) {
     // Создаем объект MyClass
     MyClass obj = new MyClass();
     
     // Создаем ссылки на перегруженные методы
     Alpha A = obj::set;   // Ссылка на set() без параметров
     Bravo B = obj::set;   // Ссылка на set(int n) с параметром
     
     // Вызываем метод через интерфейс Bravo (с параметром)
     B.one(100);
     System.out.println("Значение поля: " + obj.number); // Выведет 100
     
     // Вызываем метод через интерфейс Alpha (без параметров)
     A.none();
     System.out.println("Значение поля: " + obj.number); // Выведет 0
 }
}