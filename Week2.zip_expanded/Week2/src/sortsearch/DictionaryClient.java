package sortsearch;

import java.util.Scanner;

/**
 * 
 * @author susan
 *
 */
public class DictionaryClient {

	private final static String EXIT = "3";
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Dictionary words = new Dictionary("data/dictionary.txt");
		long end = System.currentTimeMillis();
		System.out.println("Constructor elasped time: " + (end - start) + " milliseconds ");

		String choice = "";

		while (!choice.equals(EXIT)) {

			displayMenu();

			System.out.print("Enter your numerical choice: ");
			choice = keyboard.next();

			if (choice.equals("1")) {
				findWordDict(words);
			} else if (choice.equals("2")) {
				addWordDict(words);
			}

		}

		System.out.println("GoodBye");
		keyboard.close();

	}

	private static void displayMenu() {
		System.out.println();
		System.out.println("*************************************");
		System.out.println("1. Find a word in the dictionary");
		System.out.println("2. Add a word to the dictionary");
		System.out.println("3. Exit                         ");
		System.out.println("*************************************");
		System.out.println();

	}

	private static void findWordDict(Dictionary words) {
		System.out.print("Enter a word to find in the dictionary");
		String word = keyboard.next();

		long start = System.nanoTime();
		int index = words.findWord(word);
		long end = System.nanoTime();
		System.out.println("findWord elasped time " + (end - start) + " nanoseconds ");

		System.out.println("findWord returned " + index);

	}

	private static void addWordDict(Dictionary words) {
		System.out.print("Add a word to the dictionary");
		String word = keyboard.next();

		long time = words.addWord(0, word);

		System.out.println("addWord elasped time " + time + " nanoseconds ");

	}

}
