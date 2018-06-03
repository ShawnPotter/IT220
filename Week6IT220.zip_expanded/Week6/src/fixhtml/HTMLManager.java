package fixhtml;

import java.util.LinkedList;
import java.util.Queue;

public class HTMLManager {

	Queue<HTMLTag> queue;
	
	public HTMLManager(Queue<HTMLTag> page) {
		queue = new LinkedList<HTMLTag>(page);
		
	}
	
	public void fixHTML() {
		        // create a stack for opening symbols
				
		
				// for every tag in your queue
				       // remove tag from queue to check
				//    if tag is self closing
				         // add tag to queue
				//    if tag is opening
				         // add tag to queue
				         // push tag to stack
				//    if tag is closing
				         // if stack is not empty 
				              // pop a tag
				              // if open tag matches closing tag
				                 // add that closing tag to the queue
				              // else if it does not match
				                 // fix the tag
				                 // call getMatching() for popped open tag
				                 // add to queue
		                // end if
				        
				// end of for
		
		        
				// while your open symbol stack is not empty
				//     pop the open symbol and find the matching closing tag (Use getMatches()
				//     add this matching close tag to the queue
		        // end of while
				
	}

}
