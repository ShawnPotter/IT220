package relativespairprogram;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class RelativesRunner
{
	public static void main( String[] args ) throws IOException
	{
		// Create a Scanner object to read in file
	    File file = new File("files/relatives.txt");
	    Scanner scanner = new Scanner(file);
			
	    // Construct a Relatives object
		Relatives relatives = new Relatives();
	    String line;
	    // while there are lines in the relatives.txt file
	    while(scanner.hasNextLine()) {
	    // read in one line of the file 
	      line = scanner.nextLine();
	     //call the setPersonRelative method which will add this pair to the map
	      relatives.setPersonRelative(line);
	    }
	    scanner.close();

	 
		System.out.println(	relatives.toString());
	    // Create a Scanner object to read from keyboard
	    Scanner s = new Scanner(System.in);
	    // Prompt "Whom should I find the relatives for? "
	    System.out.println("Whom should I find the relatives for?");
	    // Read in response
	    String response = s.nextLine();
	    // Print out _____ is related to _________
	    System.out.println(response + " is related to "+ relatives.getRelatives(response));
        s.close(); 


	}
}