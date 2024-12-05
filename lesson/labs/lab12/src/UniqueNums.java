import java.util.Scanner;

public class UniqueNums {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        int num = 0;         // Число, введенное пользователем
        int numValues = 0;   // Количество валидных записей
        boolean valid;
        Scanner in = new Scanner(System.in);


        while (numValues < numbers.length) {
            do {
                valid = true;
                System.out.print("Enter a unique integer value: ");
                num = in.nextInt();

                for (int i = 0; i < numValues; i++) {
                    if (numbers[i] == num) {
                        valid = false;
                        System.out.println("The number is not unique. Try again.");
                        break;
                    }
                }
            } while (!valid);

            numbers[numValues] = num;
            numValues++;
        }

        in.close();

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
