/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;

public class RandomNumSeries {

    public static void main(String[] args) {

        Random num = new Random();
        int randomnum1 = num.nextInt();
        System.out.println("Random Number 1: " + randomnum1);
        int randomnum2 = num.nextInt();
        System.out.println("Random Number 2: " + randomnum2);
        int randomnum3 = num.nextInt();
        System.out.println("Random Number 3: " + randomnum3);
        int randomnum4 = num.nextInt();
        System.out.println("Random Number 4: " + randomnum4);
        int randomnum5 = num.nextInt();
        System.out.println("Random Number 5: " + randomnum5);

    }

}
