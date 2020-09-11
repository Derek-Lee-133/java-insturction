import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class chapterreview {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		Scanner sc = new Scanner(System.in);
		String choice ="y";
		while (choice.equalsIgnoreCase("y")) {
		
		
		System.out.print("Enter Loan Amoun:  ");
		BigDecimal loanAmount = sc.nextBigDecimal();
		
		System.out.println("Enter Interest Rate:  ");
		BigDecimal interestRate = sc.nextBigDecimal();
		 // perform calculation
		
		BigDecimal interest = loanAmount.multiply(interestRate);
		interest = interest.setScale(2, RoundingMode.HALF_UP);
		// display the results
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		percentFormatter.setMaximumFractionDigits(3);
		
		String loanAmountStr = currencyFormatter.format(loanAmount);
		String interestRateStr = percentFormatter.format(interestRate);
		String interestStr = currencyFormatter.format(interest);
		
		String outputMessage = 
				"Loan Amount :  "+ loanAmountStr + "\n"+
				"Interest Rate:  "+ interestRateStr + "\n"+
				"Interest:  "+ interestStr+ "\n";
		System.out.println(outputMessage);
		}
		// promt to continue
		
		System.out.println("Continue? (y/n):  ");
		choice = sc.next();

		System.out.println("bye");
		
		}
	}

}
