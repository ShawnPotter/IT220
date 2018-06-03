package planner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonalContact extends Contact {
	private LocalDate birthDate;
	private String address = "";
	
	public PersonalContact(String firstName, String lastName, String email, boolean gender, LocalDate birthDate, String address) {
		super(firstName, lastName, email, gender);
		this.birthDate = birthDate;
		this.address = address;
		
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public String getAddress() {
		return address;
	}
	public void printContact() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		return "Personal Contact: " + super.toString() + ", " + birthDate.format(formatter) + ", "+getAddress();
	}
}

