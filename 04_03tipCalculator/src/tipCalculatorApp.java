import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class tipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		Scanner sc = new Scanner(System.in);
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		currency.setMaximumFractionDigits(2);
		String choice = ("y");
		while (choice.equalsIgnoreCase("y")) {System.out.print("Cost of meal: ");
		BigDecimal cost = sc.nextBigDecimal();
		
// 15% Tip
		System.out.println("15%");
		BigDecimal percent15 = new BigDecimal(0.15);
		
		BigDecimal tipAmount = percent15.multiply(cost);
		BigDecimal totalAmount = tipAmount.add(cost);
		String message =
		("Tip amount:  "+"  "+ currency.format(tipAmount))+ "\n"
		+("Total amount:  "+ currency.format( totalAmount));
		System.out.println(message);
				
		
// 20% Tip
		System.out.println("20%");
BigDecimal percent20 = new BigDecimal(0.20);
		
		BigDecimal tipAmount20 = percent20.multiply(cost);
		BigDecimal totalAmount20 = tipAmount20.add(cost);
		String message20 =
		("Tip amount:  "+"  "+ currency.format(tipAmount20))+ "\n"
		+("Total amount:  "+ currency.format( totalAmount20));
		System.out.println(message20);
// 25% Tip
		System.out.println("25%");
BigDecimal percent25 = new BigDecimal(0.25);
		
		BigDecimal tipAmount25 = percent25.multiply(cost);
		BigDecimal totalAmount25 = tipAmount.add(cost);
		String message25 =
		("Tip amount:  "+"  "+ currency.format(tipAmount25))+ "\n"
		+("Total amount:  "+ currency.format( totalAmount25));
		System.out.println(message25);
		System.out.println();
		
// Continue
		System.out.print("Continue? y/n: ");
		choice = sc.next();
		System.out.println();
		System.out.println("Bye!");
	}

	}
		
}
	


