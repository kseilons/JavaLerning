package sixth;

//Класс со статическими методами
class MyClass {
 // Статический метод для отображения сообщения
 static void show() {
     System.out.println("Метод класса MyClass");
 }
 
 // Статический метод для вычисления суммы чисел
 static int sum(int n) {
     int k, s = 0;
     for (k = 1; k <= n; k++) {
         s += k;
     }
     return s;
 }
}

//Функциональный интерфейс для отображения
interface MyShow {
 void myshow();
}

//Функциональный интерфейс для вычисления суммы
interface MySum {
 int mysum(int n);
}

//Функциональный интерфейс для печати
interface MyPrinter {
 void myprint(Object t);
}

//Главный класс демонстрации
class StatMethReferenceDemo {
 public static void main(String[] args) {
     // Создание ссылок на статические методы
     MyShow A = MyClass::show;         // Ссылка на статический метод show()
     MySum B = MyClass::sum;          // Ссылка на статический метод sum()
     MyPrinter P = System.out::println; // Ссылка на метод println
     
     // Вызsов методов через функциональные интерфейсы
     A.myshow();  // Эквивалентно вызову MyClass.show()
     P.myprint("Сумма чисел: " + B.mysum(10));  // Вычисление и печать суммы
 }
}