
package examples;

class ForEx{
   // Главный метод программы:
   public static void main(String[] args){
      // Целочисленные переменные:
      int s=0,k,n=10;
      // Вычисление суммы квадратов натуральных чисел:
      for(k=1;k<=n;k++){
         s+=k*k;
      }
      // Текст для отображения в окне вывода:
      String txt="Сумма квадратов чисел от 1 до "+n+": "+s;
      // Отображение результата вычислений:
      System.out.println(txt);
   }
}