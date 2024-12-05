// Суперкласс:
class Alpha{
   // Текстовое поле:
   String name;
   // Метод для отображения сообщения:
   void objectCreated(){
      System.out.println("Создан объект класса Alpha");
   }
   // Метод для отображения сообщения:
   void hello(){
      System.out.println("Объект класса Alpha");
   }
   // Метод для отображения значения поля:
   void show(){
      // Вызов метода для отображения сообщения:
      hello();
      // Отображение значения поля:
      System.out.println("Поле name: "+name);
   }
   // Конструктор:
   Alpha(String txt){
      // Вызов метода для отображения сообщения:
      objectCreated();
      // Присваивание значения полю:
      name=txt;
   }
}
// Подкласс:
class Bravo extends Alpha{
   // Переопределение метода:
   void objectCreated(){
      System.out.println("Создан объект класса Bravo");
   }
   // Переопределение метода:
   void hello(){
      System.out.println("Объект класса Bravo");
   }
   // Конструктор:
   Bravo(String txt){
      // Вызов конструктора суперкласса:
      super(txt);
   }
}
// Главный класс:
class VirtualMethodsDemo{
   // Главный метод:
   public static void main(String[] args){
      // Создание объекта суперкласса:
      Alpha objA=new Alpha("alpha");
      // Отображение значения поля:
      objA.show();
      // Создание объекта подкласса:
      Bravo objB=new Bravo("bravo");
      // Отображение значения поля:
      objB.show();
   }
}