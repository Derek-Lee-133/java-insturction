
public class Contact {
	// instance variables
	private String firstname;
	private String lastname;
	private String email;
	private String phone;

//  the consturctor
	

	 

	public Contact() {
		this("","","","");
	}
	public Contact(String firstname, String lastname, String email, String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
	}
	// set and get methods for variables

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;

	}

	public  String displayContact() {
		String retVal = "---------------------------------\n" +	
						"---Current Contact----------------\n"+
						"------------------------------------\n"+
						"name:            " + this.firstname + this.lastname + "\n" + 
						"email adderss:    " + this.email + "\n" +
						"phone Number:        " + this.phone +"\n" +
						"-----------------------------------------";
		return retVal;
	
	
	}

		
	}


