package dogexample;

import java.util.ArrayList;

/*
 * Removes all cats that have recieved their rabies vaccine
 * Shawn Potter, Rizwan Ali
 */
public class RemoveCats {

	public static void main(String[] args) {
		ArrayList<Cat> cats = new ArrayList<Cat>();
    	cats.add(new Cat(45, 30, true,"Fido","Poodle"));
		cats.add(new Cat(65, 36, true,"Chuck","Lab"));
		cats.add(new Cat(45, 30, true,"Kitty","Tabby"));
		cats.add(new Cat(65, 36, false,"Ashes","Persian"));
		cats.add(new Cat(12, 18, false,"Misty","Siamese"));
		//System.out.println(cats);
		for(int i = cats.size()-1; i >= 0; i--) {
			Cat c = cats.get(i);
			if(c.isRabiesVaccine()) {
				cats.remove(i);
			}
		
		}
		System.out.println(cats);
		

	}

}
