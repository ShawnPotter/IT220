package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * This class sets the methods called in the GradeClient class.
 * Shawn Potter
 */

public class Grades {
	private ArrayList<Double> grades = new ArrayList<Double>();

	public Grades() {
		this.grades=grades;
	}


	public Grades(String fileName) {
		//reads a file that the user specifies
		Scanner input = null;
		try {
			input = new Scanner(new File(fileName));
			while(input.hasNextLine()) {
				String line = input.nextLine();
				Double readGrade = Double.parseDouble(line);
				grades.add(readGrade);
			}
		} catch(FileNotFoundException e){
			//exception thrown if file is not found
			System.out.println(e.getMessage());
			
		} finally {
			if(input != null) {
				input.close();
			}
		}
	}



	public void readGrades(String fileName) {
		//reads a file that the user specifies
		Scanner input = null;
		try {
			input = new Scanner(new File(fileName));
			while(input.hasNextLine()) {
				String line = input.nextLine();
				Double readGrade = Double.parseDouble(line);
				grades.add(readGrade);
			}
		} catch(FileNotFoundException e){
			//exception thrown if file is not found
			System.out.println(e.getMessage());
			
		} finally {
			if(input != null) {
				input.close();
			}
		}
		
	}

	public Object calcAverage() {
		//calculates the average of all grades
		double total = 0.0;
		for(int i = grades.size() - 1; i >= 0; i--) {
			double addition = grades.get(i);
			total += addition;
			//System.out.println(total);
		}
		total = total/grades.size();
		//System.out.println(total);
		return total;
	}

	public void addGrade(Double grade) {
		//adds the input grade into the grades ArrayList
		grades.add(grade);
		System.out.println(grades);
		
	}

	public void removeAllGrades(Double grade) {
		//removes all grades that are similar to the input grade
		for(int i = grades.size() - 1; i >= 0; i--) {
			//System.out.println(grades);
			if(grades.get(i).equals(grade)) {
				grades.remove(i);
				//System.out.println(grades);
				
			}
		}
		
	}

	public double dropLowest() {
		//searches the ArrayList for the lowest numbered grade and returns that number and drops the grade
		double min = grades.get(0);
		int indexNum = 0;
		for (int i = grades.size() - 1; i >= 0; i--) {
			if (grades.get(i) < min) {
				min = grades.get(i);
				indexNum = i;
				//System.out.println(min);
				//System.out.println(indexNum);
			}
		}
		double result = grades.get(indexNum);
		grades.remove(indexNum);
		return result;
	}

	public void printSortedGrades() {
		//uses Collections to sort the ArrayList from lowest to highest
		Collections.sort(grades);
		System.out.println(grades);
		
	}

	public ArrayList<Double> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Double> grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Grades" + grades + " ";
	}
	

		

	
}
