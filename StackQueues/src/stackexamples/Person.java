package stackexamples;

public class Person {
	public String fullName="";
	
	public Person(String name){
		this.fullName=name;
	}
	
	
/*	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

*/
	public String toString() {
		return "Person: " + fullName;
	}
}
