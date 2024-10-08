package start.src;

import java.util.function.Supplier;

public class TimeLogger {
    public static <T> T measureTime(Supplier<T> supplier) {
        long startTime = System.nanoTime();
        T result = supplier.get();
        long endTime = System.nanoTime();
        System.out.println("Время выполнения:" + (endTime - startTime) + " нс");
        return result;
    }
}
