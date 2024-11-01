import javax.swing.JOptionPane;
class UsingArrayDemo{
    public static void main(String[] args){
        String input,title="Биномиальные коэффициенты";
        input=JOptionPane.showInputDialog(null,
                "Укажите значение нижнего индекса",
                title,
                JOptionPane.QUESTION_MESSAGE
        );
        if(input==null){
            System.exit(0);
        }
        int n;
        n=Integer.parseInt(input);
        if(n<0){
            JOptionPane.showMessageDialog(null,
                    "Указан неверный параметр!",
                    title,
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }
        int[] binoms=new int[n+1];
        binoms[0]=1;
        String txt="Содержимое массива:\n| "+binoms[0]+" |";
        for(int m=1;m<binoms.length;m++){
            binoms[m]=binoms[m-1]*(n-m+1)/m;
            txt+=" "+binoms[m]+" |";
        }
        JOptionPane.showMessageDialog(null,
                txt,
                title,
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}