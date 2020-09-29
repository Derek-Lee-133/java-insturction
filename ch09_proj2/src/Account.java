
public class Account implements Depositable, Withdrawable, Balanceable {
//  instance variables
	protected double balance;

	// constructor
	public Account ( ) {
		balance = 0.0;
	}
	public Account(double intialBalance) {
		balance = intialBalance;

	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
		
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

}
