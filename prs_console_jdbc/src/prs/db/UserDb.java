package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.business.User;
import prs.exception.PrsDataException;

public class UserDb {

	public UserDb() {

	}

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "prs_user";
		String password = "sesame";

		Connection connection = DriverManager.getConnection(dbURL, username, password);

		return connection;

	}

	public List<User> getAll() {
		String selectAll = "SELECT * FROM USER";
		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(selectAll)) {
			List<User> users = new ArrayList<>();

			while (rs.next()) {
				int id = rs.getInt("id");
				String userName = rs.getString("userName");
				String passWord = rs.getString("passWord");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String phoneNumber = rs.getString("phoneNumber");
				String email = rs.getString("email");
				boolean isReveiwer = rs.getBoolean("isReveiwer");
				boolean isAdmin = rs.getBoolean("isAdmin");

				User user = new User(id, userName, passWord, firstName, lastName, phoneNumber, email, isReveiwer,
						isAdmin);

				users.add(user);
			}
			return users;

		} catch (SQLException e) {
			System.err.println("Error retrieving users." + e);
			return null;
		}
	}

	public User authenticateUser(String userName, String passWord) {
		String selectByUserAndPass = "Select * from user Where userName =? and passWord = ?";

		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(selectByUserAndPass);) {
			ps.setString(1, userName);
			ps.setString(2, passWord);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int id = rs.getInt("id");
				String userNameFromDb = rs.getString("userName");
				String passWordFromDb = rs.getString("passWord");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				String phoneNumber = rs.getString("phoneNumber");
				String email = rs.getString("email");
				boolean isReveiwer = rs.getBoolean("isReveiwer");
				boolean isAdmin = rs.getBoolean("isAdmin");

				User user = new User(id, userNameFromDb, passWordFromDb, firstName, lastName, phoneNumber, email,
						isReveiwer, isAdmin);

				return user;
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.err.println("Error retrieving users." + e);
			return null;
		}
	}

	public boolean add(User user) {
		String userInsert = "INSERT INTO User (UserName, UserPassWord, UserFirstName, UserLastName, PhoneNumber, Email,false,false) VALUES (?,?,?,?,?,?,?,?)";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(userInsert)) {
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassWord());
			ps.setString(3, user.getFirstName());
			ps.setString(4, user.getLastName());
			ps.setString(5, user.getPhonenumber());
			ps.setString(6, user.getEmail());
			ps.setString(7,"false");
			ps.setString(8, "false");
			
			
		} catch (SQLException e) {
			throw new PrsDataException("Error retrieving Users. Msg: " + e.getMessage());
		}
		return false;
	}
}
