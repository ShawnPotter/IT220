package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * Sets contain a collection of unique objects.  Set are similar in concept to a Mathematical Set.
 * You can form a union(addAll), intersection(retainAll), difference(removeAll), superset/subset(containsAll)
 * Set Characteristics:
 * 1) Set items have no index (ArrayList does)
 * 2) Set items are unique (no duplicates) (ArrayList can have duplicates)
 * 3) Set is an interface which HashSet and TreeSet class implement 
 * 4) TreeSet Class is fast and maintains elements in sorted order (using a compareTo method
 * 5) HashSet Class is faster but does not maintain elements in any order 
 * 6) Sets have methods to find union, intersection, difference, and superset/subset.
 *     
 * Common Methods: 
 * 1) set.add(value) - adds a value to the set if it is not already there       
 *         - in a TreeSet it is inserted in the correct spot 
 *         - in a HashSet it is undetermined where it is inserted 
 *
 * 2) set.remove(value) - removes the given value from the set (notice no index can be given)
 * 3) set.contains(value) - returns whether the set contains the value(true or false) 
 * 4) set.size() - returns the number of values in the set
 * 5) set.toString() - returns a String representation of the set
 * 6) set.clear() - removes all items 
 * 7) set.isEmpty() - returns true if set is empty false otherwise
 * 
 */
public class SetExamples {

	/**
	 * This method creates a set, adds items to the set, removes an item from the
	 * set, checks if the item is contained within the set, and uses an iterator to
	 * remove all words that contain the letter o from the set
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * 
	 * This method constructs a TreeSet or HashSet depending on the SetType enum
	 * parameter that is passed to the method and also accepts a sentence that will
	 * be split up into words and then added to the set. This method returns the set
	 * reference to the calling method and prints the set to the console window.
	 * 
	 * @param type
	 *            - identifies whether the set is a HashSet or TreeSet
	 * @param sentence
	 *            - a String of words separated by a space
	 * @return a Set of String
	 */
	public static Set<String> createSet(SetType type, String sentence) {
		return null;
	}

	/**
	 * This method will remove the word argument from the set and return whether it
	 * was successful removing the word as well as printing to the console whether word
	 * was found and removed or not found. If the word or set is null, then an
	 * IllegalArgumentException is thrown.
	 * 
	 * @param word - a string value to remove from the set
	 * @param set - a set of strings
	 * @return true if word was found and removed, false otherwise
	 * 
	 */
	public static boolean removeItem(String word, Set<String> set) {
		return false;
	}

}
