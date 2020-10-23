package bmdb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import bmdb.business.Movie;

public class MovieDb {
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "bmdb_user";
		String password = "sesame";

		Connection connection = DriverManager.getConnection(dbURL, username, password);
		return connection;

	}
	private Movie GetMovieFromResultSet(ResultSet rs) throws SQLException {
		long id = rs.getLong("ID");
		String title = rs.getString("Title");
		String year = rs.getString("Year");
		String rating = rs.getString("Rating");
		String director = rs.getString("Director");
		
		Movie movie = new Movie(id, title, year, rating, director); 
				return movie;
		}
	}

