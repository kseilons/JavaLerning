package stevence;

import java.util.Stack;

public class StackSort {


    public static void selectionSortStack(Stack<Double> stack) {
        Stack<Double> sortedStack = new Stack<>();

        while (!stack.isEmpty()) {
            double max = -Double.MAX_VALUE;
            Stack<Double> tempStack = new Stack<>();

            // Найдём максимум
            while (!stack.isEmpty()) {
                double current = stack.pop();
                if (current > max) {
                    max = current;
                }
                tempStack.push(current);
            }

            boolean maxSkipped = false;

            while (!tempStack.isEmpty()) {
                double current = tempStack.pop();
                if (current == max && !maxSkipped) {
                    maxSkipped = true; // пропустить максимум один раз
                } else {
                    stack.push(current);
                }
            }

            // Положим максимум в отсортированный стек
            sortedStack.push(max);
        }

        // Переложим в исходный стек — теперь в порядке убывания
        while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }
    }
}
