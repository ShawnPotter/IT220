package studenttracker;

public class Student {
	
	private int id=0;
	private String fName ="";
	private String lName ="";
	private String major ="";
	
	public Student(int id, String fName, String lName, String major) {
		this.id=id;
		this.fName=fName;
		this.lName=lName;
		this.major=major;
		
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fName + " " + lName;
	}

	public String getMajor() {
		return major;
	}

	@Override
	public String toString() {
		return "Student - " +getFullName()+", id: " + id + ", major: " + major;
	}

}
