package stackexamples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
	public static void main(String[] args) {
		Queue<Person> queue = new LinkedList<>();
		System.out.println(queue);
		
		//sort way to add
		queue.add(new Person("John"));
		
		//longer way to add
		Person p2 = new Person("Sally");
		queue.add(p2);
		
		queue.add(new Person("Jamie"));
		queue.add(new Person("Viradeth"));
		//print out contents
		//System.out.println(queue);
		
		//remove Person with first name starting with J
		//use traditional for loop
		int size = queue.size();
		for(int i=0;i<size;i++) {
			Person p = queue.remove();
			if(!(p.fullName.charAt(0)=='J')) {
				queue.add(p);
			}
		}
		//use Iterator
		Iterator<Person> it = queue.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			if(p.fullName.charAt(0)=='J') {
				it.remove();
			}
		}
		//check to see if it removed J names
		//System.out.println(queue);
		
		School s = new School(queue);
		System.out.println(s);
		queue.remove();
		System.out.println("After remove: "+s);
	}
}
