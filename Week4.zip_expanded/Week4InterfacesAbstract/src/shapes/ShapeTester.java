package shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeTester {

	public static void main(String[] args) { 
		List<Shape> myShapes = new ArrayList<Shape>();  
		myShapes.add(new Circle(5.0)); 
		myShapes.add(new Rectangle(4.0, 5.0));
		
		for(Shape s: myShapes)  
			System.out.println(s.getClass() + "area is " +
				s.calcArea( ));

	}
	

}
