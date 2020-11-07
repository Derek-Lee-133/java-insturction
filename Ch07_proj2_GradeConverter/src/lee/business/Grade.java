package lee.business;

public class Grade {
	private int number;
	
	public Grade() {
		this(0);
	}
	public Grade (int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getLetter() {
		
		String letterGrade = "F";
		if (number >= 88) {
			letterGrade = "A";
		}else if (number >=80) {
			letterGrade = "B";
		}else if (number >=67) {
			letterGrade = "C";
		}else if (number >= 60) {
		letterGrade = "D";	
		}
		return letterGrade;
	}

}
