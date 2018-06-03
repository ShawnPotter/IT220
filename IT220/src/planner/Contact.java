package planner;

public class Contact {
	private String firstName="";
	private String lastName="";
	private String email="";
	private boolean gender = false;
	
	public Contact(String firstName, String lastName, String email, boolean gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return firstName + " " + lastName;
	}
	public String getEmail() {
		return email;
	}
	public boolean getGender() {
		return gender;
	}
	public void printContact() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return getName() + "(" + email + ")";
	}
	
	
	
	
	
}
