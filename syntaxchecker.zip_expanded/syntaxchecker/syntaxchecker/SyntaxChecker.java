package syntaxchecker;

/*
 * Pair Programming syntaxchecker
 * SyntaxChecker.java
 * Ruvim Radchishin, Katherine Truitt, Shawn Potter 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SyntaxChecker {

	private List<String> expressions;
	private static final String OPEN = "{(<[";
	private static final String CLOSE = "})>]";

	public SyntaxChecker(String filename) {
		File file = new File(filename);
		expressions = new ArrayList<String>();
		try (Scanner fileIn = new Scanner(file)) {
			while (fileIn.hasNextLine()) {
				String line = fileIn.nextLine();
				expressions.add(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	// checkExpressions method that determines if the expression
	// has a closing brace for every opening brace
	private boolean checkExpression(String exp) {
		Stack<String> openSymbols = new Stack<>();
		for(int i = 0; i<exp.length();i++) {
			String value = exp.substring(i,i+1);
			if(OPEN.indexOf(value)>=0) {
				openSymbols.push(value);
			} else if (CLOSE.indexOf(value)>=0) {
				if(openSymbols.isEmpty())
					return false;
				String open = openSymbols.pop();
				if(OPEN.indexOf(open) != CLOSE.indexOf(value)) {
					return false;
				}		
			}	
		}
		if(openSymbols.isEmpty())
			return true;
		else
			return false;
	}

	public String toString() {
		String result = "Syntax Checker: \n\n";
		for (String s : expressions) {
			if (checkExpression(s))
				result += s + " is correct\n\n";
			else
				result += s + " is incorrect\n\n";
		}
		return result;
	}

}
