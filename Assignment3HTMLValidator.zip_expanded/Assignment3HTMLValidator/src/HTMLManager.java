/*
 * Shawn Potter
 * IT 220
 * 5/7/2018
 * Class adds, removes, gets or fixes HTML tags held within a queue.
 * HTMLManager.java
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class HTMLManager {
	private Queue<HTMLTag> page; 
	
	public HTMLManager(Queue<HTMLTag> page) {
		this.page=new LinkedList<HTMLTag>(page);
		
		if(page==null) {
			throw new IllegalArgumentException();
		}
	}
	public void add(HTMLTag tag) {
		if(tag == null)
			throw new IllegalArgumentException();
		page.add(tag);
		
		
	}
	public void removeAll(HTMLTag tag) {
		Iterator<HTMLTag> it = page.iterator();
		
		if(tag == null)
			throw new IllegalArgumentException();
		while(it.hasNext()) {
			HTMLTag h = it.next();
			if(h.matches(tag)) {
				it.remove();
			}
		}
	}
	public Queue<HTMLTag> getTags(){
		return page;
	}
	public void fixHTML() {
		
        // Stack to hold opening HTML tags
		Stack<HTMLTag> openTags = new Stack<>();
		int queueSize = page.size();
		// For loop to run through the queue
		for(int i = 0; i < queueSize; i++) {
			//remove the first tag in the queue and save it as a variable to check it
			HTMLTag removedTag = page.remove();

			// if the removed tag is considered self closing just re-add it to the back of the queue
			if(removedTag.isSelfClosing()) {
				 page.add(removedTag);
			}
			
			//if tag is an opening HTML tag add it back to the queue
			if(removedTag.isOpening()) {
				page.add(removedTag);
		         // push opening tag onto the stack for later use
				openTags.push(removedTag);
			}
			
			//if the tag is closing 
			if(removedTag.isClosing()) {
		        // if the stack is not empty then pop the tag from the stack
				if(!(openTags.isEmpty())) {
					HTMLTag poppedTag = openTags.pop();
					// if the popped tag matches the removed closing tag to the queue
					if(poppedTag.matches(removedTag)){
						page.add(removedTag);
					}
					// else if it does not match the opening tag add in a matching closing tag
					else if(!(poppedTag.matches(removedTag))) {		             
						page.add(poppedTag.getMatching());
					}
				}
			}
		}
        
		// while your open symbol stack is not empty pop the remaining opening tags and add their matches to the queue
		while(!(openTags.isEmpty())) {
			page.add(openTags.pop().getMatching());
		}
	}

}
