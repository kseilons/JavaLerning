//import javax.swing.*;
//// Класс создается наследование класса JOptionPane:
//class MyPane extends JOptionPane{
//   // Статический метод с двумя аргументами
//   // для отображения диалогового окна:
//   static void showMessage(String txt,String title){
//      // Вызов статического метода showMessageDialog() из
//      // класса JOptionPane:
//      showMessageDialog(null,txt,title,PLAIN_MESSAGE, new ImageIcon("d:/books/pictures/giraffe.png"));
//   }
//   // Статический метод с одним аргументом
//   // для отображения диалогового окна:
//   static void showMessage(String txt){
//      // Вызов версии метода с двумя аргументами:
//      showMessage(txt,"Сообщение");
//   }
//   // Статический метод для отображения окна с полем ввода
//   // для считывания целого числа:
//   static int getInteger(String txt){
//      // Текстовая переменная:
//      String res;
//      // Отображение окна с полем ввода с помощью
//      // метода showInputDialog() из класса JOptionPane:
//      res=showInputDialog(null,txt,"Число (по умолчанию  10)",QUESTION_MESSAGE);
//      // Проверяется значение текстовой переменной:
//      if(res==null){
//         // Если пользователь отменил ввод числа
//         // (значение, возвращаемое по умолчанию):
//         return 10;
//      }
//      else{
//         // Преобразование текстового представления числа
//         // в число:
//         return Integer.parseInt(res);
//      }
//   }
//}
//// Класс с главным методом программы:
//class ExtendingJOptionPaneDemo{
//   public static void main(String[] args){
//      // Отображение диалогового окна с сообщением:
//      MyPane.showMessage("Всем привет!");
//      // Переменная для записи числового значения:
//      int number;
//      // Отображение диалогового окна с полем ввода
//      // и считывание целочисленного значения:
//      number=MyPane.getInteger("Введите целое число");
//      // Текст для отображения в диалоговом окне:
//      String txt="Числа от 1 до "+number+":\n";
//      // Формирование текстовой строки с
//      // последовательностью натуральных чисел:
//      for(int k=1;k<=number;k++){
//         txt+=k+" ";
//      }
//      // Отображение диалогового окна с сообщением:
//      MyPane.showMessage(txt,"Целые числа");
//   }
//}