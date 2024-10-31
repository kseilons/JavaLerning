
package usingobjectwithmethodsdemo;

import javax.swing.JOptionPane;
// Описание класса:
class MyClass{
   // Поля класса:
   int number;
   char symbol;
   // Метод для присваивания значений полям:
   void set(int n,char s){
      number=n;
      symbol=s;
   }
   // Методом возвращается текстовая строка
   // с описанием объекта:
   String getInfo(){
      // Текст, который возвращается
      // результатом метода:
      String text="Число:  "+number+"\n";
      text+="Символ:  "+symbol;
      // Результат метода:
      return text;
   }
}
// Описание класса с главным методом программы:
class UsingObjectWithMethodsDemo{
   // Главный метод программы:
   public static void main(String[] args){
      // Создание первого объекта:
      MyClass objA=new MyClass();
      // Создание второго объекта:
      MyClass objB=new MyClass();
      // Присваивание значений полям первого объекта:
      objA.set(100,'A');
      // Присваивание значений полям второго объекта:
      objB.set(200,'B');
      // Отображение первого диалогового окна:
      JOptionPane.showMessageDialog(null,
         objA.getInfo(),  // Отображаемый текст
         "Первый объект", // Заголовок окна
         JOptionPane.INFORMATION_MESSAGE); // Тип окна
      // Отображение второго диалогового окна:
      JOptionPane.showMessageDialog(null,
         objB.getInfo(),  // Отображаемый текст
         "Второй объект", // Заголовок окна
         JOptionPane.INFORMATION_MESSAGE); // Тип окна
   }
}
