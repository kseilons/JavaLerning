package com.example;

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        int sum = 0, numInput = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("введите 10 чисел(0 чтовы выйти):");

        for (int i = 0; i < numInput; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Сумма чисел: " + sum );
    }
}
