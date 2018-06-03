package polyexample;

public class Cat extends Animal {

	private int mouseCount;
		
	public Cat() {
		super();
		mouseCount=6;
	}
	public Cat(double weight, double h, boolean rabiesVaccine, String name, String breed) {
		super(weight, h, rabiesVaccine, name, breed);
		mouseCount=7;
	}

	public void miceCount() {
		System.out.println(mouseCount);
	}
	@Override
	public String makeSound() {
		return "meow";
	}

	@Override
	public String eat() {
		return "tuna";
	}
	public String toString() {
		return "Cat mouseCount = "+this.mouseCount+" "+super.toString();
	}
}
