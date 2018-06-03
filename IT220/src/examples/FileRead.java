package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		Scanner fileIn = null;
		String[] parts = null;
		try{
			fileIn = new Scanner(new File("input/input.txt"));
			while(fileIn.hasNextLine()) {
				String line = fileIn.nextLine();
				parts = line.split(" ");
/*				String name = parts[0];
				int num = Integer.parseInt(parts[1]);
				boolean bool = Boolean.parseBoolean(parts[2]);
*/				
				
			}
			System.out.println(Arrays.toString(parts));
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if(fileIn != null) {
				fileIn.close();
			}
		}
		Scanner reader = new Scanner("input.txt");

	}

}
