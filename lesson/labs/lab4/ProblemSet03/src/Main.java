import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Привет, ответь на парочку вопросов, а мы составим интересную историю про тебя");
        String name = (String) JOptionPane.showInputDialog(null,
                "Как вас зовут?",
                "Введите имя",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                "Например, Андрей"
        );
        int age = Integer.parseInt((String) JOptionPane.showInputDialog(null,
                "Сколько вам лет?",
                "Введите возраст",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                "Например, 18"));
        double height = Double.parseDouble((String) JOptionPane.showInputDialog(null,
                "Ваш рост (в метрах)?",
                "Введите рост",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                "Например, 185"));
        int numberOfPets = Integer.parseInt((String) JOptionPane.showInputDialog(null,
                "Сколько у вас питомцев?",
                "Ваши животные",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                "Например, 2"));

        double weight = Double.parseDouble((String) JOptionPane.showInputDialog(null,
                "Ваш вес (в килограммах)?",
                "Ваш вес",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                "Например, 55"));
        String city = (String) JOptionPane.showInputDialog(null,
                "В каком городе вы живете?",
                "Город",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                "Например, Кировск");
        int luckyNumber = Integer.parseInt((String) JOptionPane.showInputDialog(null,
                "Ваше счастливое число?",
                "Счастливое число",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                "Например, 123"));


        int ageNextYear = age + 1;
        double bmi = weight / (height * height);

        String story = "Однажды, в городе " + city + ", жил человек по имени " + name + ".\n";
        story += "Ему было " + age + " лет, и в следующем году ему исполнится " + ageNextYear + ".\n";
        story += "Рост " + name + " составлял " + height + " метров, а вес — " + weight + " килограммов.  Его индекс массы тела равен " + String.format("%.2f", bmi) + ".\n";
        story += "У " + name + " было " + numberOfPets + " питомцев, и его счастливое число — " + luckyNumber + ".\n";
        story += "И жили они долго и счастливо (или нет...).";
        JOptionPane.showMessageDialog(null, story, "Ваша история", JOptionPane.PLAIN_MESSAGE);
    }
}