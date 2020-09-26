
public class Customer extends Person {
	 // instance variables
	private String CustmerNumber;
	 
	
	// constructor
	 public Customer(String firstName, String lastName, String CustomerNumber) {
		 super(firstName, lastName);
		 this.CustmerNumber = CustomerNumber;
	 }
	 public String getCustmerNumber() {
			return CustmerNumber;
		}

		public void setCustmerNumber(String custmerNumber) {
			this.CustmerNumber = custmerNumber;
		}
		// overrides
		
		@Override
		public String toString() {
			return super.toString() + "\nCustomer Number: " + CustmerNumber;
		}

}
