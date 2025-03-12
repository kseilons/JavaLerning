package second;

//Класс для создания объектов:
class MyClass{
// Целочисленное поле:
int number;
// Конструктор:
MyClass(int n){
   number=n;
}
}

class SwapFieldsDemo{
static void swap(MyClass A, MyClass B){
   System.out.println("Выполняется метод swap()");
   System.out.println("Объект A: "+A.number);
   System.out.println("Объект B: "+B.number);
   // Объекты "обмениваются" значениями полей:
   int number=B.number;
   B.number=A.number;
   A.number=number;
   System.out.println("Значения полей изменены");
   System.out.println("Объект A: "+A.number);
   System.out.println("Объект B: "+B.number);
   System.out.println("Завершено выполнение метода swap()");
}
// Главный метод программы:
public static void main(String[] args){
   // Создание объектов:
   MyClass A=new MyClass(100);
   MyClass B=new MyClass(200);
   // Значения поля number объектов A и B до
   // вызова метода swap():
   System.out.println("До вызова метода swap(): A.number="+A.number+" и B.number="+B.number);
   // Вызов метода swap():
   swap(A,B);
   // Значения поля number объектов A и B после
   // вызова метода swap():
   System.out.println("После вызова метода swap(): A.number="+A.number+" и B.number="+B.number);
}
}