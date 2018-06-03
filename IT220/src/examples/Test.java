package examples;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-3);
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(0);
		//list.
		//System.out.println(list);
		for (int i = list.size() - 1; i > 0; i--) { 
			if (list.get(i) < list.get(i - 1)) { 
				int element = list.get(i); 
				list.remove(i); 
				list.add(0, element); 
			} 
		}
		System.out.println(list); 
	}
}

// 5;  5 > 0; 5--
//if 5 < 5 - 1
// element = 5
//remove 5