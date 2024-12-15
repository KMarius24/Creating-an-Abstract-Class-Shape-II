
public class Circle extends Shape {
	double radius;           // attribute "radius"
	double pi = Math.PI;


	// constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// "toString" method for print area and perimeter 
	public String toString() {
		return ("The area of circle is : " + area() + "\nThe perimeter of circle is: " + perimeter()+ "\n");
	}

    // computes area of circle
	@Override
	public double area() {
		return (pi * radius * radius);
	}

	// computes perimeter of circle
	@Override
	public double perimeter() {
		return (2 * pi * radius);
	}

}
