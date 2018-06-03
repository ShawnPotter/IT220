package stackexamples;

import java.util.LinkedList;
import java.util.Queue;

public class School {
	public Queue<Person> queue;
	
	public School(Queue<Person> queue) {
		//this.queue=queue; //shallow copy 
							// changes to made
		
		this.queue=new LinkedList<Person>(queue);
	}
	
	public String toString() {
		return queue.toString();
	}
}
