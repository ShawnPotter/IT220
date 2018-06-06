package innerclasses;

public class LinkedIntListClient {

	public static void main(String[] args) {
		LinkedIntList list = new LinkedIntList();
		
		list.add(33);
		list.add(66);
		list.add(84);
		System.out.println(list);
		list.add(3,99);
		System.out.println(list);
	}

}
