package genericstack;

import java.util.HashSet;

public class GenericStackDriver {

	public static void main(String[] args) {
		GenericStack<Integer> stack = new GenericStack<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(stack.pop());
		}
	}
}
