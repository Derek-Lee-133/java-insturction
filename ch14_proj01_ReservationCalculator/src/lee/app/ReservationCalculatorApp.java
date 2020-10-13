package lee.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		
		// welcome message
		System.out.println("Reservation Calculator");
		
	
		// get user input
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		LocalDate arrivalDate = Console.getLocalDate("arrival");
		LocalDate departureDate = Console.getLocalDate("departure");
		
		Reservation res = new Reservation(arrivalDate, departureDate);
		
		System.out.println("Arrival Date: " + res.getArrivalDateFormatted());
		System.out.println("Departure Date: " + res.getDepartureDateFormatted());
		System.out.println("Num Nights: " + res.getNumberOfNights());
		System.out.println();
		
		
		choice = Console.getString("Continue? (y/n)");
		
		
		
		
		// int departureMonth = Console.getInt("Enter the departure month: (1-12)");
		// int departureDay = Console.getInt("Enter the departure day: (1-31)");
		// int departureYear = Console.getInt("Enter the departure year: ");
		
		}
	}

}
