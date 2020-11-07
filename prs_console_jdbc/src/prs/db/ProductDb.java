package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.business.Product;
import prs.exception.PrsDataException;

public class ProductDb {

	public ProductDb() {

	}

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "prs_user";
		String password = "sesame";

		Connection connection = DriverManager.getConnection(dbURL, username, password);

		return connection;

	}

	public List<Product> getAll() {
		String selectAll = "SELECT * FROM Product";
		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(selectAll)) {
			List<Product> products = new ArrayList<>();

			while (rs.next()) {
				int id = rs.getInt("ID");
				int vendorId = rs.getInt("VendorId");
				String partNumber = rs.getString("PartNumber");
				String name = rs.getString("Name");
				double price = rs.getDouble("Price");
				String unit = rs.getString("unit");
				String photoPath = rs.getString("PhotoPath");

				Product product = new Product(id, vendorId, partNumber, name, price, unit, photoPath);

				products.add(product);
			}
			return products;

		} catch (SQLException e) {
			throw new PrsDataException("Error retrieving products. Msg: " + e.getMessage());
		}

	}

	public boolean add(Product product) {
		String productInsert = "INSERT INTO Product (VendorID, PartNumber, Name, Price, Unit, PhotoPath) VALUES (?,?,?,?,?,?)";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(productInsert)) {
			ps.setInt(1, product.getVendorId());
			ps.setString(2,product.getPartNumber());
			ps.setString(3,product.getName());
			ps.setDouble(4, product.getPrice());
			ps.setString(5, product.getUnit());
			ps.setString(6, product.getPhotoPath());
		} catch (SQLException e) {
			throw new PrsDataException("Error retrieving products. Msg: " + e.getMessage());
		}return false;
	}
}
