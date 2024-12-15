

public class ShapeArray {

	public static void main(String[] args) {
		Shape shapeArray[] = new Shape[3];
		
		shapeArray[0] = new Triangle(2, 3, 4);
		shapeArray[1] = new Circle(2);
		shapeArray[2] = new Rectangle(4, 2);
		
		for(int i = 0; i < shapeArray.length; i++) {
			System.out.println(shapeArray[i].toString());
		}	

	}

}
