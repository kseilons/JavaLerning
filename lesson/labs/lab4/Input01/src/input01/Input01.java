package input01;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Введите текст: ");
        System.out.println(input);

        int x = Integer.parseInt(input);
        System.out.println(x + 1 );

        x = Integer.parseInt(JOptionPane.showInputDialog("Введите текст: "));
        System.out.println(x);
    }
}
