package planner;

public class BusinessContact extends Contact {

	private String company="";
	private String position="";
	private String phoneNumber="";
	public BusinessContact(String firstName, String lastName, String email, boolean gender, String company, String position, String phoneNumber) {
		super(firstName, lastName, email, gender);
		this.company=company;
		this.position=position;
		this.phoneNumber=phoneNumber;
	}
	public String getCompany() {
		return company;
	}
	public String getPosition() {
		return position;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void printContact() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Business Contact: " + super.toString() + ", " + company + " (" + position + "), " + phoneNumber;
	}
	
	
			
	
	
}
