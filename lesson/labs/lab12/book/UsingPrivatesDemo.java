//// Суперкласс:
//class Alpha{
//   // Закрытое поле:
//   private int code;
//   // Открытый метод для присваивания значения
//   // закрытому полю:
//   public void set(int code){
//      this.code=code;
//   }
//   // Открытый метод для отображения значения
//   // закрытого поля:
//   public void show(){
//      System.out.println("Поле code: "+code);
//   }
//   // Конструктор класса:
//   Alpha(int code){
//      set(code);
//   }
//}
//// Подкласс:
//class Bravo extends Alpha{
//   // Конструктор подкласса:
//   Bravo(int code){
//      // Вызов конструктора суперкласса:
//      super(code);
//   }
//}
//// Класс с главным методом программы:
//class UsingPrivatesDemo{
//   public static void main(String[] args){
//      // Создание объекта подкласса:
//      Bravo obj=new Bravo(100);
//      // Проверка значения поля:
//      obj.show();
//      // Присваивание значения полю:
//      obj.set(200);
//      // Отображение значения поля:
//      obj.show();
//   }
//}