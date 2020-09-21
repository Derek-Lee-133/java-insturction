import java.util.Scanner;

public class GuessingGameApp {
	private static int getRandomInt(int limit) {
		
		double randomDouble = Math.random()* limit;
		int randomInt = (int) randomDouble;
		randomInt++;
		return randomInt;
		}

	public static void main(String[] args) {
		final int LIMIT = 100;
		getRandomInt(LIMIT);
		System.out.println("welcome to the Guess the Number Game");
		System.out.println("************************************");
		System.out.println("I am thinking of a Number from 1 to 100");
		System.out.println("Try to guess it");
		System.out.println();
		System.out.println();
		System.out.print("Enter number:");
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();

	}

}
