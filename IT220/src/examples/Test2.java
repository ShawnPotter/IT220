package examples;

import java.util.ArrayList;

public class Test2 {
	
	public static int minLength(ArrayList<String> list){
        if(!list.isEmpty())
        {
        	int min = list.get(0).length();
	        for(int i = 0; i < list.size(); i++)
	        {
	        	int num = list.get(i).length();
	        	if(num < min)
	        	{
	        		min = num;
	        	}
	        }
	        return min;
        }
        else {
        	return 0;
        }
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1123");
		list.add("12");
		list.add("12483");
		list.add("123454");
		list.add("12345");
		list.add("15646432");
		System.out.println(minLength(list));	
	}
}
