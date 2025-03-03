// Обобщенный интерфейс:
interface MyMethods<X>{
   X get();
   void set(X arg);
}
// Создание обобщенного класса на основе
// обобщенного интерфейса:
class MyClass<X> implements MyMethods<X>{
   // Закрытое поле обобщенного типа:
   private X value;
   // Описание методов из интерфейса:
   public X get(){
      return value;
   }
   public void set(X arg){
      value=arg;
   }
   // Метод для отображения значения поля:
   void show(){
      System.out.println("Значение поля: "+get());
   }
   // Конструктор:
   MyClass(X arg){
      value=arg;
   }
}
// Главный класс:
class GenInterfaceDemo{
   // Главный метод:
   public static void main(String[] args){
      // Интерфейсная переменная:
      MyMethods ref;
      // Создание объектов на основе обобщенного класса:
      MyClass<Integer> A=new MyClass<>(123);
      MyClass<Character> B=new MyClass<>('A');
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