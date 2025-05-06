import java.util.Scanner;

public class getAge {
    public static void main(String[] args) {
        int age = getAge();
        System.out.println("You are " + age + " years old.");
    }

    static int getAge() {
        int age = -1;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Please enter your age: ");
            age = in.nextInt();
        } catch (Exception e) {
            System.err.println("Invalid input: " + e.getMessage());
        }
        return age;
    }
}
