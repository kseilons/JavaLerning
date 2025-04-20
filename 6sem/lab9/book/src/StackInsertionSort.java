import java.util.Stack;

public class StackInsertionSort {
    public static void sort(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            while (!temp.isEmpty() && temp.peek() > current) {
                stack.push(temp.pop());
            }
            temp.push(current);
        }
        while (!temp.isEmpty()) stack.push(temp.pop());
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5); s.push(1); s.push(4);
        sort(s);
        System.out.println(s); // [1, 4, 5]
    }
}