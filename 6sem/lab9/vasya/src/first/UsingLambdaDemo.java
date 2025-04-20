package first;


interface MyNums {
    // Метод по умолчанию (выводит информацию):
    default void show(int n) {
        System.out.println("Аргумент: " + n);
        System.out.println("Результат: " + get(n));
    }
    // Абстрактный метод (должен быть реализован):
    int get(int n);
}

// Главный класс:
public class UsingLambdaDemo {
    // Главный метод:
    public static void main(String[] args) {
        // Создание лямбда-выражения
        // Присваивание переменной интерфейса:
        MyNums A = (int n) -> {
            // Локальные переменные:
            int k, s = 0;
            // Вычисление суммы чисел от 1 до n:
            for (k = 1; k <= n; k++) {
                s += k;
            }
            // Возврат результата:
            return s;
        };
        
        System.out.println("Использование лямбда-выражения:");
        // Вызов метода через интерфейсную переменную:
        A.show(10);
        System.out.println("Проверка: " + A.get(10));
        
        // Создание новой ссылки на тот же объект:
        MyNums B = A;
        System.out.println("Новое лямбда-выражение:");
        
        // Изменение реализации через лямбда-выражение
        // (теперь вычисляет квадрат числа):
        A = n -> n * n;
        
        System.out.println("Вызов show() из A:");
        A.show(10);
        System.out.println("Вызов show() из B:");
        B.show(10);
    }
}