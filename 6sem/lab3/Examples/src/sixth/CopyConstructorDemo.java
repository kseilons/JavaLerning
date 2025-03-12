package sixth;
//Суперкласс:
class Base {
// Текстовое поле:
String name;

// Конструктор с текстовым аргументом:
Base(String txt) {
   name = txt;
}

// Конструктор создания копии:
Base(Base obj) {
   name = obj.name;
}
}

//Подкласс:
class MyClass extends Base {
// Целочисленное поле:
int code;

// Конструктор с текстовым и целочисленным полем:
MyClass(String txt, int n) {
   // Вызов конструктора суперкласса:
   super(txt);
   // Присваивание значения целочисленному полю:
   code = n;
}

// Конструктор создания копии:
MyClass(MyClass obj) {
   // Вызов конструктора суперкласса:
   super(obj);
   // Присваивание значения целочисленному полю:
   code = obj.code;
}

// Метод для отображения значений полей:
void show() {
   // Значение текстового поля:
   System.out.println("Текстовое поле: " + name);
   // Значение целочисленного поля:
   System.out.println("Целочисленное поле: " + code);
}
}

//Главный класс:
class CopyConstructorDemo {
public static void main(String[] args) {
   // Создание объекта с вызовом конструктора с двумя аргументами:
   MyClass A = new MyClass("Желтый", 200);
   // Создание объекта с вызовом конструктора создания копии:
   MyClass B = new MyClass(A);
   // Изменение значений полей первого объекта:
   A.name = "Красный";
   A.code = 100;
   // Создание объекта с вызовом конструктора создания копии (аргумент - анонимный объект):
   MyClass C = new MyClass(new MyClass("Зеленый", 300));

   // Отображение значений полей:
   System.out.println("Объект A");
   A.show();
   System.out.println("Объект B");
   B.show();
   System.out.println("Объект C");
   C.show();
}
}