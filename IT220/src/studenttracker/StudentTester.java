package studenttracker;

public class StudentTester {

	public static void main(String[] args) {
		//create a few student objects
		
		//USStudent(int id, String fName, String lName, String major, String degreeType, String ssn)
		USStudent stacey = new USStudent(123, "Stacey", "Morton", "Biology", "BA", "111-111-1111");
		
		//ForeignStudent(int id, String fName, String lName, String major, String degreeType,String visa,String originCountry)
		ForeignStudent william = new ForeignStudent(321, "William", "Fredrich", "Physics", "BAS", "C1-22233334", "Germany");

		//print them
		System.out.println(stacey.toString());
		System.out.println(william.toString());

	}

}
