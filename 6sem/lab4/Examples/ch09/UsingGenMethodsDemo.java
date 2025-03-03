// Класс с обобщенным методом:
class MyClass{
   // Текстовое поле:
   String name;
   // Обобщенный метод:
   <X> void show(X arg){
      System.out.println(name+": "+arg);
   }
   // Конструктор:
   MyClass(String txt){
      name=txt;
   }
}
// Главный класс:
class UsingGenMethodsDemo{
   // Главный метод:
   public static void main(String[] args){
      // Создание объектов:
      MyClass A=new MyClass("Объект A");
      MyClass B=new MyClass("Объект B");
      // Вызов обобщенных методов из разных объектов:
      A.show(123);
      A.show("Alpha");
      A.show('A');
      B.show(123);
      B.show("Bravo");
      B.show('B');
   }
}