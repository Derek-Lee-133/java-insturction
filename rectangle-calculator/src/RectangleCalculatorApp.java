import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
// welcome message
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		
		//user input
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter Length: ");
		double width = sc.nextDouble();
		System.out.print("Enter Width: ");
		double length = sc.nextDouble();
		// business
		double area = ( 2 * width) + (2 * length);
		double perimeter = width * length;

		// out put
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: "+ area);
		System.out.println();
		// continue
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		System.out.println();
		}
		
		//bye message
		System.out.println("Good-bye");
		
	}

}
