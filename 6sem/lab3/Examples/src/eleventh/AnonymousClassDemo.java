package eleventh;

//Абстрактный суперкласс:
abstract class Base{
// Текстовое поле:
private String name;
// Конструктор:
Base(String txt){
   name=txt;
}
// Метод для отображения значения текстового поля:
void show(){
   System.out.println("Имя объекта: "+name);
}
// Объявление абстрактного метода:
abstract void hello();
}

//Главный класс:
class AnonymousClassDemo{
public static void main(String[] args){
   // Создание объекта анонимного класса:
   Base obj=new Base("Красный"){
      // Описание абстрактного метода из суперкласса:
      void hello(){
         System.out.println("Объект анонимного класса");
      }
   }; // Завершение инструкции создания объекта анонимного класса
   
   // Вызов методов из объекта, созданного на основе анонимного класса:
   obj.show();
   obj.hello();

   // Создание анонимного объекта анонимного класса
   // и вызов из этого объекта метода showAll(),
   // описанного в анонимном классе:
   new Base("Зеленый"){
      // Описание абстрактного метода из суперкласса:
      void hello(){
         System.out.println("Анонимный объект");
      }
      // Описание нового метода:
      void showAll(){
         hello();
         show();
      }
   }.showAll(); // Вызов метода
}
}