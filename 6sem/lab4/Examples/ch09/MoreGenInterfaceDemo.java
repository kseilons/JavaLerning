// Обобщенный интерфейс:
interface MyMethods<X>{
   X get();
   void set(X arg);
}
// Создание первого класса на основе
// обобщенного интерфейса:
class Alpha implements MyMethods<Integer>{
   // Закрытое поле целочисленного типа:
   private Integer value;
   // Описание методов из интерфейса:
   public Integer get(){
      return value;
   }
   public void set(Integer arg){
      value=arg;
   }
   // Метод для отображения значения поля:
   void show(){
      System.out.println("Целочисленное поле: "+get());
   }
   // Конструктор:
   Alpha(Integer arg){
      value=arg;
   }
}
// Создание второго класса на основе
// обобщенного интерфейса:
class Bravo implements MyMethods<Character>{
   // Закрытое поле символьного типа:
   private Character value;
   // Описание методов из интерфейса:
   public Character get(){
      return value;
   }
   public void set(Character arg){
      value=arg;
   }
   // Метод для отображения значения поля:
   void show(){
      System.out.println("Символьное поле: "+get());
   }
   // Конструктор:
   Bravo(Character arg){
      value=arg;
   }
}
// Главный класс:
class MoreGenInterfaceDemo{
   // Главный метод:
   public static void main(String[] args){
      // Интерфейсная переменная:
      MyMethods ref;
      // Создание объектов:
      Alpha A=new Alpha(123);
      Bravo B=new Bravo('A');
      // Вызов метода из объекта класса:
      A.show();
      // Интерфейсной переменной присваивается значение:
      ref=A;
      // Вызов метода через интерфейсную переменную:
      ref.set(321);
      // Вызов методов из объектов класса:
      A.show();
      B.show();
      // Интерфейсной переменной присваивается значение:
      ref=B;
      // Вызов метода через интерфейсную переменную:
      ref.set('B');
      // Вызов метода из объекта класса:
      B.show();
   }
}