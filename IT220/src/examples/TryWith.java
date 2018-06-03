package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWith {

	public static void main(String[] args)
	{
		try(Scanner reader = new Scanner(new File("Data/test.txt")))
		{
			while(reader.hasNext()) {
				System.out.println(reader.hasNextLine());
			}
			
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
	}
}
