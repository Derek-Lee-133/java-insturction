package bmdb.business;

import java.time.LocalDate;

public class Actor {
	private long id;
	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate birthdate;
	
	public Actor() {
		id = 0;
		firstName = "";
		lastName = "";
		gender = "";
		birthdate = LocalDate.now();
	}

	public Actor(long id, String firstName, String lastName, String gender, LocalDate birthdate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthdate = birthdate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", birthdate=" + birthdate + "]";
	}
	

}
