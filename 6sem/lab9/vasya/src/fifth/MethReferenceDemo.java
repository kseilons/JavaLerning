package fifth;

//Класс MyClass с приватным полем number
class MyClass {
 private int number;
 
 // Конструктор
 MyClass(int n) {
     number = n;
 }
 
 // Метод для установки значения
 void set(int n) {
     number = n;
 }
 
 // Метод для получения значения
 int get() {
     return number;
 }
}

//Функциональный интерфейс для получения значения
interface MyGetter {
 int myget(MyClass obj);  // Принимает объект MyClass
}

//Функциональный интерфейс для установки значения
interface MySetter {
 void myset(MyClass obj, int n);  // Принимает объект MyClass и значение
}

//Главный класс демонстрации
class MethReferenceDemo {
 public static void main(String[] args) {
     // Создаем объект MyClass с начальным значением 100
     MyClass obj = new MyClass(100);
     System.out.println("Создан объект с числом 100");
     
     // Создаем ссылки на методы класса (не привязанные к конкретному объекту)
     MyGetter A = MyClass::get;  // Ссылка на метод get
     MySetter B = MyClass::set;  // Ссылка на метод set
     
     // Получаем значение через ссылку A, передавая объект
     System.out.println("Значение A: " + A.myget(obj));
     System.out.println("Значение obj: " + obj.get());
     
     // Меняем значение напрямую через объект
     obj.set(200);
     System.out.println("Поле изменено на значение 200");
     
     // Проверяем значение через ссылку A
     System.out.println("Значение A: " + A.myget(obj));
     
     // Меняем значение через ссылку B, передавая объект
     B.myset(obj, 300);
     System.out.println("Выполнена команда B.myset(obj,300)");
     
     // Проверяем изменения
     System.out.println("Значение A: " + A.myget(obj));
     System.out.println("Значение obj: " + obj.get());
     
     // Создаем новый объект MyClass
     obj = new MyClass(400);
     System.out.println("Создан новый объект с числом 400");
     
     // Проверяем значения (теперь работаем с новым объектом)
     System.out.println("Значение A: " + A.myget(obj));
     System.out.println("Значение obj: " + obj.get());
     
     // Меняем значение нового объекта через ссылку B
     B.myset(obj, 500);
     System.out.println("Выполнена команда B.myset(obj,500)");
     
     // Проверяем изменения
     System.out.println("Значение A: " + A.myget(obj));
     System.out.println("Значение obj: " + obj.get());
 }
}