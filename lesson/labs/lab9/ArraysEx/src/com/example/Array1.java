package com.example;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int row = 2;
        int cols = 3;
        int[][] arr = new int[row][cols];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Вывод элементов по строкам:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Вывод элементов по столбцам");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
