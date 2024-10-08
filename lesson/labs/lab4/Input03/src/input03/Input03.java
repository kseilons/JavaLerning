package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println(x + y + z);

        sc.close();
    }
}
