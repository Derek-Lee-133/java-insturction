
public class PersonManagerApp {

	public static void main(String[] args) {
		

		

			
				System.out.println("Welcome to the person Manager");
				
				String choice = "y";
				while (choice.equalsIgnoreCase("Y"));
				String custOrEmp = Console.getString("Create cutomer or employee? (c/e  ");
				
				boolean isValid = false;
				if (custOrEmp.equalsIgnoreCase("C") || custOrEmp.equalsIgnoreCase("E")) {
					isValid = true;
					
				}
				if (!isValid) {
					System.out.println("Error! this entry is required. try again.");
					continue;
				}
				String firstName = Console.getString("first name: ");
				String lastName = Console.getString("last name: ");
				
				if (custOrEmp.equalsIgnoreCase("C")) {
					String custNum = Console.getString("Customer numbler: ");
					Customer customer = new Customer (firstName, lastName, custNum);
					System.out.println("You entered a new Customer");
					System.out.println(customer);
				} else {
					String ssn = Console.getString("SSN:  ");
					Employee employee = new Employee (firstName, lastName, ssn);
					System.out.println("you entered a new Employee");
				}
						

			}


	

}
