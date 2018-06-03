package studenttracker;

public class ForeignStudent extends UnderGrad {
	private String visa ="";
	private String originCountry="";

	public ForeignStudent(int id, String fName, String lName, String major, String degreeType,String visa,String originCountry) {
		super(id, fName, lName, major, degreeType);
		this.visa=visa;
		this.originCountry=originCountry;
	}
	

	public String getVisa() {
		return visa;
	}


	public String getOriginCountry() {
		return originCountry;
	}


	@Override
	public String toString() {
		return super.toString() + ", visa: " + visa + ", country: " + originCountry;
	}
}
