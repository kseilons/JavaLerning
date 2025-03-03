// Обобщенный класс:
class Base<X>{
   // Обобщенное поле:
   X data;
   // Конструктор:
   Base(X data){
      this.data=data;
   }
   // Метод для отображения значения поля:
   void show(){
      System.out.println(data);
   }
}
// Подкласс на основе обобщенного класса с целочисленным
// типом вместо обобщенного:
class Alpha extends Base<Integer>{
   // Конструктор:
   Alpha(Integer n){
      // Вызов конструктора суперкласса:
      super(n);
   }
   // Переопределение метода:
   void show(){
      System.out.print("Целочисленное поле: ");
      // Вызов версии метода из суперкласса:
      super.show();
   }
}
// Подкласс на основе обобщенного класса с текстовым
// типом вместо обобщенного:
class Bravo extends Base<String>{
   // Конструктор:
   Bravo(String txt){
      // Вызов конструктора суперкласса:
      super(txt);
   }
   // Переопределение метода:
   void show(){
      System.out.print("Текстовое поле: ");
      // Вызов версии метода из суперкласса:
      super.show();
   }
}
// Подкласс на основе обобщенного класса с символьным
// типом вместо обобщенного:
class Charlie extends Base<Character>{
   // Конструктор:
   Charlie(Character s){
      // Вызов конструктора суперкласса:
      super(s);
   }
   // Переопределение метода:
   void show(){
      System.out.print("Символьное поле: ");
      // Вызов версии метода из суперкласса:
      super.show();
   }
}
// Главный класс:
class ExtendingGenClassDemo{
   // Главный метод:
   public static void main(String[] args){
      // Создание объектов:
      Alpha A=new Alpha(123);
      Bravo B=new Bravo("объект B");
      Charlie C=new Charlie('C');
      // Вызов метода show() из разных объектов:
      A.show();
      B.show();
      C.show();
   }
}