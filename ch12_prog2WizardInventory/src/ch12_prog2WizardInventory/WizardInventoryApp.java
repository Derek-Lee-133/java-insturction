package ch12_prog2WizardInventory;

import java.util.ArrayList;

public class WizardInventoryApp {

	public static void main(String[] args) {
		// welcome message

		// Arraylist
		ArrayList<String> items = new ArrayList<String>();
		items.add("wooden staff");
		items.add("wizard hat");
		items.add("cloth shoes");

		// command menu
		Console.displayLine("COMMAND MENU\r\n" + 
				"show - Show all items\r\n" + 
				"grab - Grab an item\r\n" + 
				"edit - Edit an item\r\n" + 
				"drop - Drop an item\r\n" + 
				"exit - Exit program");
		System.out.println();

		String command = "go";
		// while loop
		while (!command.equals("exit")) {
			command = Console.getString("Command:  ");
			System.out.println("-" + command + "-");
			if (command.equals("show")) {
				for (String item : items) {
					Console.displayLine(item);
				}

			}
			System.out.println();
			if (command.equals("grab")) {
				if (items.size() >= 4) {
					System.out.println("You can't carry any more items. Drop something first.");

				} else {
					String itemToAdd = Console.getString("Name:  ");
					items.add(itemToAdd);
					Console.displayLine(itemToAdd + " added ");
				}

			}


			if (command.equals("edit")) {
				int number = Console.getInt("Number:  ") -1;
				items.indexOf(number);
		String	element = Console.getString("Updated name: ");
				items.set(number,element);
				  Console.displayLine("item number " + (number + 1) + " was updated");

			}
			
			if (command.equals("drop")) {
				int number = Console.getInt("Number:  ") -1;
				// items.remove(number);
				String itemToRemove = items.remove(number);
				 Console.displayLine(itemToRemove +" was dropped");
			}
			if (command.equals("exit")) {
				Console.displayLine("Bye! Success on your adventure");

			}
		}

		

	}

}
