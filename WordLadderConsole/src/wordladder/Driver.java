package wordladder;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		WordLadder test = new WordLadder("files/words.txt");
		//test.printList();
		Scanner console = new Scanner(System.in);
		
		String done="y";
		while(!done.equalsIgnoreCase("n")) {
			System.out.println("Enter two words");
			String word1 = console.next();
			String word2 = console.next();
			test.findLadder(word1, word2);
			System.out.println("Would you like to Continue? Y/N");
			done = console.next();
		}
	}

}