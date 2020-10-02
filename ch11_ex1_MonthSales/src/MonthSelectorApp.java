import java.text.NumberFormat;

public class MonthSelectorApp {

	public static void main(String[] args) {
		System.out.println("Monthly Sales\n");

		// declare monthNames and monthSales arrays
		String[] monthName = new String[12];
		monthName[0] = "January";
		monthName[1] = "Febuary";
		monthName[2] = "March";
		monthName[3] = "April";
		monthName[4] = "May";
		monthName[5] = "June";
		monthName[6] = "July";
		monthName[7] = "August";
		monthName[8] = "September";
		monthName[9] = "October";
		monthName[10] = "November";
		monthName[11] = "December";
		
		
		double[] monthSales = new double[12];
		monthSales[0] = 995.00;
		monthSales[1] = 1000.00;
		monthSales[2] = 1005.00;
		monthSales[3] = 1010.00;
		monthSales[4] = 1015.00;
		monthSales[5] = 1020.00;
		monthSales[6] = 1025.00;
		monthSales[7] = 1030.00;
		monthSales[8] = 1035.00;
		monthSales[9] = 1040.00;
		monthSales[10] = 1045.00;
		monthSales[11] = 1050.00;
		


		// get currency formatting
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		// get one or more months
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			int monthNumber = Console.getInt("Enter month number: ");

			// validate input
			if (monthNumber < 1 || monthNumber > monthName.length) {
				Console.displayLine("Invalid month number. Try again.");
				
				continue;
			}

			// get the index number for the month
		
				int monthIndex = monthNumber -1;
			}
			
			// and display the month name and sales
		
         Console.displayLine("Sales for " + monthName[monthNameIndex] +
                 ": " + currency.format(monthSales[monthSalesIndex]) + "\n");
			
			// check if the user wants to continue
			choice = Console.getString("Continue? (y/n): ");
			Console.displayLine();
		}

		// display the total sales for the year

		Console.displayLine();
	}

}
