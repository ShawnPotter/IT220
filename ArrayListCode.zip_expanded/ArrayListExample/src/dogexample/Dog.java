package dogexample;
/**
 * This class will be the template for Dogs 
 * @author susan
 *
 */
public class Dog implements Audible {

	private double weight;
	private double height;
    private boolean rabiesVaccine;
	private String name;
	private String breed;
	
	// add default constructor
	public Dog() {
		this.weight=0.0;
		this.height=0.0;
		this.rabiesVaccine=false;
		this.name="";
		this.breed="";
		
	}
	// add five parameter constructor
	public Dog(double weight, double height, boolean rabiesVaccine, 
			String name, String breed) {
		this.weight=weight;
		this.height=height;
		this.rabiesVaccine=rabiesVaccine;
		this.name=name;
		this.breed=breed;
	}
	// create Setters/Getters/toString

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
	public boolean isRabiesVaccine() {
		return rabiesVaccine;
	}
	public void setRabiesVaccine(boolean rabiesVaccine) {
		this.rabiesVaccine = rabiesVaccine;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String toString() {
		return "\nDog [weight=" + weight + ", height=" + height + ", "
				+ "rabiesVaccine=" + rabiesVaccine + ", "
				+ "name=" + name + ", breed=" + breed + "]";
	}
	
	// implement Audible interface
	
	
	public static void main (String[] args) {
		Dog d = new Dog();
		d.setName("Forrest");
		System.out.println(d);
	}

	public String makeSound() {
		return "BARK";
	}
}
