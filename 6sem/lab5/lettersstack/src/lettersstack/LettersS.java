package lettersstack;

import java.util.LinkedList;

public class LettersS {
	public static void main(String[] args) {
		LinkedList<String> letterStack = new LinkedList<String>();
		
		letterStack.push("A");
		letterStack.push("B");
		letterStack.push("C");
		letterStack.push("D");
		
		System.out.println("Linked list: " + letterStack);
		System.out.println("Stack Size: " + letterStack.size());
		
		while (!letterStack.isEmpty()) {
			System.out.println(letterStack.pop());
		}
		
		System.out.println("Linked list: " + letterStack);
	}
}
