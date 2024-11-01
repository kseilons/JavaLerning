import javax.swing.*;
class Using2DCharArrayDemo{
    public static void main(String[] args){
        int[] size={3,12,4,7};
        char[][] symbs=new char[size.length][];
        char s='A';
        String txt="";
        for(int i=0;i<symbs.length;i++){
            symbs[i]=new char[size[i]];
            for(int j=0;j<symbs[i].length;j++){
                symbs[i][j]=s;
                s++;
                txt+="| "+symbs[i][j]+" ";
            }
            txt+="|\n";
        }
        JOptionPane.showMessageDialog(null,
                txt,
                "Массив со строками разной длины",
                JOptionPane.PLAIN_MESSAGE,
                new ImageIcon("C:/Users/kseilons/YandexDisk/university/3 курс/Java/lesson/labs/lab9/giraffe.jpg")
        );
    }
}