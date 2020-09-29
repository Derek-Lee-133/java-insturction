
public class CheckingAccount extends Account {
// instance variables
	 private double monthlyfee;
	
	//  constructor
	public CheckingAccount() {
		
		monthlyfee = 0.0;
	}
// getters and setters
	public double getMonthlyfee() {
		return monthlyfee;
	}
	public CheckingAccount(double initialBalance, double monthlyFee) {
		super(initialBalance);
		this.monthlyfee = monthlyFee;
	}
	public double monthlyFeeBal() {
		return monthlyfee;
	}
	// public void accountBalance() {
		// balance = (balance - monthlyfee);
//  }
	// Helpers
		public void applyMonthlyFee() {
			balance -= monthlyfee;
		}
}
