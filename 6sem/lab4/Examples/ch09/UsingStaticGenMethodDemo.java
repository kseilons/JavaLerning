// Класс со статическими обобщенными методами:
class UsingStaticGenMethodDemo{
   // Метод с аргументом обобщенного типа:
   static <X> void show(X arg){
      System.out.println(arg);
   }
   // Аргумент метода - обобщенный массив:
   static <X> void show(X[] array){
      System.out.print("| ");
      // Отображение значений элементов массива:
      for(int k=0;k<array.length;k++){
         System.out.print(array[k]+" | ");
      }
      System.out.println("");
   }
   // Методу аргументом передается обобщенный массив и
   // целочисленный индекс, а результатом возвращается
   // значение элемента с соответствующим индексом:
   static <X> X getElement(X[] array,int index){
     return array[index];
   }
   // Главный метод:
   public static void main(String[] args){
      // Целочисленный массив:
      Integer[] nums={1,3,7,2};
      // Символьный массив:
      Character[] symbs={'A','W','L','O','B'};
      System.out.println("Вызов метода show()");
      System.out.print("С текстовым аргументом: ");
      show("обобщенный метод");
      System.out.print("С int-аргументом: ");
      show(123);
      System.out.print("С double-аргументом: ");
      show(123.45);
      System.out.print("С char-аргументом: ");
      show('A');
      System.out.print("Целочисленный массив: ");
      show(nums);
      System.out.print("Символьный массив: ");
      show(symbs);
      // Поэлементное отображение массивов:
      System.out.println("Вызов метода getElement()");
      System.out.print("Целочисленный массив: *");
      for(int k=0;k<nums.length;k++){
         System.out.print(getElement(nums,k)+"*");
      }
      System.out.print("\nСимвольный массив: *");
      for(int k=0;k<symbs.length;k++){
         System.out.print(getElement(symbs,k)+"*");
      }
      System.out.println("");
   }
}