/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ComputeAvg {
    public static int getGrade(Scanner sc) {
        while (true) {
            System.out.print("Введите оценку (от 0 до 100): ");
            try {
                int grade = sc.nextInt();
                if (grade >= 0 && grade <= 100) {
                    return grade;
                } else {
                    System.out.println("Ошибка: Оценка должна быть от 0 до 100.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка: Некорректный ввод. Пожалуйста, введите целое число.");
                sc.next(); // очищаем буфер сканера
            }
        }
    }

    public static int[] getGrades(Scanner sc, int numGrades) {
        int[] grades = new int[numGrades];
        for (int i = 0; i < numGrades; i++) {
            grades[i] = getGrade(sc); // Используем новый метод
        }
        return grades;
    }

    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пять оценок тестирования:");
        int[] grades = getGrades(sc, 5);
        double avg = calculateAverage(grades);
        System.out.println("Среднее оценок: " + avg);
        sc.close();
    }
}
