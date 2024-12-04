//// Суперкласс:
//class Alpha{
//   // Текстовое поле:
//   String name;
//}
//
//// Подкласс:
//class Bravo extends Alpha{
//   // Текстовое поле:
//   String name;
//   // Метод для отображения значений полей:
//   void show(){
//      // Значение унаследованного из суперкласса поля:
//      System.out.println("Из класса Alpha: "+super.name);
//      // Значение описанного в подклассе поля:
//      System.out.println("Из класса Bravo: "+name);
//   }
//   // Конструктор:
//   Bravo(String a,String b){
//      // Вызов конструктора (по умолчанию) суперкласса:
//      super();
//      // Значение унаследованного из суперкласса поля:
//      super.name=a;
//      // Значение описанного в подклассе поля:
//      name=b;
//   }
//}
//// Главный класс:
//class HidingFieldDemo{
//   public static void main(String[] args){
//      // Создание объекта подкласса:
//      Bravo obj=new Bravo("alpha","bravo");
//      // Проверка значений полей:
//      obj.show();
//   }
//}