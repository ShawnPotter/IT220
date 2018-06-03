package examples;

import java.io.*;

public class FileWrite {

	public static void main(String[] args) {
		try(PrintWriter fileOut = new PrintWriter("output/data.txt");) {
			fileOut.println("Hello World");
			fileOut.println("random");
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}