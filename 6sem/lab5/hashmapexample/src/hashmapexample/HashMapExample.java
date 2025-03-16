package hashmapexample;

import java.util.HashMap;

public class HashMapExample {
	
	public static void main(String[] args) {
		HashMap<String, String> fruitBowl = new HashMap<String, String>();
		
		addElements(fruitBowl);
		displayElements(fruitBowl);
		
		findElement(fruitBowl, "Apple");
		findElement(fruitBowl, "Pear");
		
	}
	
	static void addElements(HashMap<String, String> fruitBowl) {
		fruitBowl.put("Apple", "Green");
		fruitBowl.put("Cherry", "Red");
		fruitBowl.put("Orange", "Orange");
		fruitBowl.put("Banana", "Yellow");
		fruitBowl.put("Apple", "Red");
		
	}
	
	static void displayElements(HashMap<String, String> fruitBowl) {
		for (HashMap.Entry<String, String> fruit :fruitBowl.entrySet())
		{
			System.out.println("Fruit" + fruit.getKey() + " - Color " + fruit.getValue());
		}
		
	}
	
	static void findElement(HashMap<String, String> fruitBowl, String fruit) {
		if (fruitBowl.containsKey(fruit)) 
			System.out.println("The " + fruit + " is "
					+ fruitBowl.get(fruit));
		else 
			System.out.println("There is no " + fruit + " in the bowl");
	}
}
