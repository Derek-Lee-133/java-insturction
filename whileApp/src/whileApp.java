import java.util.Scanner;

public class whileApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.println("Enter subtotal:  ");
		double subtotal = sc.nextDouble();
		System.out.println("You entered: " + subtotal);
		System.out.println("Continue (y/n):  ");
		choice = sc.next();
		System.out.println();
		}

	}

}
