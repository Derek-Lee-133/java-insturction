
public class Rectangle extends Square {
	// fields
	private double height;
	
	// constructor
	
	public Rectangle(double width, double height)
	{
		super(width);
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setheight (double height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		double area =  this.getWidth() * height;
		return area;
		
	}

}
