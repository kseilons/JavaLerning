/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.example;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++) {
            System.out.println(num + " X " + i + " = " +  num * i);
        }
    }

}
