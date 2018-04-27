package geometry;

public class Circle implements Shape {
	// instance fields
	
	double r;
	
	// methods;
	
	public double calcArea() {
		return Math.PI*Math.pow(r, 2);
	}

}
