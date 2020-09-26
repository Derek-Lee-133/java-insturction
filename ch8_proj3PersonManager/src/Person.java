

public class Person {
	
	// instance variables
	private String firstName;
	private String lastName;
	
	 // constructor
	public Person(String firstName, String lastName) {
		
	
	this.firstName = firstName;
	
	}
	
	//  geters and setters
	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastName;
	}

	public void setLastname(String lastName) {
		this.lastName = lastName;
	}

	// overrides
	
	@Override
	public String toString() {
		return "name: " + firstName + " + lastName: ";
	}
	
	
	
	
	
}
