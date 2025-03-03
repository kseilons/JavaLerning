// Первый класс:
package ferst8;
//Обобщенный класс с одним параметром:
class Alpha<X>{
// Закрытое поле обобщенного типа:
private X first;
// Конструктор с аргументом обобщенного типа:
Alpha(X first){
   // Вызов метода с аргументом обобщенного типа:
   set(first);
}
// Метод с аргументом обобщенного типа
// для присваивания значения полю:
void set(X first){
   this.first=first;
}
// Метод возвращает результатом значение поля:
X get(){
   return first;
}
}
//Обобщенный класс с двумя параметрами:
class Bravo<X,Y>{
// Поле - объект обобщенного класса:
Alpha<X> obj;
// Поле обобщенного типа:
Y second;
// Конструктор с двумя аргументами обобщенного типа:
Bravo(X first,Y second){
   // Создание объекта на основе обобщенного класса:
   obj=new Alpha<X>(first);
   // Присваивание значения полю:
   this.second=second;
}
// Метод для отображения значений полей:
void show(){
   System.out.println("Значения "+obj.get()+" и "+second);
}
}
//Главный класс:
class UsingGenericsDemo{
// Главный метод:
public static void main(String[] args){
   // Создание объекта на основе обобщенного класса:
   Bravo<Integer,Character> A=new Bravo<Integer,Character>(100,'A');
   // Отображение значений полей объекта:
   A.show();
   // Создание объекта на основе обобщенного класса:
   Bravo<String,Double> B=new Bravo<>("BRAVO",12.345);
   // Отображение значений полей объекта:
   B.show();
}
}