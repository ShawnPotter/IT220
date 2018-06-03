package arrayintlist;

public class ArrayIntListClient {

	public static void main(String[] args) {
		ArrayIntList list1 = new ArrayIntList();
		list1.add(34);
		list1.add(45);
		list1.add(-23);
		
		list1.add(4,99);
		
		System.out.println(list1);

	}

}
