

import java.util.Random;
import java.util.Stack;

public class StackDriver {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            stack.push(random.nextBoolean()?  random.nextDouble() * 100: -1 * random.nextDouble() * 100);
        }

        System.out.println("Base stack");
        stack.stream().forEach(System.out::println);

        StackSort.selectionSortStack(stack);

        System.out.println("\n\n\nSorted stack");
        stack.stream().forEach(System.out::println);

    }
}
