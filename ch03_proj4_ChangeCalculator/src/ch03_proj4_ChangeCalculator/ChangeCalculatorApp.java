package ch03_proj4_ChangeCalculator;

import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		final int CENTS_PER_QUARTER = 25;
		final int CENTS_PER_DIME = 10;
		final int CENTS_PER_NICKEL = 5;
		System.out.println("Welcome to the change calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter number of cents (0-99):  ");
			int cents = sc.nextInt();
			
			int numQuarters = cents / CENTS_PER_QUARTER;
			cents %= CENTS_PER_QUARTER;
			
			int numDimes = cents / CENTS_PER_DIME;
			cents %= CENTS_PER_DIME;
			
			int numNickels = cents / CENTS_PER_NICKEL;
			cents %= CENTS_PER_NICKEL;
			
			int numPennies = cents;
			
			System.out.println("Quarters:  "+ numQuarters);
			System.out.println("Dimes:  "+ numDimes);
			System.out.println("Nickels:  "+ numNickels);
			System.out.println("Pennies: "+ numPennies);
			System.out.println();
			
			
		
			
			
		
		
		}
	}

}
