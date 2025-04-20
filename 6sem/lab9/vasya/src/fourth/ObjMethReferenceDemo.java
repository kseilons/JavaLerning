package fourth;


//Класс MyClass
class MyClass {
 // Закрытое целочисленное поле
 private int number;
 
 // Конструктор
 MyClass(int n) {
     number = n;
 }
 
 // Метод для установки значения поля
 void set(int n) {
     number = n;
 }
 
 // Метод для получения значения поля
 int get() {
     return number;
 }
}

//Функциональный интерфейс для получения значения
interface MyGetter {
 int myget();
}

//Функциональный интерфейс для установки значения
interface MySetter {
 void myset(int n);
}

//Главный класс демонстрации ссылок на методы объекта
class ObjMethReferenceDemo {
 public static void main(String[] args) {
     // Создание объекта
     MyClass obj = new MyClass(100);
     System.out.println("Создан объект с числом 100");
     
     // Создание ссылок на методы объекта
     MyGetter A = obj::get;  // Ссылка на метод get()
     MySetter B = obj::set;  // Ссылка на метод set()
     
     // Использование функционального интерфейса для получения значения
     System.out.println("Переменная A: " + A.myget());
     System.out.println("Переменная obj: " + obj.get());
     
     // Изменение значения напрямую
     obj.set(200);
     System.out.println("Поле изменено на значение 200");
     
     // Проверка через ссылку
     System.out.println("Переменная A: " + A.myget());
     
     // Изменение значения через функциональный интерфейс
     B.myset(300);
     System.out.println("Выполнена команда B.myset(300)");
     
     // Проверка изменений
     System.out.println("Переменная A: " + A.myget());
     System.out.println("Переменная obj: " + obj.get());
     
     // Создание нового объекта
     obj = new MyClass(400);
     System.out.println("Создан новый объект с числом 400");
     
     // Проверка (ссылки A и B продолжают ссылаться на старый объект!)
     System.out.println("Переменная A: " + A.myget());
     System.out.println("Переменная obj: " + obj.get());
     
     // Попытка изменить значение через старую ссылку
     B.myset(500);
     System.out.println("Выполнена команда B.myset(500)");
     
     // Проверка (изменяется старый объект, не новый)
     System.out.println("Переменная A: " + A.myget());
     System.out.println("Переменная obj: " + obj.get());
 }
}