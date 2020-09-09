import java.text.NumberFormat;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class interestCalcutaorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			// welcome message
			
			System.out.println("Welcome to the Interest Calculator");
			
			// user input statements
			
			System.out.print("Enter Loan Amount:  ");
			String lamtString = sc.next();
			// converting to bigdecimal
			
			BigDecimal lamt = new BigDecimal (lamtString);
		
			
			// NumberFormat currency = NumberFormat.getCurrencyInstance();
			
			System.out.print("Enter Interest Rate:  ");
			String intrString = sc.next();
			BigDecimal intr = new BigDecimal (intrString);
			
			// calculations
			
			BigDecimal amIntString = lamt.multiply(intr);
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			
			NumberFormat percent = NumberFormat.getPercentInstance();
			
			String message =
					"Loan Amount:  "+ currency.format(lamt) + "\n"
				+	"Interest Rate:  " + percent.format(intr) + "\n"
				+   "Interest:  "+ currency.format(amIntString);
				System.out.println(message);
				System.out.println("Continue? (y/n:  ");
				choice = sc.next();
			
			
			
			}

		}

	
	}


