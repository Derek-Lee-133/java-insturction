package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.business.LineItem;

public class LineItemDb {
	public LineItemDb() {

	}

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "prs_user";
		String password = "sesame";

		Connection connection = DriverManager.getConnection(dbURL, username, password);

		return connection;

	}

	public List<LineItem> getAll() {
		String selectAll = "SELECT * FROM lINEITEM";
		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(selectAll)) {
			List<LineItem> lineItems = new ArrayList<>();

			while (rs.next()) {
				int id = rs.getInt("id");
				int requestId = rs.getInt("requestId");
				int productId = rs.getInt("productId");
				int quantity = rs.getInt("quantity");

				LineItem lineItem = new LineItem(id, requestId, productId, quantity);

				lineItems.add(lineItem);
			}
			return lineItems;

		} catch (SQLException e) {
			System.err.println("Error retrieving lineItems." + e);
			return null;
		}
	}
	public boolean add(LineItem lineItem ) {
		String lineItemInsert = "INSERT INTO lineItem (RequestId, ProductId, Quantity) VALUES (?,?,?,)";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(lineItemInsert)) {
			ps.setInt(1, lineItem.getRequestId());
			ps.setInt(2, lineItem.getProductId());
			ps.setInt(3, lineItem.getQuantity());
			

			ps.executeUpdate();

			return true;
		} catch (SQLException e) {
			System.err.println("Caught exception. " + e);
			return false;
		}
	}
	public boolean delete(long id) {
		String lineItemDelete = "Delete from lineItem where id = ?";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(lineItemDelete)) {

			ps.setLong(1, id);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			System.err.println("Caught exception. " + e);
			return false;
		}
	}
	public boolean update(LineItem lineItem) {
		String lineItemUpdate = "UPDATE actor SET id firstName = ?, lastName = ?, Gender = ?, BirthDate = ? WHERE ID =? ";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(lineItemUpdate)) {
			
			ps.setInt(1, lineItem.getRequestId());
			ps.setInt(2, lineItem.getProductId());
			ps.setInt(3, lineItem.getQuantity());
			
			ps.executeUpdate();

			return true;
		} catch (SQLException e) {
			System.err.println("Caught exception. " + e);
			return false;
		}

	}
}
