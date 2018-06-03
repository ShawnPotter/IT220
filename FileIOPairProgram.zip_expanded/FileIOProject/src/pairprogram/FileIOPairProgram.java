package pairprogram;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOPairProgram {

	public static boolean copyFile(String source, String destination) {
		// Declare a Scanner fileIn variable and initialize to null
		 
		 //Declare a PrintWriter fileOut variable and initialize to null
		 
		// Declare a boolean success variable and initialize to false
	
		// Use a try-catch-finally 
	    // try 
		     // instantiate the fileIn Scanner object using a new File with the passed in source
		
	    	 // instantiate the fileOut Printwriter object using the passed in destination
	    	
		    // while fileIn has a next line
	    	     // read in the line of text with the fileIn object into a String variable
	    		
		         // write out the line of text in the String variable with the fileOut object
	    		 
	    	 // end of while
		     // set success boolean to true
	    
		 // end try
		 // catch a FileNotFoundException
	         // print out error message for exception
	    	 
		 // end catch
		 // finally
	        // close fileIn object
		    // close fileOut object
	     // end finally
		 // return success boolean variable
	     return false;
	}
	
	public static int wordCount(String source) {
		// initialize an integer count variable
		
		// use a try-with block
		// instantiate the fileIn Scanner object using a new File with the passed in source
		     // while fileIn has a next line
	             // read in the line of text with the fileIn object into a String variable
			     // use the split method on a space " " to break up the line of text into an array of Strings
			     // add the length of the array of Strings to the word count variable
			 // end while
		// end try
		
		// catch a FileNotFoundException
            // print out error message for exception
 	    // end catch
		// return the word count variable
		return 0;
	}
	
	public static void main(String[] args) {	
		boolean success = copyFile("input/names.txt","copies/names.txt");
		System.out.println("Success of copyFile is: "+success);
		int count = wordCount("input/names.txt");
		System.out.println("Word Count: "+count);
	}
}