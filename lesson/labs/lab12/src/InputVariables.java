import java.util.Scanner;

public class InputVariables {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean booleanVar;
        byte byteVar;
        short shortVar;
        int intVar;
        long longVar;
        float floatVar;
        double doubleVar;
        char charVar;

        System.out.print("Please enter a boolean value: ");
        booleanVar = in.nextBoolean();

        System.out.print("Please enter a byte value: ");
        byteVar = in.nextByte();

        System.out.print("Please enter a short value: ");
        shortVar = in.nextShort();

        System.out.print("Please enter an int value: ");
        intVar = in.nextInt();

        System.out.print("Please enter a long value: ");
        longVar = in.nextLong();

        System.out.print("Please enter a float value: ");
        floatVar = in.nextFloat();

        System.out.print("Please enter a double value: ");
        doubleVar = in.nextDouble();

        System.out.print("Please enter a char value: ");
        charVar = in.next().charAt(0);

        System.out.println("\nValues entered:");
        System.out.println("boolean value: " + booleanVar);
        System.out.println("byte value: " + byteVar);
        System.out.println("short value: " + shortVar);
        System.out.println("int value: " + intVar);
        System.out.println("long value: " + longVar);
        System.out.println("float value: " + floatVar);
        System.out.println("double value: " + doubleVar);
        System.out.println("char value: " + charVar);

        in.close();
    }
}
