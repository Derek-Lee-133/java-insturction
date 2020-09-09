import java.util.Scanner;

public class travelTimeCalculatorApp {

	private static final String Double = null;

	public static void main(String[] args) {
		
		// Welcome message
		
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {  
			
			System.out.println("Welcome to the Travel Time Calculator App");

			//  user input
			System.out.print("Enter miles: ");
			double m = sc.nextDouble();
			
			System.out.print("Enter miles per hour:  ");
			double ph = sc.nextDouble();
			
			// business logic
			double t = (short)(m/ph)  ;
			 double tm = (short) m%ph ;

			
			
			
			
			
			
			System.out.println("Estimated travel time\n-------------------");
			System.out.println("Hours:"+" "+t);
			 System.out.println("Minutes: " + " "+ tm );
			 System.out.print("Continue (y/n):  ");
			 choice = sc.next();
		}
		
		
		
		// bye message
		
		System.out.println("Have a good trip Bye");
	}

}
