
public class Driver {

	public static void main(String[] args) {
		
		
		Animal animal = new Animal();
		animal.makeNoise();
		Dog dog = new Dog();
		dog.makeNoise();
		Animal animaldog = new Dog();
		animaldog.makeNoise();
		
		if (animal instanceof Animal) {
			System.out.println("animal is Animal");
			if (dog instanceof Animal)
			System.out.println("dog is Animal");
			if (animaldog instanceof Animal)
			System.out.println("animaldog is Animal");
			if (animal instanceof Dog)
			System.out.println("animal is Dog");
			
		}
		

		Animal an = new Dog();
		if (an instanceof Dog) {
			Dog dog1 = (Dog) an;
			dog1.makeNoise();
		}
		
		
		Animal as = new Dog();
		as.makeNoise(); 
	}
}
