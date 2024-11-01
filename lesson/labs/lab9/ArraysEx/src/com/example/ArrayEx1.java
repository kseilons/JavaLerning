/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class ArrayEx1 {

    public static void main(String args[]) {
        int[] scope = new int[9];
        byte[] values = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] primeNum = new int[20]; // заменили long на int
        int[] even = new int[5]; // добавили в тип переменной []
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);

    }

}
