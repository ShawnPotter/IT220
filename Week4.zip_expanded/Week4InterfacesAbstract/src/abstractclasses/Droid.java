package abstractclasses;

public abstract class Droid {

	private int x;
	private int y;
	private String name;
	
	public Droid(int x, int y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void move();
	
	public abstract void speak();

	@Override
	public String toString() {
		return "Droid [x=" + x + ", y=" + y + ", name=" + name + "]";
	}
	
	

}
