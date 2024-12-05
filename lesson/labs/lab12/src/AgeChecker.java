import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = in.nextInt();

        System.out.print("Do you holds a current driving licence? (y/n): ");
        char hasLicence = in.next().charAt(0);

        if (age >= 21 && hasLicence == 'y') {
            System.out.println("You are an adult and can hire a car.");
        } else {
            System.out.println("You are not an adult, so cannot hire a car.");
        }

        in.close();
    }
}
