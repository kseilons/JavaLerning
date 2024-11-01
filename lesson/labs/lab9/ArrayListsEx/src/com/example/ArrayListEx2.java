/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        Iterator<Integer> iterator = numbers.iterator();
        System.out.println("исходный:");
        while (iterator.hasNext()) {
            System.out.println("Hoмep: " + iterator.next());
        }

        iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int check = iterator.next();
            if (check % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("После удаления:");
        iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.println("Hoмeр:" + num);
        }
    }
}
