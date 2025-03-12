package seventh;



//Класс с полем-массивом:
class Binomial {
// Закрытое поле-массив:
private int[] binoms;

// Конструктор:
Binomial(int n) {
   // Создание массива:
   binoms = new int[n + 1];
   // Значение начального элемента массива:
   binoms[0] = 1;
   // Заполнение массива:
   for (int k = 1; k <= n; k++) {
      binoms[k] = binoms[k - 1] * (n - k + 1) / k;
   }
}

// Переопределение метода toString():
public String toString() {
   // Текстовая переменная для формирования результата:
   String txt = "| ";
   // Добавление к тексту значений элементов массива:
   for (int k = 0; k < binoms.length; k++) {
      txt += binoms[k] + " | ";
   }
   // Результат метода:
   return txt;
}
}

//Главный класс:
class ArrayAsFieldDemo {
public static void main(String[] args) {
   // Создание объектов:
   Binomial A = new Binomial(5);
   Binomial B = new Binomial(10);
   // Отображение биномиальных коэффициентов:
   System.out.println(A);
   System.out.println(B);
}
}