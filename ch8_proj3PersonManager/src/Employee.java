
public class Employee extends Person {
	 // instance variables
		private String ssn;
		 
		
		// constructor
		 public Employee(String firstName, String lastName, String EmployeeNumber) {
			 super(firstName, lastName);
			 this.ssn = EmployeeNumber;
		 }
		 public String getEmployeeNumber() {
				return ssn;
			}

			public void setemployee(String EmployeeNumber) {
				this.ssn = EmployeeNumber;
			}
			// overrides
			
			@Override
			public String toString() {
				String maskedSsn = "xxx-xxxx-" + ssn.substring(ssn.length() - 4);
				return super.toString() + "\nSSN: " + maskedSsn;
			}

	}



