package polyexample;

public class PolyTester {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		Animal[] pets = {new Dog(), new Cat(), new Dog(), new Cat()};
		
		for(int i = 0; i<pets.length; i++) {
			String result = pets[i].makeSound();
			System.out.println(result);
		}
		
		System.out.println(a1);
		System.out.println(a2);

	}

}
