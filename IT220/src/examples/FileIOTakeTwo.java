package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIOTakeTwo {

	public static void main(String[] args) throws FileNotFoundException {
/*		//open a file and read the contents
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Boolean> yesno = new ArrayList<Boolean>();
		ArrayList<Double> decNum = new ArrayList<Double>();
		
		Scanner fileIn = new Scanner(new File("data.txt"));
		while(fileIn.hasNextLine());{
			String line = fileIn.nextLine();
			words.add(line);
		}
		
		String helloWorld = words.get(0);
		String trueFalse = words.get(1);
		String numbers = words.get(2);
		words.clear();
		System.out.println("Words Arraylist: "+words);
		String[] parts = helloWorld.split(" ");
		words.add(parts[0]);
		words.add(parts[1]);
		System.out.println("Number Words: "+parts.length);
		
		System.out.println(trueFalse);
		
		String[] parts2 = trueFalse.split(" ");
		for (int i = 0; i < parts2.length; i++) {
			yesno.add(Boolean.parseBoolean(parts2[i]));
		}
		
		String[] parts3 = numbers.split(" ");
		for (int i = 0; i < parts2.length; i++) {
			decNum.add(Double.parseDouble(parts3[i]));
		}
		
		fileIn.close();
*/
		FileIOTakeTwo.readFile();
	}
	
	private static void readFile() throws FileNotFoundException {
		//open a file and read the contents
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Boolean> yesno = new ArrayList<Boolean>();
		ArrayList<Double> decNum = new ArrayList<Double>();
		
		Scanner fileIn = new Scanner(new File("data.txt"));
		while(fileIn.hasNextLine());{
			String line = fileIn.nextLine();
			words.add(line);
		}
		
		String helloWorld = words.get(0);
		String trueFalse = words.get(1);
		String numbers = words.get(2);
		words.clear();
		System.out.println("Words Arraylist: "+words);
		String[] parts = helloWorld.split(" ");
		words.add(parts[0]);
		words.add(parts[1]);
		System.out.println("Number Words: "+parts.length);
		
		System.out.println(trueFalse);
		
		String[] parts2 = trueFalse.split(" ");
		for (int i = 0; i < parts2.length; i++) {
			yesno.add(Boolean.parseBoolean(parts2[i]));
		}
		
		String[] parts3 = numbers.split(" ");
		for (int i = 0; i < parts2.length; i++) {
			decNum.add(Double.parseDouble(parts3[i]));
		}
		
	}

}
