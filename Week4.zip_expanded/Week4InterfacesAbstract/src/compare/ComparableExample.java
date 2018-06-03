package compare;

import java.util.Arrays;
import shapes.Circle;
public class ComparableExample {

	
	public static void main(String[] args) {
		Comparable<Integer>[] nums =  new Integer[3];
		 nums[0]=5;
		 nums[1]=4;
		 nums[2]=3;
		 
		sortDisplay(nums);
		
		Comparable<Circle>[] circles = new Circle[3];
		circles[0]=new Circle(8.0);
		circles[1]=new Circle(3.5);
		circles[2]=new Circle(2);
		
		 
		sortDisplay(circles);

	}
	public static void sortDisplay(Comparable[] list) {
		Arrays.sort(list);
		for(Comparable item: list) {
			 System.out.println(item);
		 }
	}

}
