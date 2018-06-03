package polyexample;

import dogexample.Audible;

public abstract class Animal implements Audible {
	// fields or instance variables
	private double weight; // 0.0
	private double height; // 0.0
	private boolean rabiesVaccine; // false
	private String name; // null
	private String breed; // null

	// add default constructor
	public Animal() {
		this.weight = 0.0;
		this.height = 0.0;
		this.rabiesVaccine = false;
		this.name = ""; // empty string
		this.breed = "Unknown";

	}

	// add five parameter constructor
	public Animal(double weight, double h, boolean rabiesVaccine, String name, String breed) {

		this.weight = weight;
		this.height = h;
		this.rabiesVaccine = rabiesVaccine;
		this.name = name;
		this.breed = breed;
	}

	// create Setters/Getters/toString
	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public boolean isRabiesVaccine() {
		return rabiesVaccine;
	}

	public void setRabiesVaccine(boolean rabiesVaccine) {
		this.rabiesVaccine = rabiesVaccine;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public abstract String eat();
	
	@Override
	public String toString() {
		return "Animal [weight=" + weight + "," + " height=" + height + ", " + "rabiesVaccine=" + rabiesVaccine
				+ ", name=" + name + ", breed=" + breed + "]";

	}
}
