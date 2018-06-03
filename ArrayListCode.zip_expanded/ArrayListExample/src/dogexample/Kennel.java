package dogexample;

import java.util.ArrayList;

public class Kennel {
	private ArrayList<Dog> dogs; //null
	private ArrayList<Cat> cats;
	private String kennelName;
	private String city;
	private String state;
	private static final int MAX_DOGS = 5;
	private static final int MAX_CATS = 3;
	// default constructor creates a kennel with 
	// 5 dogs with unknown names
	public Kennel() {
		//add dogs to kennel
		dogs = new ArrayList<Dog>();
		for(int i = 0; i < MAX_DOGS; i++) {
			Dog d = new Dog();
			dogs.add(d);
		}
		//add cats to kennel
		cats = new ArrayList<Cat>();
		for(int i = 0;i < MAX_CATS; i++) {
			Cat c = new Cat();
			cats.add(c);
		}
		//set kennel information
		this.kennelName = "";
		this.city = "";
		this.state = "";
		
	}
	// four parameter constructor receives a populated list of Dogs, kennelName, city, state
	public Kennel(ArrayList<Dog> dogs, ArrayList<Cat> cats, String kennelName, String city, String state) {
		this.dogs = dogs;
		this.cats = cats;
		this.kennelName = kennelName;
		this.city = city;
		this.state = state;
	}
	// add getters, setters, toString
	public ArrayList<Dog> getDogs() {
		return dogs;
	}
	public ArrayList<Cat> getCats(){
		return cats;
	}
	public void setDogs(ArrayList<Dog> dogs) {
		this.dogs = dogs;
	}
	public void setCats(ArrayList<Cat> cats) {
		this.cats = cats;
	}
	public String getKennelName() {
		return kennelName;
	}
	public void setKennelName(String kennelName) {
		this.kennelName = kennelName;
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
		return "Kennel [\ndogs=" + dogs + ", \ncats=" + cats + ", \nkennelName=" + kennelName + ", city=" + city + ", state="
				+ state + "]";
	}

	
}
