package bmdb.ui;

import java.time.LocalDate;
import java.util.List;

import bmdb.business.Actor;
import bmdb.db.ActorDb;

public class BmdbApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp movie Database");
		System.out.println();
		System.out.println("Commands");
		System.out.println("la - List Actors");
		System.out.println("aa - Add Actor");
		System.out.println("ua - Update Actor");
		System.out.println("da - Delete Actor");
		System.out.println("gabin - Get an actor by last name");
		System.out.println("gabi - Get an actor by ID ");
		System.out.println("exit - Exit the application");
		ActorDb actorDb = new ActorDb();

		String command = Console.getString("Enter Command:");
		while (!command.equalsIgnoreCase("exit")) {
			switch (command) {
			case "la":
				
				List<Actor> actors = actorDb.getAll();
				System.out.println("Actors: ");
				for (Actor actor : actors) {
					System.out.println("actor:" + actor);
				}
				break;
			case "aa" :
				String newFirstName = Console.getString("First name: ");
				String newLastName = Console.getString("Last name: ");
				String newGender = Console.getString("Gender: ");
				String newBirthDateStr = Console.getString("Birthdate (YYYY-MM-DD):");
				LocalDate newBirthDate = LocalDate.parse(newBirthDateStr);
				 
				Actor newActor = new Actor(0 ,newFirstName, newLastName,newGender,newBirthDate);
				
				 if (actorDb.add(newActor)) {
					 System.out.println("Actor added successfully");
					 
				 }else {
					 System.out.println("Error adding actor");
				 }break;
			case "da" :
				long newId = Console.getInt("Actor id to delete: ");
				if (actorDb.delete(newId)) {
					System.out.println("Actor deleted successfully");
				} else{
					System.out.println("Error deleting actor ");
				}break;
			case "ud" :
				long updid = Console.getInt("ID: ");
				String updFirstName = Console.getString("First name: ");
				String updLastName = Console.getString("Last name: ");
				String updGender = Console.getString("Gender: ");
				String updBirthDateStr = Console.getString("Birthdate (YYYY-MM-DD):");
				LocalDate updBirthDate = LocalDate.parse(updBirthDateStr);
				 
				Actor updActor = new Actor(updid ,updFirstName, updLastName,updGender,updBirthDate);
				
				 if (actorDb.add(updActor)) {
					 System.out.println("Actor added successfully");
					 
				 }else {
					 System.out.println("Error adding actor");
				 }break;
				
			case "gabin":
				
				String lastName = Console.getString("Actor's last name: ");
				Actor actor = actorDb.getActorByLastName(lastName);
				if (actor == null) {
					System.out.println("No Actor found");
					
				}else {
					System.out.println(actor);
					
				}break;
			case "gabi":
				
				long id = Console.getInt("Actor's ID: ");
				Actor actorById = actorDb.get(id);
				if(actorById == null) {
					System.out.println("No actor found");
				}else {
					System.out.println(actorById);
				}
				break;
			
				
				

			}

			command = Console.getString("Enter Command: ");
		}
	}

}
