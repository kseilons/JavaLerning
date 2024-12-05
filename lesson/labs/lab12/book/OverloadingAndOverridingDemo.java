//// Суперкласс:
//class Alpha{
//   // Версия метода без аргумента:
//   void show(){
//      System.out.println("Класс Alpha");
//   }
//   // Версия метода с текстовым аргументом:
//   void show(String txt){
//      System.out.println(txt);
//   }
//}
//// Подкласс:
//class Bravo extends Alpha{
//   // Переопределение версии метода без аргументов:
//   void show(){
//      System.out.println("Класс Bravo");
//   }
//   // Версия метода с целочисленным аргументом:
//   void show(int num){
//      System.out.println("Число "+num);
//   }
//}
//// Главный класс:
//class OverloadingAndOverridingDemo{
//   // Главный метод:
//   public static void main(String[] args){
//      // Создание объекта суперкласса:
//      Alpha objA=new Alpha();
//      // Вызов разных версий метода:
//      objA.show();
//      objA.show("Объект objA");
//      // Создание объекта подкласса:
//      Bravo obj=new Bravo();
//      // Вызов разных версий метода:
//      obj.show();
//      obj.show("Объект objB");
//      obj.show(123);
//   }
//}