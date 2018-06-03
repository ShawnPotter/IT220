package sortsearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * This class constructs a dictionary which has a list of sorted words. It will time how long
 * it takes to add a word to the dictionary (without sorting).  It can also find a word using two algorithms
 * a binarySearch and a sequential search.  The calling program can then time the search methods and the constructor.
 * @author susan
 *
 */
public class Dictionary {

	private List<String> dictionary;
	private String fileName;

	public Dictionary(String path) {
		if (path != null) {
			File file = new File(path);

			// if path parameter was for a directory, throw exception and return to calling
			// method
			if (file.isDirectory())
				throw new IllegalArgumentException("Dictionary Constructor: directory was passed, not a file name");
			else
				fileName = path;

			// reads in the words from a file and sorts the words
			readSortDictionary();

		}
	}

	/*
	 * This method reads a file that is assumed to contain dictionary words and adds
	 * all the words in the file to the dictionary list and ensures they are in
	 * sorted order
	 */
	private void readSortDictionary() {
		
		dictionary = new ArrayList<String>();  // here you can switch to another type of List like LinkedList
		
			
		// try with block to read in dictionary file and add words to list
		try (Scanner fileIn = new Scanner(new File(fileName))) {

			while (fileIn.hasNext()) {
				String word = fileIn.next();
				dictionary.add(word);
			}

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: " + fileName);
		}

		// sort the dictionary
		Collections.sort(dictionary);

	}

	/**
	 * This method determines if the word is contained in the dictionary and returns
	 * the index of where the word was found or a negative number if it is not
	 * found. This method assumes the dictionary is sorted and uses the faster
	 * binarySearch method
	 * 
	 * @param word
	 *            - the word to search for
	 * @returns the index of the word found in the dictionary list a negative number
	 *          is returned if it is not found
	 */
	public int findWord(String word) {
		return Collections.binarySearch(dictionary, word);
	}

	/**
	 * This method determines if the word is contained in the dictionary and returns
	 * the index of where the word was found or -1 if not found using the slower sequential or 
	 * linear search
	 * 
	 * @param word
	 *            - the word to search for
	 * @returns the index of the word found in the dictionary list a -1 is returned
	 *          if it is not found
	 */
	public int findSeqWord(String word) {
		for (int i = 0; i < dictionary.size(); i++) {

			if (word.equals(dictionary.get(i)))
				return i;
		}
		return -1;
	}

	/**
	 * This method adds a word to the list at a particular index spot
	 * 
	 * @param index for where the word is to added in the list
	 * @param word to be added to the list
	 * @return elasped time for word to be added in nanoseconds
	 */
	public long addWord(int index, String word) {
		long start = System.nanoTime();
		
		dictionary.add(index,word);
		
		long end = System.nanoTime();
		
		Collections.sort(dictionary);
		
		return (end - start);
	}
	
}
