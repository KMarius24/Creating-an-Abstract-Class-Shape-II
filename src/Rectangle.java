
public class Rectangle extends Shape {
	double width;       // attribute "width"
	double length;      // attribute "length"
	
	// constructor
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	// "toString" method for print area and perimeter 
	public String toString() {
		return ("The area of rectangle is : " + area() + "\nThe perimeter of rectangle is: " + perimeter()+ "\n");
		
	}
	
    // computes area of rectangle
	@Override
	public double area() {
		return (width * length);
	}

	// computes perimeter of rectangle
	@Override
	public double perimeter() {
		
		return (2 * width + 2 * length);
	}

}
