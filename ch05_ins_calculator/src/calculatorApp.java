import java.util.Scanner;

public class calculatorApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter first Operand:  ");
			int operand1 = sc.nextInt();
			System.out.println("Enter second Operand:");
			int operand2 = sc.nextInt();
			System.out.println("Enter Operation (+ - * /): ");
			String operation = sc.next();

			int answer = 0;
			switch (operation) {
			case "+":
				answer = sum(operand1, operand2);
				break;
			case "-":
				answer = difference (operand1, operand2);
				break;
			case "*":
				answer = product (operand1, operand2);
				break;
			case "/":
				answer = dividend (operand1, operand2);
				break;
			default:

				System.out.println("UnknownOperator");
			}

			System.out.println("the answer is  " + answer);
			System.out.println("Continue (y/n)  ");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("y"));
	}

	private static int sum(int op1, int op2) {
		System.out.println("in sum method");

		int result = op1 + op2;

		return result;
	}
	private static int difference(int op1, int op2)
	{ System.out.println("in difference method");
		int result = op1 - op2;
		return result;
	}
	private static int product(int op1, int op2)
	{ System.out.println("in product method");
	int result = op1 * op2;
	return result;
	}
	private static int dividend(int op1, int op2)
	{System.out.println("in the dividend");
	int result = op1 / op2;
	return result;
	}
}
