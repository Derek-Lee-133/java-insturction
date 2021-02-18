import java.text.NumberFormat;

public class Rectangle {

	// fields
	private double length;
	private double width;

	// constructors
	public Rectangle() {
		length = 0.0;
		width = 0.0;
	}
	public Rectangle(double length, double width) {
	this.length = length;
	this.width = width;
	}

	// setters and getters
	public void setLength(double length) {
		this.length = length;
	}

	public double getLength() {
		return length;

	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public double calculateAreaOfRectangle() {

		double area = width * length;
		return area;

	}

	public String getAreaOfRectangle() {
		double area = this.calculateAreaOfRectangle();
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMinimumFractionDigits(3);
		String numberFormatted = number.format(area);
		return numberFormatted;
	}

	public double calculatePerimeterOfRectangle() {

		double perimeter = (2 * width) + (2 * length);
		return perimeter;
	}

	public String getPerimeterOfRectangle() {
		double perimeter = this.calculatePerimeterOfRectangle();
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMinimumFractionDigits(3);
		String numberFormatted = number.format(perimeter);
		return numberFormatted;

	}
}