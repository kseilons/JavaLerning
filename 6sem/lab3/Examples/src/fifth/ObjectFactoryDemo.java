package fifth;

//Абстрактный суперкласс:
abstract class Base {
abstract void show();
}

class Alpha extends Base {
void show() {
   System.out.println("Объект класса Alpha");
}
}

class Bravo extends Base {
void show() {
   System.out.println("Объект класса Bravo");
}
}

class Charlie extends Base {
void show() {
   System.out.println("Объект класса Charlie");
}
}

//Главный класс:
class ObjectFactoryDemo {
static Base createObject(int n) {
   if (n == 1) return new Alpha();
   if (n == 2) return new Bravo();
   return new Charlie();
}

// Главный метод программы:
public static void main(String[] args) {
   // Объектная переменная абстрактного суперкласса:
   Base obj;
   for (int k = 1; k <= 3; k++) {
      // Создание объекта:
      obj = createObject(k);
      // Вызов из объекта метода:
      obj.show();
   }
}
}