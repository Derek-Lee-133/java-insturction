package bmdb.ui;

import java.util.List;

import bmdb.business.Actor;
import bmdb.db.ActorDb;

public class BmdbApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp movie Database");
		System.out.println();
		System.out.println("Commands");
		System.out.println("la - List Actors");
		System.out.println("gabin - Get an actor by last name");
		System.out.println("exit - Exit the application");

		String command = Console.getString("Enter Command:");
		while (!command.equalsIgnoreCase("exit")) {
			switch (command) {
			case "la":
				ActorDb actorDb = new ActorDb();
				List<Actor> actors = actorDb.getAll();
				System.out.println("Actors: ");
				for (Actor actor : actors) {
					System.out.println("actor:" + actor);
				}
				break;
			case "gabin":
				ActorDb actorDbgabin = new ActorDb();
				String lastName = Console.getString("Actor's last name: ");
				Actor actor = actorDbgabin.get(lastName);
				if (actor == null) {
					System.out.println("No Actor found");
					
				}else {
					System.out.println(actor);
					
				}break;

			}

			command = Console.getString("Enter Command: ");
		}
	}

}
