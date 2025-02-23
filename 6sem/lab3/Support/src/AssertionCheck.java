import java.util.Stack;

public class AssertionCheck {
	
	private static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) {
		int x = -12;
		
		if (x > 0) {
			System.out.println("x is positive");
		}
		else {
			assert (x == 0);
			System.out.println("x is not positive");
		}
		
		Suit suit = Suit.CLUBS;
		switch (suit) {
		case CLUBS:
			break;
		case DIAMONDS:
			break;
		case HEARTS:
			break;
		case SPADES:
			break;
		default:
			assert false: "Unknown card suit";
			break;
		}
	
	
		stack.push(1);
		stack.push(10);
		stack.push(12);
		Object as = pop();
	}
	
	
	public static Object pop() {

		int size = stack.size();
		if (size == 0) throw new RuntimeException("cannot pop from empty stack");


		stack.push(4);
		Object res = stack;
	
		assert (stack.size() == size - 1);
		
		return res;
	}

}
