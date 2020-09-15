import java.util.Scanner;

public class TraveltimeCalculatorApp {
public static void main(String[] args) {
	
	System.out.println("Welcome to the travel time calculator");
	
	Scanner sc = new Scanner(System.in);
	
	String choice = "y";
	while (choice.equalsIgnoreCase("y"));
	System.out.print("Enter miles: ");
	double miles = sc.nextDouble();
	
	System.out.println("Enter miles per hour:  ");
	double mph = sc.nextDouble();
	
	int hours = (int)(miles/ mph);
	// double milesRemaining = miles % mph;
	
	int minutes = (int) (milesremaining % MINUTES_PER_HOUR);
	
	
	
}
}
