package abstractclasses;

public class R2D2 extends Droid {

	private String direction;
	
	public R2D2() {
		super(0,0,"R2D2");
		this.direction="HORIZONTAL";
		
	}

	@Override
	public void move() {
		int x = this.getX();
		this.setX(x++);

	}

	@Override
	public void speak() {
		System.out.println("Beep-Beep-Beep-Beep");

	}

	@Override
	public String toString() {
		return super.toString() + ", direction: "+direction;
	}
	
	

}
