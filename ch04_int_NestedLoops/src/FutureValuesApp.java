import java.text.NumberFormat;

public class FutureValuesApp {

	public static void main(String[] args) {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMinimumFractionDigits(1);
		
		int monthlyInvestment = 100;
		System.out.println("Monthly investment:  " + "\n");
		currency.format(monthlyInvestment)  ;
		
		String table = "";
		String headerRow =  "Year       ";
		
		for (double rate = 5.0; rate < 7.0; rate += 0.5) {
			headerRow += percent.format(rate / 100) + "       ";		}
		
	}

}
