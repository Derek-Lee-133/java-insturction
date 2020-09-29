
public class Square extends Shape {

	// fields
	private double width;

	// constructor
	public Square(double width) {
		this.width = width;
		// getters and setters
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double radius) {
		this.width = radius;
	}

	@Override
	public double getArea() {

		return width * width;

	}
}
