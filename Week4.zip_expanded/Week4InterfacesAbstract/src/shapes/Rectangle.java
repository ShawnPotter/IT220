package shapes;

public class Rectangle implements Shape, Comparable {

	private double width;
	private double length;
	
	public Rectangle() {
		this.width=0;
		this.length=0;
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int compareTo(Object other) {
		Rectangle o = (Rectangle) other;
		
		if(this.calcArea() < o.calcArea())
			return -1;
		else if(this.calcArea() > o.calcArea())
			return 1;
		
		return 0;
	}
	// Shape Interface
	public double calcPerimeter() {	
		return 2*width + 2*length;
	}

	//Shape Interface
	public double calcArea() {
		return width*length;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	

}
