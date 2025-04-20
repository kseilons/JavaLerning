import java.util.Stack;

public class ArrayReverser {
    public static void reverse(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) stack.push(num);
        for (int i = 0; i < arr.length; i++) arr[i] = stack.pop();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        reverse(nums);
        for (int num : nums) System.out.print(num + " "); // 4 3 2 1
    }
}