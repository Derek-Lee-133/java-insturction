
public class ContactListApp {
	public static void main(String args[]) {
		// Welcome message
		System.out.println("Welcome to the Contact List application");
		System.out.println();
		
		
		// while loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String firstname = Console.getString("Enter First Name: ");
			String lastname = Console.getString("Enter Last Name: ");
			String email = Console.getString("Enter email: ");
			String phone = Console.getString("Enter phone: ");
			
			System.out.println("-----------------------------------------");
			System.out.println("----Current Contact----------------------");
			System.out.println("name: " + firstname +" "+ lastname);
			System.out.println("Email Address: " + email);
			System.out.println("Phone Number: " + phone);
			System.out.println("-----------------------------------------");
			// see if user wants to continue
			choice = Console.getString("Continue? (y/n): ");
			System.out.println();
			
		}
		
		System.out.println("bye!");
		// get contact object
		
		// create contact
		// Contact contact = new Contact(firstname, lastname,email,phone);
	}

}
