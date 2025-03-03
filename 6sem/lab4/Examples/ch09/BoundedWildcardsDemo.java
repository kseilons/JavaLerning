// Первый класс:
class Alpha{
   // Закрытое текстовое поле:
   private String name;
   // Конструктор:
   Alpha(String txt){
      name=txt;
   }
   // Переопределение метода toString():
   public String toString(){
      return name;
   }
}
// Второй класс:
class Bravo extends Alpha{
   // Конструктор:
   Bravo(String txt){
      // Вызов конструктора суперкласса:
      super(txt);
   }
}
// Третий класс:
class Charlie extends Bravo{
   Charlie(String txt){
      super(txt);
   }
}
// Четвертый класс:
class Delta extends Charlie{
   Delta(String txt){
      super(txt);
   }
}
// Пятый класс:
class Echo extends Delta{
   Echo(String txt){
      super(txt);
   }
}
// Обобщенный класс:
class MyClass<T>{
   // Закрытое поле обобщенного типа:
   private T obj;
   // Переопределение метода toString():
   public String toString(){
      return obj.toString();
   }
   // Конструктор:
   MyClass(T arg){
      obj=arg;
   }
}
// Главный класс:
class BoundedWildcardsDemo{
   // Статический метод для отображения текстового
   // представления объекта, созданного с использованием
   // подкласса для класса Charlie:
   static void show(MyClass<? extends Charlie> obj){
      System.out.println(obj);
   }
   // Статический метод для отображения текстового
   // представления объекта, созданного с использованием
   // суперкласса для класса Charlie:
   static void display(MyClass<? super Charlie> obj){
      System.out.println(obj);
   }
   // Главный метод:
   public static void main(String[] args){
      // Создание объектов:
      MyClass<Alpha> A=new MyClass<>(new Alpha("Объект A"));
      MyClass<Bravo> B=new MyClass<>(new Bravo("Объект B"));
      MyClass<Charlie> C=new MyClass<>(new Charlie("Объект C"));
      MyClass<Delta> D=new MyClass<>(new Delta("Объект D"));
      MyClass<Echo> E=new MyClass<>(new Echo("Объект E"));
      // Вызов методов display() и show() с передачей
      // аргументом одного из созданных объектов:
      display(A);
      display(B);
      display(C);
      show(C);
      show(D);
      show(E);
   }
}