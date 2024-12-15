
public class Triangle extends Shape {
	double side1;              // attribute "side1"
	double side2;              // attribute "side2"
	double side3;              // attribute "side3"

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	
	// "toString" method for print area and perimeter 
	public String toString() {
		return ("The area of triangle is : " + area() + "\nThe perimeter of triangle is: " + perimeter() + "\n");
	}

	// computes area of triangle
	@Override
	public double area() {
		double s = (side1 + side2 + side3) / 2;
		return (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
	}

	// computes perimeter of triangle
	@Override
	public double perimeter() {
		return (side1 + side2 + side3);
	}

}
