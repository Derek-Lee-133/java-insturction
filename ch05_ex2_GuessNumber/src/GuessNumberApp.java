import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessNumberApp {

	private static void displayWelcome(int limit) {
		System.out.println("Guess the number!");
		System.out.println("I'm thinking of a number from 1 to " + limit);
		System.out.println();
	}

	public static int getRandomInt(int limit) {
		double d = Math.random() * limit; // d is >= 0.0 and < limit
		int randomInt = (int) d; // convert double to int
		randomInt++; // int is >= 1 and <= limit
		return randomInt;
	}

	public static void main(String[] args) {
		final int LIMIT = 10;

		displayWelcome(LIMIT);
		int number = getRandomInt(LIMIT);

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int guess;

		while (true) {
			guess = getInt(sc, "Your guess: ");

			try {
				guess = sc.nextInt();

			} catch (InputMismatchException e) {

				System.out.println("Error! Invalid Numver. Try again ");
				sc.nextLine();
				continue;
			}
			if (guess < 1 || guess > LIMIT) {
				System.out.println("Invalid guess. Try again.");
				continue;
			}

			if (guess < number) {
				System.out.println("Too low.");
			} else if (guess > number) {
				System.out.println("Too high.");
			} else {
				System.out.println("You guessed it in " + count + " tries.\n");
				break;
			}
			count++;
		}
		System.out.println("Bye!");
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}
}