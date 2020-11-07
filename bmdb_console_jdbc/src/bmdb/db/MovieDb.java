package bmdb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

	public List<Movie> getAll() {
		List<Movie> movieList = new ArrayList<>();
		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet movies = stmt.executeQuery("Select * FROM Movie");) {
			while (movies.next()) {
				Movie movie = GetMovieFromResultSet(movies);

				movieList.add(movie);
			}
		} catch (SQLException e) {
			System.err.println("Caught Exception " + e);
			return null;
		}
		return movieList;

	}

	public Movie getMovieByTitle(String title) {
		String movieSelect = "Select * from movie where title = ?";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(movieSelect);) {
			ps.setString(1, title);
			ResultSet movies = ps.executeQuery();

			if (movies.next()) {
				Movie movie = GetMovieFromResultSet(movies);
				movies.close();
				return movie;
			} else {
				movies.close();

				return null;
			}

		} catch (SQLException e) {
			System.err.println("Caught Exception. " + e);
			return null;

		}

	}public Movie get(long id) {

		String actorSelect = "Select * from movie where ID = ?";

		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(actorSelect);) {
			ps.setLong(1, id);
			ResultSet movies = ps.executeQuery();

			if (movies.next()) {
				Movie movie = GetMovieFromResultSet(movies);
				movies.close();
				return movie;

			} else {
				movies.close();
				return null;
			}

		} catch (SQLException e) {
			System.err.println("Caught Exception. " + e);
			return null;
		}

		}
		public boolean add(Movie movie) {
			String actorInsert = "INSERT INTO movie (Title, Year, Rating, Director) VALUES (?,?,?,?)";
			try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(actorInsert)) {
				ps.setString(1, movie.getTitle());
				ps.setString(2, movie.getYear());
				ps.setString(3, movie.getRating());
				ps.setString(4, movie.getDirector());

				ps.executeUpdate();

				return true;
			} catch (SQLException e) {
				System.err.println("Caught exception. " + e);
				return false;
			}
		}

		public boolean delete(long id) {
			String movieDelete = "Delete from movie where id = ?";
			try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(movieDelete)) {

				ps.setLong(1, id);
				ps.executeUpdate();
				return true;
			} catch (SQLException e) {
				System.err.println("Caught exception. " + e);
				return false;
			}
		}

		public boolean update(Movie movie) {
			String movieUpdate = "UPDATE movie SET id title = ?, year = ?, rating = ?, Dirctor = ? WHERE ID =? ";
			try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(movieUpdate)) {
				
				ps.setString(1, movie.getTitle());
				ps.setString(2, movie.getYear());
				ps.setString(3, movie.getRating());
				ps.setString(4, movie.getDirector());
				ps.setLong(5, movie.getId());
				ps.executeUpdate();

				return true;
			} catch (SQLException e) {
				System.err.println("Caught exception. " + e);
				return false;
			}


	}
}
