package dogexample;

import java.util.ArrayList;

public class Kennel {
	private ArrayList<Dog> dogs; // null
	//private ArrayList<Cat> cats;
	private String kennelName;
	private String city;
	private String state;
    // no magic numbers
	private static final int MAX_DOGS=5;
	
	// default constructor creates a kennel with 
	// 5 dogs with unknown/empty names
	public Kennel(){
		dogs = new ArrayList<Dog>();
		for(int i=0; i<MAX_DOGS; i++){
			Dog d = new Dog();
			dogs.add(d);
			
		}
		this.kennelName="";
		this.city="";
		this.state="";
		
	}

	// four parameter constructor receives a populated list of Dogs, kennelName, city, state
	public Kennel(ArrayList<Dog> dogs, String kennelName, String city, String state) {
		this.dogs = dogs;
		this.kennelName = kennelName;
		this.city = city;
		this.state = state;
	}
	
	// add getters, setters, toString
	public void setKennelName(String name){
		this.kennelName=name;
	}
	public String getKennelName(){
		return this.kennelName;
	}

	public ArrayList<Dog> getDogs() {
		return dogs;
	}

	public void setDogs(ArrayList<Dog> dogs) {
		this.dogs = dogs;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Kennel [dogs=" + dogs + ", "
				+ "\nkennelName=" + kennelName + ", "
						+ "city=" + city + ", state=" + state + "]";
	}
	
	
	
	
	

	

}
