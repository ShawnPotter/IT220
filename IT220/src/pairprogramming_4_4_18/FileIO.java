/*FileIO Pair Program
 * Pair Programming 4/9/2018
 * Shawn Potter, Rizwan Ali
 */

package pairprogramming_4_4_18;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class FileIO {
	
	public static boolean copyFile(String source, String destination) {
		Scanner fileIn = null;
		String[] parts = null;
		try(PrintWriter fileOut = new PrintWriter(destination);){
			fileIn = new Scanner(new File(source));
			while(fileIn.hasNextLine()) {
				String line = fileIn.nextLine();
				parts = line.split(" ");
				fileOut.println(Arrays.toString(parts));
				
				}
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if(fileIn != null) {
				fileIn.close();
			}
		}
		return true;
	}
	
	public static int wordCount(String source)
	{
		int counter = 0;
		String[] parts = null;
		try (Scanner fileIn = new Scanner(new File(source))){
			while(fileIn.hasNextLine()){
				String line = fileIn.nextLine();
				parts = line.split(" ");
				counter += parts.length;
			} 
		} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
		}
	    return counter;
	}
	public static void main(String[] args)
	{
		boolean success = copyFile("input/input.txt", "output/output.txt");
		System.out.println("Success of copyFile is: "+success);
		int counter = wordCount("input/input.txt");
		System.out.println("Word Count: "+counter);
	}
}
