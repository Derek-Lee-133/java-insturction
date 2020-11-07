import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {

	public static void main(String[] args) {
		System.out.println("The Future Value Calculator\n");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			System.out.print("Enter monthly investment:   ");
			double monthlyInvestment = sc.nextDouble();

			System.out.print("Enter number of years:      ");
			int years = sc.nextInt();
			NumberFormat percentFormatter = NumberFormat.getPercentInstance();
			percentFormatter.setMinimumFractionDigits(1);
			percentFormatter.setMaximumFractionDigits(1);

			for (double intRate = 0.05; intRate <= 0.065; intRate += 0.005) {
				System.out.print("\t" + percentFormatter.format(intRate));

			}
			System.out.println();
			for (int year = 1; year <= years; ++year) {
				System.out.print(year);

				for (double intRate = 0.05; intRate <= 0.065; intRate += 0.005) {
					double monthlyInterestRate = intRate / 12;
					int months = year * 12;

					// Do the calculation from the previous code
					double futureValue = 0.0;
					for (int i = 1; i <= months; i++) {
						futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
						// Use a currency formatter to format the futureValue then print it
					}
					NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
					System.out.print("\t" + currencyFormatter.format(futureValue));

				}
				System.out.println();
			}

			// see if the user wants to continue

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		System.out.println("Bye!");
	}
}