// Суперкласс:
class Base{
   // Текстовое поле:
   String name;
   // Конструктор:
   Base(String txt){
      name=txt;
   }
   // Метод для отображения значения поля:
   void show(){
      System.out.println("Текстовое поле: "+name);
   }
}
// Подкласс суперкласса Base:
class Alpha extends Base{
   // Целочисленное поле:
   int number;
   // Конструктор:
   Alpha(String txt,int n){
      // Вызов конструктора суперкласса:
      super(txt);
      // Присваивание значения целочисленному полю:
      number=n;
   }
   // Переопределение метода:
   void show(){
      // Вызов версии метода из суперкласса:
      super.show();
      // Отображение значения целочисленного поля:
      System.out.println("Целочисленное поле: "+number);
   }
}
// Подкласс суперкласса Alpha:
class Bravo extends Alpha{
   // Символьное поле:
   char symbol;
   // Конструктор:
   Bravo(String txt,int n,char s){
      // Вызов конструктора суперкласса:
      super(txt,n);
      // Присваивание значения символьному полю:
      symbol=s;
   }
   // Переопределение метода:
   void show(){
      // Вызов версии метода из суперкласса:
      super.show();
      // Отображение значения символьного поля:
      System.out.println("Символьное поле: "+symbol);
   }
}
// Обобщенный класс:
class MyClass<X extends Base>{
   // Поле обобщенного типа:
   X obj;
   // Конструктор:
   MyClass(X obj){
      // Значение поля:
      this.obj=obj;
   }
   // Метод обобщенного класса:
   void show(){
      System.out.println("Объект класса MyClass");
      // Вызов метода из поля обобщенного типа:
      obj.show();
   }
}
// Главный класс:
class GenTypeExtendingDemo{
   // Главный метод:
   public static void main(String[] args){
      // Объекты создаются на основе обобщенного класса:
      MyClass<Alpha> A=new MyClass<>(new Alpha("Alpha",123));
      MyClass<Bravo> B=new MyClass<>(new Bravo("Bravo",321,'B'));
      // Вызов метода show() из объектов:
      A.show();
      B.show();
   }
}