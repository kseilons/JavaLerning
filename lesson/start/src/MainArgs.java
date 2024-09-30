package start.src;

import static java.lang.System.out;
public class MainArgs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // int i = 5;
        // while (i > 0) {
        //     System.out.println(i);
        //     --i;
        // }
        // i = 0;
        // System.out.println("Do while");
        // do {
        //     System.out.println(arr[i]);
        //     i++;
        // } while (i < arr.length);
        int i = 0;
        for (System.out.println("hello this is first statment"); i < arr.length; System.out.println("end"), i++) {
            out.println(i);
        }

        for(String myArgs: args) {
            System.out.println("hello " + myArgs);
        }
    }
}
