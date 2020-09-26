
public class ContactListApp {
		private static void printWelcomeMessage() {
			System.out.println("Welcome to the Contact List Application");
			System.out.println();
		}
		private static void printFarewellMessage() {
			System.out.println("Bye!");
		}
	public static void main(String args[]) {
		// Welcome message
		printWelcomeMessage();
		
		
		// while loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String firstname = Console.getString("Enter First Name: ");
			String lastname = Console.getString("Enter Last Name:   ");
			String email = Console.getString("Enter email:        ");
			String phone = Console.getString("Enter phone:        ");
			// Contact contact = new Contact(firstname,lastname,email,phone);
			// contact.setFirstName(firstname);
			// contact.setLastName(lastname);
			// contact.setEmail(email);
			// contact.setPhone(phone);
			Contact contact = new Contact(firstname,lastname,email,phone);
			System.out.println();
			System.out.println(contact.displayContact());
			System.out.println();
		
			// see if user wants to continue
			choice = Console.getString("Continue? (y/n): ");
			System.out.println();
			
		}
		
		printFarewellMessage();
		
	}
}


