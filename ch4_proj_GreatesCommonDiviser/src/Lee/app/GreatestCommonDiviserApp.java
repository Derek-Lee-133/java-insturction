package Lee.app;

public class GreatestCommonDiviserApp {
	public static int calculateGreatestCommonDivisor(int x, int y) {
		while (x != 0) {
			while (y >= x) {
				y = y - x;

			}
			int tmp = x;
			x = y;
			y = tmp;

		}
		return y;

	}

	public static void main(String[] args) {
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int firstNumber = Console.getInt("Enter first number: ");
			int SecondNumber = Console.getInt("Enter second number: ");
			
			int gGD = calculateGreatestCommonDivisor(firstNumber, SecondNumber);
			System.out.println("Gratest common divisor  " + gGD);
			System.out.println();
		}		
			choice = Console.getString("Continue? y/n ");
			
			
		

	}

}
