package input02;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import static java.awt.Image.SCALE_FAST;

public class Input02 {
    public static void main(String[] args) throws IOException {
        String imagePath = "123.png";
        File imageFile = new File(imagePath);
        BufferedImage bufferedImage = ImageIO.read(imageFile);
        Image image = bufferedImage.getScaledInstance(50, 50, SCALE_FAST);
        ImageIcon icon = new ImageIcon(image);

        JOptionPane.showMessageDialog(null,
                "This is a warning message.  Please pay attention!",
                "Important Warning",
                JOptionPane.WARNING_MESSAGE);



        String input1 = (String) JOptionPane.showInputDialog(null,
                "Please enter your name:",
                "Name Input",
                JOptionPane.QUESTION_MESSAGE,
                icon,
                null,
                "Напиши здесь что-нибудь");

        String[] acceptableValues = {"Option A", "Option B", "Option C"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Choose an option:",
                "Option Selection",
                JOptionPane.QUESTION_MESSAGE,
                null,
                acceptableValues,
                acceptableValues[2]);
    }
}
