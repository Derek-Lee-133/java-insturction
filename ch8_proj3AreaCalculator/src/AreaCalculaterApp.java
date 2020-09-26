
public class AreaCalculaterApp {
	
	private static void printArea(String shapeName, Shape shape)
	{
		System.out.println("area of the" + shapeName+ "you entered is" + shape.getArea());
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the Area Calculator");

		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
			
		{
			String csr = Console.getString("Calculate area of a circle, square or rectangle? (c/s/r)");
			switch (csr) {
			case "c":
			case "C":
				double radius = Console.getDouble("Enter radius: ");
				Circle circle = new Circle(radius);
				printArea ("Circle", circle);
				break;
			case "s":
			case "S":
				double squarewidth = Console.getDouble("Enter width: ");
				Square square = new Square(squarewidth);
				printArea ("Square", square);
				break;
			case "r":
			case "R":
				double rectanglewidth = Console.getDouble("Enter width: ");
				double height = Console.getDouble("Enter height: ");
				Rectangle rectangle = new Rectangle(rectanglewidth, height);
				printArea ("Rectangle", rectangle);
				break;

			}
		}
	}
}
