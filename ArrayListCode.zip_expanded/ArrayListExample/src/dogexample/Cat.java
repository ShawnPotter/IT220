package dogexample;
/**
 * Cat class, identical to the dog class, but for cats!
 * Shawn Potter, Rizwan Ali
 */
public class Cat implements Audible {

	private double weight;
	private double height;
    private boolean rabiesVaccine;
	private String name;
	private String breed;
	
	// add default constructor
	public Cat() {
		this.weight=0.0;
		this.height=0.0;
		this.rabiesVaccine=false;
		this.name="";
		this.breed="";
		
	}
	// add five parameter constructor
	public Cat(double weight, double height, boolean rabiesVaccine, 
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
		return "\nCat [weight=" + weight + ", height=" + height + ", "
				+ "rabiesVaccine=" + rabiesVaccine + ", "
				+ "name=" + name + ", breed=" + breed + "]";
	}
	
	// implement Audible interface
	
	
	public static void main (String[] args) {
		Cat c = new Cat();
		c.setName("Kitty");
		System.out.println(c);
	}

	public String makeSound() {
		return "Meow";
	}
}
