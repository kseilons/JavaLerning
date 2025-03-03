package sth_with_cell;

public class Cell<T, T1> {

	private T t;
	private T1 k;
	
	public void setValue(T celldata, T1 i) {
		t = celldata;
		k = i;
	}
	
	public T getFirstValue() {
		return t;
	}
	
	public T1 getSecondValue() {
		return k;
	}
	
	
	public String toString() {
		return "cell type is: Type1: " + t.getClass() + " and Type2: " + k.getClass(); 
	}
}
