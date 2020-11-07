package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import prs.business.Request;

public class RequestDb {

	public RequestDb() {

	}

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "prs_user";
		String password = "sesame";

		Connection connection = DriverManager.getConnection(dbURL, username, password);

		return connection;

	}

	public List<Request> getAll() {
		String selectAll = "SELECT * FROM REQUEST";
		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(selectAll)) {
			List<Request> requests = new ArrayList<>();

			while (rs.next()) {
				int id = rs.getInt("id");
				int userId = rs.getInt("userId");
				int description = rs.getInt("description");
				String justification = rs.getString("justification");
				String dateNeeded = rs.getString("dateNeeded");
				String deliveryMode = rs.getString("deliveryMode");
				String status = rs.getString("status");
				double price = rs.getDouble("price");
				String submittedDate = rs.getString("submittedDate");
				String reasonForRejection = rs.getString("reasonForRejection");

				Request request = new Request(id, userId, description, justification, LocalDate.parse(dateNeeded),
						deliveryMode, status, price, LocalDateTime.parse(submittedDate), reasonForRejection);

				requests.add(request);
			}

			return requests;

		} catch (SQLException e) {
			System.err.println("Error retrieving request." + e);
			return null;
		}
	}
}
