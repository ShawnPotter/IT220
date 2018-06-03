package shapes;

public class Circle implements Shape, Comparable<Circle> {

	private double radius; 
	
	public Circle() {
		this.radius=0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calcArea() {
		return PI * radius * radius;
	}
	
	public double calcPerimeter() {
		return 2*PI * radius;
	}
	
	public int compareTo(Circle other) {
		if(this.radius > other.radius)
			return 1;
		else if (this.radius < other.radius)
			return -1;
		
		return 0;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

}
