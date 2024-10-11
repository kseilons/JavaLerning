
package com.mycompany.examples;

// Импорт классов:
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static java.awt.Image.SCALE_FAST;

// Класс с главным методом программы:
class MultiIfEx{
   // Главный метод программы:
   public static void main(String[] args) throws IOException {
      String animalIconName = "";
      // Текстовая переменная для записи
      // названия животного:
      String animal;
      // Текстовая переменная с начальным значением,
      // определяющим путь к файлу с изображением:
   
      // Текстовые переменные с названиями животных:
      String wolf="Волк";
      String fox="Лиса";
      String bear="Медведь";
      String raccoon="Енот";
      // Считывание названия животного:
      animal=JOptionPane.showInputDialog(null,
         // Текст над полем ввода:
         wolf+", "+fox+" или "+bear+"?",
         // Название окна:
         "Укажите название животного",
         // Тип пиктограммы:
         JOptionPane.QUESTION_MESSAGE
         );
      // Вложенные условные операторы:
      if(animal==null){ // Если пользователь отменил ввод
         System.exit(0); // Завершение выполнения программы
      }
      // Если животное "Волк":
      else if(animal.equalsIgnoreCase(wolf)){

         animalIconName = "wolf.jpg";
         animal=wolf;
      }
      // Если животное "Лиса":
      else if(animal.equalsIgnoreCase(fox)){
         animalIconName = "fox.jpg";
         animal=fox;
      }
      // Если животное "Медведь":
      else if(animal.equalsIgnoreCase(bear)){
         animalIconName = "bear.jpg";
         animal=bear;
      }
      // Неизвестное животное:
      else{
         animalIconName = "raccoon.jpg";
         animal=raccoon;
      }

      // Создание объекта для пиктограммы:
      File imageFile = new File(animalIconName);
      ImageIcon icon = new ImageIcon(animalIconName);
      // Отображение диалогового окна:
      JOptionPane.showMessageDialog(null,
              icon,    // В окне отображается изображение
         animal, // Название окна
         // Тип диалогового окна:
         JOptionPane.PLAIN_MESSAGE
      );
   }
}