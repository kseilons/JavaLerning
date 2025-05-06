
import java.util.Arrays;
import java.util.Random;

public class MergeDriver {
    public static void main(String[] args) {
        int i = 1;
        int j = 100;
        int k = 101;

        double[] first = createRandomArray(i);
        double[] second = createRandomArray(j);
        double[] third = createRandomArray(k);



        printArray(first, second, third);

        MyMergeSort.sort(first, 0, first.length - 1);
        MyMergeSort.sort(second, 0, second.length - 1);
        MyMergeSort.sort(third, 0, third.length - 1);


        printArray(first, second, third);
    }


    private static double[] createRandomArray(int i) {
        double[] ar = new double[i];
        Random random = new Random();
        for (int j = 0; j < i; j++) {
            ar[j] = random.nextDouble();
        }

        return ar;
    }

    private static void printArray(double[] first, double[] second, double[] third){
        System.out.println("First array: ");
        Arrays.stream(first).forEach(System.out::println);

        System.out.println("\n\nSecond array: ");
        Arrays.stream(second).forEach(System.out::println);

        System.out.println("\n\nThird array");
        Arrays.stream(third).forEach(System.out::println);

    }
}
