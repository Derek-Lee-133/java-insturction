import java.util.Scanner;

public class doWhileApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		 do {
			 System.out.println("Say the magic word:  ");
			 word = sc.next();
		 } while (!word.equalsIgnoreCase("please"));
		 System.out.println("thank you");

	}

}
