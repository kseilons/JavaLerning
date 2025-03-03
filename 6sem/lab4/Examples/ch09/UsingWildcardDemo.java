// Обобщенный класс:
class MyClass<T>{
   // Поле обобщенного типа:
   T value;
   // Конструктор:
   MyClass(T val){
      value=val;
   }
}
// Главный класс:
class UsingWildcardDemo{
   // Статический обобщенный метод
   // (используется параметр обобщенного типа):
   static <T> void show(MyClass<T> obj){
      System.out.println("Вызов метода show():");
      // Отображение значения поля:
      System.out.println(obj.value);
   }
   // Статический метод, в котором используется
   // обобщенная подстановка:
   static void display(MyClass<?> obj){
      System.out.println("Вызов метода display():");
      // Отображение значения поля:
      System.out.println(obj.value);
   }
   // Главный метод:
   public static void main(String[] args){
      // При создании объекта явно указано значение
      // для обобщенного типа:
      MyClass<Integer> A=new MyClass<>(100);
      // При создании объекта не указано значение
      // для обобщенного типа:
      MyClass B=new MyClass<>('B');
      // При создании объекта использована
      // обобщенная подстановка:
      MyClass<?> C=new MyClass<>("Объект С");
      // Примеры вызова методов show() и display()
      // с разными аргументами:
      show(A);
      display(A);
      show(B);
      display(B);
      show(C);
      display(C);
   }
}