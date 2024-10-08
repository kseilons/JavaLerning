/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;

public class RandomSeriesSeed {

    public static void main(String[] args) {

        Random rand = new Random(20);
        System.out.println("Random Number 1: " + rand.nextInt(100));
        System.out.println("Random Number 2: " + rand.nextInt(100));
        System.out.println("Random Number 3: " + rand.nextInt(100));
        System.out.println("Changing seed to change to sequence");
        rand.setSeed(5);
        System.out.println("Random Number 4: " + rand.nextInt(100));
        System.out.println("Random Number 5: " + rand.nextInt(100));
        System.out.println("Random Number 6: " + rand.nextInt(100));
        System.out.println("Setting seed 40 to produce the previous sequence");
        rand.setSeed(20);
        System.out.println("Random Number 7: " + rand.nextInt(100));
        System.out.println("Random Number 8: " + rand.nextInt(100));
        System.out.println("Random Number 9: " + rand.nextInt(100));

    }
}
