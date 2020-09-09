import java.util.Scanner;
public class StudentRegestrationApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// for a new student to fill out
		// welcome them
		System.out.println("Welcome to Student Regestration");
		System.out.println();
		
		// ask them personal info
		System.out.println("Enter first name:");
		String firstname = sc.next();
		
		System.out.println("Enter last name:");
		String lastname = sc.next();
		
		System.out.println("Enter birth year:");
		int count = sc.nextInt();
		
		
// let them see their info and give them their temp password end session
		System.out.println("Student Regestration Form");
		System.out.println();
		
		System.out.print("Enter first name:"+" "+firstname);
		System.out.print("Enter last name:"+" " +lastname);
		System.out.print("Enter birth year:" +" "+count);
		System.out.println();
		System.out.println("Welcome"+" "+ firstname+" "+ lastname+"!");
		System.out.println("Your regestration is complete");
		System.out.println("Your temporary password is:" +" " + lastname + "*" + count);
		System.out.println("Good bye have a fun school year.");
		System.out.println();
		
		
		

	}

}
