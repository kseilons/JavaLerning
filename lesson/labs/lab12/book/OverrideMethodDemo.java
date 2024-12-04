//// Суперкласс:
//class Alpha{
//   // Текстовое поле:
//   String name;
//   // Метод для отображения значения текстового поля:
//   void show(){
//      System.out.println("Объект класса Alpha:");
//      System.out.println("Поле name - "+name);
//   }
//   // Конструктор класса:
//   Alpha(String name){
//      this.name=name;
//   }
//}
//// Подкласс:
//class Bravo extends Alpha{
//   // Целочисленное поле:
//   int code;
//   // Переопределение метода. Новой версией метода
//   // отображаются значения двух полей:
//   void show(){
//      System.out.println("Объект класса Bravo:");
//      System.out.println("Поле name - "+name);
//      System.out.println("Поле code - "+code);
//   }
//   // Конструктор класса:
//   Bravo(String name,int code){
//      // Вызов конструктора суперкласса:
//      super(name);
//      this.code=code;
//   }
//}
//class OverrideMethodDemo{
//   public static void main(String[] args){
//      // Создание объекта суперкласса:
//      Alpha objA=new Alpha("objA");
//      // Создание объекта подкласса:
//      Bravo objB=new Bravo("objB",123);
//      // Вызов метода из объекта суперкласса:
//      objA.show();
//      // Вызов метода из объекта подкласса:
//      objB.show();
//   }
//}