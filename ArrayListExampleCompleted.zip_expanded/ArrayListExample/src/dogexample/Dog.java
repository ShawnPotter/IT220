package dogexample;
/**
 * This class will be the template for Dogs 
 * @author susan
 *
 */
public class Dog implements Audible {

	// fields or instance variables
	private double weight; //0.0
	private double height; //0.0
    private boolean rabiesVaccine; //false
	private String name; //null
	private String breed; //null
	
	// add default constructor
	public Dog(){
		this.weight=0.0;
		this.height=0.0;
		this.rabiesVaccine=false;
		this.name=""; // empty string
		this.breed="Unknown";
		
	}
	// add five parameter constructor
	public Dog(double weight, double h, boolean rabiesVaccine,
			String name, String breed){
		
		this.weight=weight;
		this.height=h;
		this.rabiesVaccine=rabiesVaccine;
		this.name=name;
		this.breed=breed;
	}
	
	
	// create Setters/Getters/toString
	public void setName(String name){
		this.name=name;
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
	@Override
	public String toString() {
		return "Dog [weight=" + weight + ","
				+ " height=" + height + ", "
						+ "rabiesVaccine=" + rabiesVaccine +
						", name=" + name
				+ ", breed=" + breed + "]";
	}
	// implement Audible interface
	// test
	public static void main(String[] args){
		Dog d = new Dog();
		d.setName("Forrest");
		System.out.println(d);
	}
	@Override
	public String makeSound() {
		return "woof";
	}
}
