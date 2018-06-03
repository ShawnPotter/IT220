package linkedlists;

public class LinkListClient {

	public static void main(String[] args) {
		LinkedIntList list = new LinkedIntList();
		ListNode node1 = new ListNode(200,null);
		list.add(node1);
		ListNode node2 = new ListNode(56,null);
		list.add(node2);
		ListNode node3=new ListNode(99,null);
		list.add(node3);
		ListNode node4=new ListNode(100,null);
		list.add(node4);
/*		System.out.println(list.toString()+", size: "+list.size());
		for(int i = 0; i<4;i++) {
			System.out.println(list.get(i));
		}*/
		list.methodOne();
/*		System.out.println(list.indexOf(200));
		System.out.println(list.indexOf(56));
		System.out.println(list.indexOf(99));
		System.out.println(list.indexOf(100));
		
		list.frontToBack();
		System.out.println(list);
		
		
		list.add(2, 30);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		*/
	}
	

}
