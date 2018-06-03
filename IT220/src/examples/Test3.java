package examples;

import java.util.ArrayList;

public class Test3 {
	
	public static int maxLength(ArrayList<String> list){
        int max = 0;
        for (int i = list.size() - 1; i > 0; i--) {
            String s = list.get(i);
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("12");
		list.add("123");
		list.add("11234543");
		list.add("112134132");
		list.add("15446231");
		list.add("1");
		System.out.println(maxLength(list));
		System.out.println();
		
	}
}
