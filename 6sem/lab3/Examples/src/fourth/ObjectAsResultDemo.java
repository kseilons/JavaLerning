package fourth;
//Класс:
class MyClass {
// Закрытые поля:
private int code;
private String name;

// Конструктор:
MyClass(int n, String s) {
   System.out.println("Создание объекта:");
   // Присваивание значений полям и
   // отображение этих значений:
   set(n, s).show();
}

MyClass set(int n) {
   // Присваивание значения целочисленному полю:
   code = n;
   // Результат метода:
   return this;
}

MyClass set(String s) {
   // Присваивание значения текстовому полю:
   name = s;
   // Результат метода:
   return this;
}

// Метод для присваивания значений полям,
// возвращающий результатом ссылку на объект:
MyClass set(int n, String s) {
   // Присваивание значений полям и результат метода:
   return set(n).set(s);
}

// Метод для отображения значений полей:
void show() {
   System.out.println("Поле code=" + code);
   System.out.println("Поле name=" + name);
   System.out.println("-----------------");
}
}

class ObjectAsResultDemo {
// Статический метод для создания объекта:
static MyClass createObject(int n, String s) {
   // Результат метода:
   return new MyClass(n, s);
}

// Главный метод программы:
public static void main(String[] args) {
   // Создание объекта:
   MyClass obj = createObject(100, "alpha");
   // Изменение значения целочисленного поля и 
   // отображение значений полей объекта:
   obj.set(200).show();
   // Изменение значения текстового поля и 
   // отображение значений полей объекта:
   obj.set("bravo").show();
   // Отображение значений полей:
   obj.show();
   // Создание объекта, изменение значений его полей
   // и вызов метода для отображения значений полей:
   createObject(300, "charlie").set(400, "delta").show();
}
}