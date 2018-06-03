package midtermreview;

public class Person implements Comparable<Person> {
	//instance variables
	private String lastName ="";
	private String firstName="";
	private int age=0;
	private double height=0.0;
	
	//constructor
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, int age, double height){
		this.lastName = lastName;
		this.firstName = firstName;
		this.age=age;
		this.height=height;
	}
	
	
	//getters and setters
	public String getName() {
		return firstName + " " + lastName ;
	}

	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//toString
	@Override
	public String toString() {
		return "Name: " + getName() + ", Age: " + age + ", Height: " + height;
	}
	
	//
	@Override
	public int compareTo(Person other) {
		if(this.age < other.age)
			return -1;
		if(this.age > other.age)
			return 1;
		return 0;
	}
}