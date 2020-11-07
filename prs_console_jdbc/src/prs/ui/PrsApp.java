package prs.ui;

import java.util.List;

import prs.business.LineItem;
import prs.business.Product;
import prs.business.User;
import prs.business.Vendor;
import prs.db.LineItemDb;
import prs.db.ProductDb;
import prs.db.UserDb;
import prs.db.VendorDb;
import prs.exception.PrsDataException;

public class PrsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS App");
		System.out.println();

		System.out.println("COMMANDS");
		System.out.println("login - Login");
		System.out.println("prod_la - List all products");
		System.out.println("vendor_la - List all vendors");
		System.out.println("vendor_ad - add vendor");
		System.out.println("user_la - List all users");
		System.out.println("user_ad - Add user");
		System.out.println("exit - Exit the application");

		User authenticatedUser = null;

		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			command = Console.getString("Enter Command: ");

			if (command.equalsIgnoreCase("login")) {
				authenticatedUser = logIn();
				if (authenticatedUser == null) {
					System.out.println("User name/password not found!");
				} else {
					System.out.println("Welcome " + authenticatedUser.getFirstName());
				}
			} else if (command.equalsIgnoreCase("logout")) {
				authenticatedUser = null;
			} else if (authenticatedUser != null) {

				switch (command.toLowerCase()) {

				case "user_la":
					listUsers();
					break;
				case "user_au":
					addUser();
					break;
				case "prod_la":
					listProducts();
					break;
				case "prod_ap":
					addProduct();
					break;
				case "vendor_la":
					listVendors();
					break;
				case "vendor_av":
					addVendor();
					break;
				case "lineItem_la":
					listLineItems();
					break;

				case "exit":
					// nothing to do
					break;

				default:
					System.out.println("Invalid command");
					break;
				}
			} else {
				System.out.println("Must login to preform Commands");
			}
		}

	}

	public static User logIn() {
		try {
			String userName = Console.getString("User Name: ");
			String passWord = Console.getString("Password: ");
			UserDb userDb = new UserDb();
			User user = userDb.authenticateUser(userName, passWord);
			return user;

		} catch (PrsDataException e) {
			System.err.println("Error logging in. Msg: " + e.getMessage());
			return null;
		}
	}

	private static void addVendor() {
		VendorDb vendorDb = new VendorDb();

		String newCode = Console.getString("Code: ");
		String newName = Console.getString("Name: ");
		String newAddress = Console.getString("Address: ");
		String newCity = Console.getString("City");
		String newState = Console.getString("State: ");
		int newZip = Console.getInt("Zip: ");
		String newPhoneNumber = Console.getString("Phone number: ");
		String newEmail = Console.getString("email: ");

		Vendor newVendor = new Vendor(0, newCode, newName, newAddress, newCity, newState, newZip, newPhoneNumber,
				newEmail);

		if (vendorDb.add(newVendor)) {
			System.out.println("Vendor added successfully");

		} else {
			System.out.println("Error adding vendor");
		}

	}

	private static void listProducts() {
		try {
			ProductDb productDb = new ProductDb();
			List<Product> products = productDb.getAll();

			for (Product product : products) {
				System.out.println(product);
			}
			System.out.println();
		} catch (PrsDataException e) {
			System.err.println("Couldn't retrieve Products. Msg: " + e.getMessage());
		}
	}

	private static void listVendors() {
		VendorDb vendorDb = new VendorDb();
		List<Vendor> vendors = vendorDb.getAll();

		for (Vendor vendor : vendors) {
			System.out.println(vendor);
		}
	}

	private static void listLineItems() {
		LineItemDb lineItemDb = new LineItemDb();
		List<LineItem> lineItems = lineItemDb.getAll();

		for (LineItem lineItem : lineItems) {
			System.out.println(lineItem);

		}
	}

	private static void listUsers() {
		UserDb userDb = new UserDb();
		List<User> users = userDb.getAll();

		for (User user : users) {
			System.out.println(user);
		}
	}

	private static void addProduct() {
		ProductDb productDb = new ProductDb();

		int newVendorID = Console.getInt("Vendor ID: ");
		String newPartNumber = Console.getString("Part Number: ");
		String newName = Console.getString("Name: ");
		double newPrice = Console.getDouble("Price: ");
		String newUnit = Console.getString("Unit: ");
		String newPhotoPath = Console.getString("Photo path: ");

		Product newProduct = new Product(0, newVendorID, newPartNumber, newName, newPrice, newUnit, newPhotoPath);
		if (productDb.add(newProduct)) {
			System.out.println("Product added successfully");

		} else {
			System.out.println("Error adding Product");
		}

	}

	private static void addUser() {
		UserDb userDb = new UserDb();

		String newUserName = Console.getString("User name: ");
		String newPassWord = Console.getString("Password: ");
		String newFirstName = Console.getString("First name: ");
		String newLastName = Console.getString("Last name: ");
		String newPhoneNumber = Console.getString("Phone number: ");
		String newEmail = Console.getString("Email: ");
		
		User newUser = new User(0, newUserName, newPassWord, newFirstName, newLastName, newPhoneNumber, newEmail,
				false, false);
		if (userDb.add(newUser)) {
			System.out.println("New user added");

		} else {
			System.out.println("Error adding new User! ");
		}
	}
}
