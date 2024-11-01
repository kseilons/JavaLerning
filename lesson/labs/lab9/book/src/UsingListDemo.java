import javax.swing.*;
class UsingListDemo{
    public static void main(String[] args){
        String[] txt={"Волк","Лиса","Медведь","Енот"};
        String[] files={"wolf.jpg","fox.jpg","bear.jpg","raccoon.jpg"};
        String folder="C:/Users/kseilons/YandexDisk/university/3 курс/Java/lesson/labs/lab9/";
        String msg="Кого показать?";
        String title="В мире животных";
        ImageIcon img=new ImageIcon(folder+"giraffe.png");
        String animal;
        animal=(String)JOptionPane.showInputDialog(null,
                msg,
                title,
                JOptionPane.PLAIN_MESSAGE,
                img,
                txt,
                txt[0]
        );
        if(animal==null){
            System.exit(0);
        }
        for(int k=0;k<txt.length;k++){
            if(animal.equals(txt[k])){
                System.out.println(folder+files[k]);
                img=new ImageIcon(folder+files[k]);
                break;

            }
        }
        JOptionPane.showMessageDialog(null,
                img,
                animal,
                JOptionPane.PLAIN_MESSAGE
        );
    }
}