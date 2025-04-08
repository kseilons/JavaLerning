package regexp;

import java.util.Scanner;

public class RhymeGane {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String animal;
	animal = getAnimal(in);
	if (rhymningAnimal(animal)) {
		System.out.println("This amimal rhymes with cat ");
	}
	else {
		System.out.println("This animal doesnot rhyme");
	}
	
	in.close();
}

private static boolean rhymningAnimal(String animal) {
		return animal.matches("[a-zA-Z]{1,2}(at|AT)");
	}

private static String getAnimal(Scanner in) {
		System.out.println("Please enter the name of the animal: ");
		return in.next();
	}
}
