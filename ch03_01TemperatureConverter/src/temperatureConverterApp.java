import java.util.Scanner;
public class temperatureConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

	
		
		System.out.print("Enter degrees in Fahrenheit: ");
		double f = sc.nextDouble();
		
		
		double c = (f-32) * 5/9;
		c = (double) Math.round(c*10) / 10;
		System.out.println("Degrees in Celsius: "+ c);
		
		
		
		System.out.println("Continue? (y/n:) ");
		choice = sc.next();

		
		
		System.out.println("Bye");	
	
		}
	}

}
