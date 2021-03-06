import java.text.NumberFormat;

public class Rectangle {

	private double length;
	private double width;
	public Rectangle() {
		super();
	}
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public static double getAreaOfRectangle(double width,double length) {
		 double area = width * length;
		 
		 return area;
		
	}
	 
	public static double getPerimeterOfRectangle(double width, double length) {
		
		double perimeter = 2 * width + 2 * length;
		
		return perimeter;
	}
	public static void formatAreaOfRectangle(double area) {
		
		 NumberFormat number = NumberFormat.getNumberInstance();
         number.setMinimumFractionDigits(3);
         String message = "Area:         " + number.format(area);
         System.out.println(message);

	}
	public static void formatPerimeterOfRectangle(double perimeter) {
		
		 NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(3);
        String message = "Perimeter:         " + number.format(perimeter);
        System.out.println(message);

	}
}
