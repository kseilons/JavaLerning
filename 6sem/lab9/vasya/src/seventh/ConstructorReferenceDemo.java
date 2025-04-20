package seventh;

//Класс MyClass
class MyClass {
 // Приватное поле number
 private int number;
 
 // Конструктор класса
 MyClass(int n) {
     number = n;
 }
 
 // Метод для отображения значения
 void show() {
     System.out.println("Значение поля: " + number);
 }
 
 // Метод для установки значения
 void set(int n) {
     number = n;
 }
}

//Функциональный интерфейс
interface MyInterface {
 MyClass create(int n);  // Метод для создания объекта
}

//Главный класс демонстрации
class ConstructorReferenceDemo {
 public static void main(String[] args) {
     // Создание ссылки на конструктор
     MyInterface ref = MyClass::new;  // Ссылка на конструктор MyClass
     
     // Создание объекта через ссылку на конструктор
     MyClass obj = ref.create(100);  // Эквивалентно new MyClass(100)
     
     // Работа с созданным объектом
     obj.show();    // Выведет: Значение поля: 100
     obj.set(200);  // Изменяем значение
     obj.show();    // Выведет: Значение поля: 200
 }
}