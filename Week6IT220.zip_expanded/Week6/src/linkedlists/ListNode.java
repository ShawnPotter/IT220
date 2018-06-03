package linkedlists;

public class ListNode {
	public int data;
	public ListNode next;
	
	//default constructor
	public ListNode() {
		this(0,null);
	}
	
	//1 param constructor
	public ListNode(int data) {
		this(data,null);
	}
	
	//2 param constructor
	public ListNode(int data, ListNode next) {
		this.data=data;
		this.next=next;
	}
}
