package dogexample;

import java.util.ArrayList;


/**
 * This class creates a Kennel of Dogs. The Set method will 
 * be called to purposely generate an IndexOutofBoundsException and a try catch statement
 * will be added to catch the exception and print an error message and exit the program
 * nicely
 * @author susan
 * 
 *
 */
public class SetException {
/**
 * Java looks for the main method to begin executing code
 * @param args are not used
 */
	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		ArrayList<Cat> cats = new ArrayList<Cat>();
    	dogs.add(new Dog(45, 30, true,"Fido","Poodle"));
		dogs.add(new Dog(65, 36, true,"Chuck","Lab"));
		dogs.add(new Dog(12, 18, false,"Leroy","Mutt"));
		dogs.add(new Dog(45, 40, true,"Rover","Mutt"));
		dogs.add(new Dog(90, 38, true,"Charlotte","Golden"));
		
		// setup kennel
		// Kennel myKennel = ?
		Kennel myKennel = new Kennel(dogs, cats, "Random Kennel", "Kent", "WA");
		System.out.println(myKennel);
		//dogs.set(5, new Dog());
		try {
			dogs.set(5, new Dog());
		} catch (IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException "+e.getMessage());
		}
		System.out.println("Made it here");
		
		

	}

}
