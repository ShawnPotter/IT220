package midtermreview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTester {

	public static void main(String[] args) {
		Person defaultPerson = new Person();
		//System.out.println(defaultPerson);
		
		Person harry = new Person("Harry", "Potter",18,60.5);
		Person her = new Person("Hermione", "Granger",17,63.5);
		System.out.println(harry.compareTo(her));
		List<Person> list = new ArrayList<Person>();
		list.add(harry);
		list.add(her);
		Collections.sort(list);
		System.out.println(list);
	}

}
