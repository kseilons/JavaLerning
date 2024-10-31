
package usingconstructordemo;

// Описание класса:
class MyClass{
   // Поля класса:
   int number;
   char symbol;
   // Конструктор класса без аргументов:
   MyClass(){
      // Присваивание значений полям:
      number=100;
      symbol='A';
   }
   // Конструктор класса с двумя аргументами:
   MyClass(int n,char s){
      // Присваивание значений полям:
      number=n;
      symbol=s;
   }
   // Метод для отображения значений полей объекта:
   void show(){
      System.out.println("Значения полей "+number+" и "+symbol);
   }
}
// Описание класса с главным методом программы:
class UsingConstructorDemo{
   // Главный метод программы:
   public static void main(String[] args){
      // Создание первого объекта
      // (вызывается конструктор без аргументов):
      MyClass objA=new MyClass();
      // Создание второго объекта
      // (вызывается конструктор с двумя аргументами):
      MyClass objB=new MyClass(200,'B');
      // Отображение значений полей первого объекта:
      System.out.println("Объект objA:");
      objA.show();
      // Отображение значений полей второго объекта:
      System.out.println("Объект objB:");
      objB.show();
   }
}


