import static javax.swing.JOptionPane.*;
import javax.swing.*;
import java.io.*;

public class FileChooserDemo {
    public static void main(String[] args) throws IOException {
        int res = showConfirmDialog(null,
                "Готовы выбрать файл?",
                "Работа с файлами",
                YES_NO_OPTION,
                QUESTION_MESSAGE
        );

        if(res != YES_OPTION) {
            System.exit(0);
        }

        JFileChooser fch = new JFileChooser();
        res = fch.showOpenDialog(null);

        if(res != JFileChooser.APPROVE_OPTION) {
            System.exit(0);
        }

        File F = fch.getSelectedFile();
        String txt = "Вы выбрали файл\n";
        txt += F.getAbsolutePath();
        txt += "\nХотите создать копию?";

        res = showConfirmDialog(null,
                txt,
                "Файл выбран",
                YES_NO_OPTION,
                QUESTION_MESSAGE
        );

        if(res != YES_OPTION) {
            System.exit(0);
        }

        res = fch.showSaveDialog(null);
        if(res != JFileChooser.APPROVE_OPTION) {
            System.exit(0);
        }

        FileInputStream input = new FileInputStream(F);
        F = fch.getSelectedFile();
        FileOutputStream output = new FileOutputStream(F);

        while((res = input.read()) != -1) {
            output.write(res);
        }

        input.close();
        output.close();

        showMessageDialog(null,
                "Копия сохранена как \n" + F.getAbsolutePath(),
                "Создана копия файла",
                INFORMATION_MESSAGE
        );
    }
}