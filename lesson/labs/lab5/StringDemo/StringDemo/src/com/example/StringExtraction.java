/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class StringExtraction {
    public static void main(String args[]) {

        String greeting = "Hello, World!";
        String sub = greeting.substring(0, 5);
        System.out.println(sub);
        String w = greeting.substring(7, 11);
        System.out.println(w);
        String tail = greeting.substring(7);
        System.out.println(tail);
    }

}
