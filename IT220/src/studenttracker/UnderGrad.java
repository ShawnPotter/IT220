package studenttracker;

public class UnderGrad extends Student {
	private String degreeType="";
	
	public UnderGrad(int id, String fName, String lName, String major, String degreeType) {
		super(id, fName, lName, major);
		this.degreeType=degreeType;
		}

	public String getDegreeType() {
		return degreeType;
	}

	@Override
	public String toString() {
		return super.toString() + ", degree: " + degreeType + "";
	}
	
	
}
