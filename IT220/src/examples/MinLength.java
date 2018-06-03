package examples;

import java.util.ArrayList;

public class MinLength {

	public static int minLength(ArrayList<String> list){
	    if(!list.isEmpty()) {
	        int min = list.get(0).length();
	       
	        /*
	        for(int i = 0; i < list.size(); i++) {
	            int num = list.get(i).length();
	            if(num < min) {
	                min = num;
	            }
	        }
	        */
	        //easier method then above
	        for(String s : list) {
	        	
	        	if(s.length()<min) {
	        		min = s.length();
	        	}
	        }
	        return min;
	    }
	    else {
	        return 0;
	    }
	}
	public static void main(String[] args) {
		

	}

}
