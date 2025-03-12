package tenth;

//Статический импорт:
import static javax.swing.JOptionPane.*;
//Внешний класс:
class BankAccount{
// Числовое поле (процентная ставка):
double rate;
// Поле - объект внутреннего класса:
Person fellow;
// Конструктор:
BankAccount(String name,double money,int time,double r){
   // Процентная ставка:
   rate=r;
   // Создание объекта внутреннего класса:
   fellow=new Person(name,money,time);
}
// Метод для отображения диалогового окна с сообщением:
void show(){
   showMessageDialog(null,
      // Текст сообщения (автоматически вызывается
      // метод toString() для класса Person):
      fellow,
      // Название окна:
      "Депозит",
      // Тип окна:
      INFORMATION_MESSAGE
   );
}
// Внутренний класс:
class Person{
   // Текстовое поле (имя вкладчика):
   String name;
   // Начальная сумма:
   double money;
   // Время, на которое размещается вклад:
   int time;
   // Метод для вычисления итоговой суммы:
   double getMoney(){
      // Переменная для записи результата:
      double s=money;
      // Вычисление результата:
      for(int k=1;k<=time;k++){
         s*=(1+rate/100);
      }
      // Уточнение результата (округление до
      // двух цифр после десятичной точки):
      s=Math.round(s*100)/100.0;
      // Результат метода:
      return s;
   }
   // Переопределение метода toString():
   public String toString(){
      String txt="Имя: "+name+"\n";
      txt+="Начальная сумма: "+money+"\n";
      txt+="Процентная ставка: "+rate+"\n";
      txt+="Время (лет): "+time+"\n";
      txt+="Итоговая сумма: "+getMoney();
      return txt;
   }
   // Конструктор внутреннего класса:
   Person(String txt,double m,int t){
      name=txt; // Имя вкладчика
      money=m;  // Начальная сумма вклада
      time=t;   // Время размещения вклада
   }
}
}
//Главный класс:
class UsingInnerClassDemo{
public static void main(String[] args){
   // Создание объекта внешнего класса:
   BankAccount ivanov=new BankAccount(
      "Иван Иванов", // Имя вкладчика
      1000.0,        // Начальная сумма
      5,             // Время размещения вклада
      8.0            // Процентная ставка
   );
   // Отображение информации по вкладу:
   ivanov.show();
}
}