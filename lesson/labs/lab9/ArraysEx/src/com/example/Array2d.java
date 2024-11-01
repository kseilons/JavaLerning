package com.example;
import java.util.Random;

public class Array2d {

    public static double sumArray(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int maxSizeLine = 0;
        double[][] arr = new double[5][];
        for (int i = 0; i < 5; i++) {
            arr[i] = new double[random.nextInt(10) + 1];
            maxSizeLine = (Math.max(arr[i].length, maxSizeLine));
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextDouble() * 200 - 100;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%8.2f ", arr[i][j]);
            }
            System.out.printf(" | Сумма: %8.2f\n", sumArray(arr[i]));
        }
    }
}
