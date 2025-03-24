package genericstack;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {

	private ArrayList<T> items = new ArrayList<>();
	private int top;
	
	public GenericStack() {
		top = 0;
	}
	
	
	public void push(T t) {
		items.add(t);
		top++;
	}
	
	
	public T pop() throws GenericStackException{
		if (top == 0) {
			throw new GenericStackException("Underflow error");
		}
		T t = items.get(top-1);
		items.remove(top-1);
		top--;
		return t;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
}
