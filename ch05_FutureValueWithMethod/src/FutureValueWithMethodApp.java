import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueWithMethodApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (!choice.equalsIgnoreCase("n")) {
			// get the input from the user
			double monthlyInvestment;
			double interestRate;
			int years;
			monthlyInvestment = getDouble(sc, "Enter monthly investment:   ");
			interestRate = getDouble(sc, "Enter yearly interest rate: ");
			years = getInt(sc, "Enter number of years: ");

			

			// convert yearly values to monthly values
			double monthlyInterestRate = interestRate / 12 / 100;
			int months = years * 12;

			// call the future value method
			double futureValue = calculateFutureValue(monthlyInvestment, monthlyInterestRate, months);

			// format and display the result
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			System.out.println("Future value:               " + currency.format(futureValue));
			System.out.println();

			// see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}

	}

	private static double calculateFutureValue(double monthlyInvestment, double monthlyInterestRate, int months) {
		double futureValue = 0.0;
		for (int i = 1; i <= months; i++) {
			futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
		}
		return futureValue;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double retVal = 0.0;

		System.out.print(prompt);

		boolean isValid = false;

		while (!isValid) {
			if (sc.hasNextDouble()) {
				retVal = sc.nextDouble();
				sc.nextLine();
				isValid = true;
			} else {
				System.out.println("Invalid decimal number");
				sc.nextLine();
			}

		}

		return retVal;
	}

	public static int getInt(Scanner sc, String prompt) {
		int retVal = 0;
		System.out.println(prompt);
		
		boolean isValid = false;
		
		while (!isValid) {
			if (sc.hasNextInt()) {retVal = sc.nextInt();
			sc.nextLine();
			isValid = true;
		} else {
			System.out.println("Invalid Integer");
			sc.nextLine();
		}
		return retVal;
		
	}
}