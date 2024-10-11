
package com.mycompany.examples;

class SwitchEx{
   // Метод для определения дня недели по номеру:
   static String getDay(int num){
      // Текстовая переменная для записи результата:
      String day;
      // Оператор выбора для определения дня недели:
      switch(num){
         case 1:
            day="понедельник";
            break;
         case 2:
            day="вторник";
            break;
         case 3:
            day="среда";
            break;
         case 4:
            day="четверг";
            break;
         case 5:
            day="пятница";
            break;
         case 6:
            day="суббота";
            break;
         case 7:
            day="воскресенье";
            break;
         default:
            day="неизвестно";
      }
      // Результат метода:
      return day;
   }
   // Метод для определения будних и выходных дней:
   static String testDay(int num){
      // Переменная для записи результата:
      String day;
      // Оператор выбора для определения
      // будних и рабочих дней:
      switch(num){
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            day="будний день";
            break;
         case 6:
         case 7:
            day="выходной день";
            break;
         default:
            day="неизвестно";
      }
      // Результат метода:
      return day;
   }
   // Главный метод программы:
   public static void main(String[] args){
      // Оператор цикла:
      for(int k=0;k<=8;k++){
         // Вызов статических методов:
         System.out.println(k+": "+getDay(k)+"\t- "+testDay(k));
      }
   }
}