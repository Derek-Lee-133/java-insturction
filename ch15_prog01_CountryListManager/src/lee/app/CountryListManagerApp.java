package lee.app;

import java.util.ArrayList;

import lee.business.Console;
import lee.business.CountriesIO;

public class CountryListManagerApp {

	public static void main(String[] args) {

		CountriesIO countriesIO = new CountriesIO();

		System.out.println("Country List Manager");
		System.out.println();
		System.out.println("COMMAND MENU");
		System.out.println("1 - List countries");
		System.out.println("2 - Add country");
		System.out.println("3 - Exit");

		int command = 0;
		while (command != 3) {
			command = Console.getInt("Enter menu number: ");

			if (command == 1) {
				ArrayList<String> countries = countriesIO.getCountries();
				for (String country : countries) {
					System.out.println(country);
				}
			} else if (command == 2) {
				String newCountry = Console.getString("Enter country: ");
				ArrayList<String> countries = countriesIO.getCountries();
				countries.add(newCountry);
				if (countriesIO.saveCountries(countries)) {
					System.out.println("This country has been saved.");
				}
			}
		}

	}

}

//		// welcome message
//		System.out.println("Country List Manager");
//		
//		// command menu
//		System.out.println("COMMAND MENU\r\n" + 
//				"1 - List countries\r\n" + 
//				"2 - Add a country\r\n" + 
//				"3 - Exit");
//		String command = "go";
//		// while loop
//		while (!command.equals("exit")) {
//			command = Console.getString("Command:  ");
//			System.out.println( command );
//			if (command.equals("List")) {
//				 for (String item : Countries) {
//					System.out.println(items.indexOf(item) + 1 +"." + item);
//				}
//
//			}
//			System.out.println();
//			if (command.equals("grab")) {
//				if (items.size() >= 4) {
//					System.out.println("You can't carry any more items. Drop something first.");
//
//				} else {
//					String itemToAdd = Console.getString("Name:  ");
//					items.add(itemToAdd);
//					Console.displayLine(itemToAdd + " was added ");
//				}
//
//			}
//
//
//			if (command.equals("edit")) {
//				int number = Console.getInt("Number:  ") -1;
//				items.indexOf(number);
//		String	element = Console.getString("Updated name: ");
//				items.set(number,element);
//				  Console.displayLine("item number " + (number + 1) + " was updated");
//
//			}
//			
//			if (command.equals("drop")) {
//				int number = Console.getInt("Number:  ") -1;
//				// items.remove(number);
//				String itemToRemove = items.remove(number);
//				 Console.displayLine(itemToRemove +" was dropped");
//			}
//			if (command.equals("exit")) {
//				Console.displayLine("Bye! Success on your adventure");
//
//			}
//		}
//		
//
//	}
//
//}
