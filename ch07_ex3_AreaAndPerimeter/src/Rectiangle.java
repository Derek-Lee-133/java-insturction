
public class Rectiangle {

	private double length;
	private double width;
	public Rectiangle() {
		super();
	}
	public Rectiangle(double length, double width) {
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
	
//	public static String getAreaAsString(double width,double length){
//		String area = Rectiangle.getAreaOfRectangle(width, length);
//		return area;
//	} 
}
