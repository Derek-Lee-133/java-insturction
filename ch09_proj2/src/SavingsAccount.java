
public class SavingsAccount extends Account {

	// variables
	private double monthlyInterestRate;
	private double calculatedInterest;

	// constructor
	public SavingsAccount() {
		
		this.monthlyInterestRate = 0.0;
		calculatedInterest = 0.0;

	}
	public SavingsAccount(double Balance, double monthlyInterestRate) {
		super(Balance);
		this.monthlyInterestRate = monthlyInterestRate;
		this.calculatedInterest = 0.0;
	}

	// getters
	public double getMonthlyInterestRate() {
		return monthlyInterestRate;

	}
	public double getCalculatedInterest() {
		return calculatedInterest;
	}

//  helpers

	public void applyMonthlyInterest() {
		calculatedInterest = balance * monthlyInterestRate / 100.0;
		balance += calculatedInterest;
	}
}
