import java.util.Scanner;

public class ValueChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;

        do {
            System.out.print("Please enter an integer value (enter 0 to quit): ");
            number = in.nextInt();

            if (number == 0) {
                break;
            }

            if (number == 7) {
                System.out.println("That's lucky!");
            } else if (number == 13) {
                System.out.println("That's unlucky!");
            } else {
                System.out.println("That number is neither lucky nor unlucky!");
            }
        } while (number != 0);

        in.close();
    }
}
