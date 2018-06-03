package polyexample;

public class Dog extends Animal {
   
	private int boneCount; // field specific to Dog
	
	public Dog() {
		super();
		boneCount=5;
	}

	public Dog(double weight, double h, boolean rabiesVaccine, String name, String breed) {
		super(weight, h, rabiesVaccine, name, breed);
		boneCount=5;
	}
	
	public void boneCount() {
		System.out.println(boneCount);
	}

	@Override
	public String makeSound() {
		
		return "woof";
	}

	@Override
	public String eat() {
	
		return "kibble";
	}
	
	public String toString() {
		return "Dog boneCount = "+this.boneCount+" "+super.toString();
	}
}
