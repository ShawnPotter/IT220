package linkedlists;

public class LinkedIntList {
	private ListNode front;
	private int size;
	
	public LinkedIntList() {
		size = 0;
		front = null;
	}
	//remove (int index)
	public void remove(int index) {
		if(index == 0) {
			front = front.next;
		}else {
			ListNode current=front;
			for(int i = 0; i < index - 1; i++) {
				current=current.next;
			}
			current.next = current.next.next;
		}
		size--;
	}
	//add(int index, int data)
	public void add(int index, int data) {
		if(index == 0) {
			front = new ListNode(data,front);
		}else {
			ListNode current=front;
			for(int i = 0; i < index-1; i++) {
				current=current.next;
			}
			current.next = new ListNode(data,current.next);
		}
		size++;
	}
	//get(int index)
	//precondition: assume index is in range 0<=index<size
	public int get (int index) {
		if(index == 0) {
			return front.data;
		}else {
			ListNode current=front;
			for(int i = 0; i<index; i++) {
				current = current.next;
			}
		return current.data;
		}
	}
	
	public void add(ListNode node) {
		if(front==null) {
			front = node;
		}else{
         ListNode current = front;//save reference
         while(current.next!=null){
            current=current.next;
         }
         current.next=node;
            
      }
		size++;
	}
	public int size() {
		return size;
	}
	
	public String toString() {
		if(front==null) {
			return "[ ]";
		}
		
		String result = "["+front.data;
		ListNode current = front;
		while(current.next != null) {
			current = current.next;
			result += ", " + current.data;
		}
		return result + "]";
	}
	
	//find max number in linked list and return
	//return Integer.MIN_VALUE if list is empty
	public int findMax() {
		int max = Integer.MIN_VALUE;
		if(front == null) {
			return max;
		}
		//traverse linked list to find largest number
		ListNode current = front;
		//current is being used instead of current.next so we 
		//are checking all nodes
		while(current.next != null) {
			if(current.data > max)
				max = current.data;
			current=current.next;
		}
		return max;
	}
	public int indexOf(int value) {
		int index = 0;
		ListNode current = front;
		while(current!=null) {
			if(current.data == value)
				return index;
			index++;
			current=current.next;
		}
		return -1;
	}
	public void frontToBack() {
		if(front == null || front.next==null) {
			return;
		}
		ListNode move=front;
		front=front.next;
		move.next=null; //very important to be careful of order
		ListNode current=front;
		while(current.next!=null) {
			current=current.next;
			
		}
		current.next=move;
		
			
	}
	public void methodOne() {
		ListNode current = front;
		while(current.next != null) {
			System.out.println(current.data+" ");
			current=current.next;
		}
		
	}
}
