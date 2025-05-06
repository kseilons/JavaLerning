import java.util.Stack;

public class StackSort {

    public static void selectionSortStack(Stack<Double> stack) {
        Stack<Double> tempStack = new Stack<>();
        
        while (!stack.isEmpty()) {
            // Переносим все элементы во временный стек, находя минимальный
            double min = Double.MAX_VALUE;
            int count = 0;
            
            // Находим минимальный элемент
            while (!stack.isEmpty()) {
                double current = stack.pop();
                if (current < min) {
                    min = current;
                }
                tempStack.push(current);
            }
            
            // Переносим обратно, пропуская все вхождения минимального
            while (!tempStack.isEmpty()) {
                double current = tempStack.pop();
                if (current == min) {
                    count++;
                } else {
                    stack.push(current);
                }
            }
            
            // Добавляем все минимальные элементы во временный стек
            for (int i = 0; i < count; i++) {
                tempStack.push(min);
            }
        }
        
        // Переносим из временного стека в исходный (теперь они будут в порядке возрастания)
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}