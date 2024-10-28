/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.stream.IntStream;

public class StringReplaceFirst {

    public static void main(String args[]) {
        String replace = "String replace with replaceFirst";
        replace.equals(replace);
        String newString = replace.replaceFirst("re", "RE");
        System.out.println(newString);
    }

}
