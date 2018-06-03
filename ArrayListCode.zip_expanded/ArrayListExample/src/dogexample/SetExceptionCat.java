package dogexample;

import java.util.ArrayList;


/**
 * This class creates a Kennel of dogs and cats
 * Shawn Potter, Rizwan Ali
 */
public class SetExceptionCat {
/**
 * Java looks for the main method to begin executing code
 * @param args are not used
 */
	

	public static void main(String[] args) {
		ArrayList<Cat> cats = new ArrayList<Cat>();
		ArrayList<Dog> dogs = new ArrayList<Dog>();
    	dogs.add(new Dog(45, 30, true,"Fido","Poodle"));
		dogs.add(new Dog(12, 18, false,"Leroy","Mutt"));
		cats.add(new Cat(45, 30, true,"Kitty","Tabby"));
		cats.add(new Cat(65, 36, false,"Ashes","Persian"));
		cats.add(new Cat(12, 18, false,"Misty","Siamese"));
		
		// setup kennel
		// Kennel myKennel = ?
		Kennel myKennel = new Kennel(dogs, cats, "Random Kennel", "Kent", "WA");
		System.out.println(myKennel);
		//Cats.set(5, new Cat());
		try {
			dogs.set(2, new Dog());
			cats.set(3, new Cat());
		} catch (IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException "+e.getMessage());
		}
		System.out.println("Made it here");
		
		

	}

}
