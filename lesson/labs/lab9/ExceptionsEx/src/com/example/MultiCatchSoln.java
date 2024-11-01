/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiCatchSoln {

    public int countChars(String fileName) {
        int total = 0;
        try {
            FileReader r = new FileReader(fileName);
            while (r.ready()) {
                r.read();
                total++;
            }
            r.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return total;
    }
}
