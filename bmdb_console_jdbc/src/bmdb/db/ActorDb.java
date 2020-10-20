package bmdb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bmdb.business.Actor;

public class ActorDb {
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "bmdb_user";
		String password = "sesame";

		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;

	}

	public List<Actor> getAll()  {
		List<Actor> actorList = new ArrayList<>();
		
		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet actors = stmt.executeQuery("Select * FROM Actor");) {

			

			while (actors.next()) {
				long id = actors.getLong("ID");
				String firstName = actors.getString("FirstName");
				String lastName = actors.getString("LastName");
				String gender = actors.getString("Gender");
				String birthDate = actors.getString("BirthDate");

				Actor actor = new Actor(id, firstName, lastName, gender, LocalDate.parse(birthDate));

				actorList.add(actor);

			}
		}catch (SQLException e) {
			System.err.println("Caught exception" + e);
			return null;
		}

		

		return actorList;

	}
	public Actor get(String lastName) {
	
		String actorSelect = "Select * from actor where lastName = '"+ lastName + "'";
	
		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet actors = stmt.executeQuery(actorSelect);) {
			if (actors.next()) {
				long id = actors.getLong("ID");
				String firstName = actors.getString("FirstName");
				String lName = actors.getString("LastName");
				String gender = actors.getString("Gender");
				String birthDate = actors.getString("BirthDate");

				Actor actor = new Actor(id, firstName, lName, gender, LocalDate.parse(birthDate));

				return actor;
			}else {
				return null;
			}
		}catch (SQLException e) {
			System.err.println("Caught Exception. " + e);
			return null;
			
		}
		
	}

}
