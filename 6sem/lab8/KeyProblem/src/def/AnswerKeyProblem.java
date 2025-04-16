package def;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AnswerKeyProblem {
    public static void main(String args[]) throws IOException {
        // Чтение файла
        BufferedReader codedAnswers = new BufferedReader(new FileReader("C:/Users/ololo/eclipse-workspace/CodedAnswerKey.txt"));
        
        // Инициализация строки line как первой строки из файла
        String line = codedAnswers.readLine();
        
        // Инициализация строки, в которую будут добавляться ответы
        String answers = "";
        
        // Регулярное выражение для поиска символов a, A, b, B, c, C, d, D, e, E, f, F
        String pattern = "[a-fA-F]";
        
        // Чтение каждой строки и добавление символов, которые соответствуют ответам
        while (line != null) {
            // Если символ в строке соответствует регулярному выражению
            if (line.matches(pattern)) {
                // Добавляем символ в строку answers	
            	answers += line;  
            }
            
            // Чтение следующей строки из файла
            line = codedAnswers.readLine();
        }
        
        // Преобразуем ответы с помощью метода finalAnswers
        String finalAnswer = finalAnswers(answers);
        
        // Выводим финальный ответ
        System.out.println("Расшифрованный ключ ответа: " + finalAnswer);
    } 
    
    // Метод для обработки строк с ответами 
    public static String finalAnswers(String answers) {
        // Заменяем символы согласно инструкции
        answers = answers.replace('e', 'b');
        answers = answers.replace('E', 'A');
        answers = answers.replace('f', 'c');
        answers = answers.replace('F', 'D');
        
        // Преобразуем строку в нижний регистр
        answers = answers.toLowerCase();
        
        // Возвращаем измененную строку
        return answers;
    }
}
