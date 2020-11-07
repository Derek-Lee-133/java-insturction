package prs.business;

public class User {

	private int id;
	private String userName;
	private String passWord;
	private String firstName;
	private String lastName;
	private String phonenumber;
	private String email;
	private boolean isReveiwer;
	private boolean isAdmin;
	
	public User() {
		this(0,"","","","","","",false,false);
	}
	public User(int id, String userName, String passWord, String firstName, String lastName, String phonenumber,
			String email, boolean isReveiwer, boolean isAdmin) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phonenumber = phonenumber;
		this.email = email;
		this.isReveiwer = isReveiwer;
		this.isAdmin = isAdmin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isReveiwer() {
		return isReveiwer;
	}
	public void setReveiwer(boolean isReveiwer) {
		this.isReveiwer = isReveiwer;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", phonenumber=" + phonenumber + ", email=" + email + ", isReveiwer="
				+ isReveiwer + ", isAdmin=" + isAdmin + "]";
	}
	
}
