package wordladder;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordLadder {
	private List<String> words = new ArrayList<String>();
	private List<String> ladder = new ArrayList<String>();
	private int steps;
	
	public WordLadder() {
		// TODO Auto-generated constructor stub
	}

	public WordLadder(String source) {
		
		try(Scanner fileIn = new Scanner(new File(source))){
			while(fileIn.hasNextLine()) {
				words.add(fileIn.nextLine());
			}
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
	public boolean findLadder(String startWord, String endWord) {
		ladder.clear();
		fLadder(startWord, endWord);
		return false;
	}
	
	
	private boolean fLadder(String currentWord, String endWord) {
		//System.out.println(ladder); //debug
		if(currentWord.equalsIgnoreCase(endWord)) {
			printList(ladder);
			return true;
		}
		for(String s: words) {
			//ladder.add(currentWord);
			if(oneDiff(currentWord, s) && !(ladder.contains(s))) {
				ladder.add(s);
				steps=+1;
				if(fLadder(s, endWord)==true) {
					return true;
				}
			}
		}
		return false;
		
		
	}
	
	
	public void printList(List<String> list) {
		System.out.println(list);
	}
	
	
	public boolean inList(String word, List<String> list) {
		if(list.contains(word))
			return true;
		else
			return false;
	}
	public static boolean oneDiff(String word1, String word2) {
		int diff = 0;
		int wordLength = word2.length();
		if(word1.length()==word2.length()) {
			for(int i = 0; i < wordLength; i++) {
				//System.out.println(wordLength); //debug
				//System.out.println(i); //debug
				//System.out.println("Comparing: "+word1.charAt(i)+" and "+word2.charAt(i)); //debug
				if(word1.charAt(i)!=word2.charAt(i)) {
					diff += 1;
				}
				
				
			}
		}
		//System.out.println(diff); //debug
		if(word1.length() == word2.length() && diff==1) {
			//System.out.println(diff); //debug
			return true;
		}
		return false;
	}


/*	public static void main(String[] args) {
		String word1 = "word";
		String word2 = "waws";
		System.out.println(oneDiff(word1, word2));
	}*/
}