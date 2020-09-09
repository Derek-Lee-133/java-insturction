import java.util.Scanner;
public class practice {

	public static void main(String[] args) {
		System.out.println("Welcome to practice");
		int x = 14;
		double y = 8.5;
		double result1 = x + y;
		System.out.println("14 + 8.5");
		System.out.println("result"+ " "+ result1);
		String firstName = "Derek";
		String lastName = "Lee";
		String name = firstName + " " + lastName;
		
		 firstName = "Derek";
		 lastName = "Lee";
	   
		name = firstName + " ";
		name += lastName;
		
		System.out.println("name is" + " " +name);
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter a sentence:  ");
		String sentence = sc.nextLine();
		System.out.println("You entered:  " + sentence);
		System.out.println("Enter a number:  ");
		int i = sc.nextInt();
		System.out.println("You entered:  "+ i);
		
		if (i > 10) {
			System.out.println(i + " is greater than 25!!!");
			
		System.out.println("Do you like pinnapple on you pizza?(y/n)");
		String choice = sc.next();
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("User likes bad food!!!!");
			System.out.println("Really (y/n)");
			choice = sc.next();
		}
		
		}
				
		System.out.println("Good bye");

	}

}
