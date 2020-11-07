package prs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import prs.business.Vendor;

public class VendorDb {
	public VendorDb() {

	}

	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false&allowPublicKeyRetrieval=true";
		String username = "prs_user";
		String password = "sesame";

		Connection connection = DriverManager.getConnection(dbURL, username, password);

		return connection;

	}

	public List<Vendor> getAll() {
		String selectAll = "SELECT * FROM VENDOR";
		try (Connection con = getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(selectAll)) {
			List<Vendor> vendors = new ArrayList<>();
			while (rs.next()) {
				int id = rs.getInt("id");
				String code = rs.getString("code");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String city = rs.getString("city");
				String state = rs.getString("state");
				int zip = rs.getInt("zip");
				String phoneNumber = rs.getString("phoneNumber");
				String email = rs.getString("email");

				Vendor vendor = new Vendor(id, code, name, address, city, state, zip, phoneNumber, email);

				vendors.add(vendor);
			}
			return vendors;

		} catch (SQLException e) {
			System.err.println("Error retrieving vendors." + e);
			return null;
		}

	}

	public boolean add(Vendor vendor) {
		String vendorInsert = "INSERT INTO Vendor (code, name, address, city, state, zip, phoneNumber,email) VALUES (?,?,?,?,?,?,?,?)";
		try (Connection con = getConnection(); PreparedStatement ps = con.prepareStatement(vendorInsert)) {
			ps.setString(1, vendor.getCode());
			ps.setString(2, vendor.getName());
			ps.setString(3, vendor.getAddress());
			ps.setString(4, vendor.getCity());
			ps.setString(5, vendor.getState());
			ps.setInt(6, vendor.getZip());
			ps.setString(7, vendor.getPhoneNumber());
			ps.setString(8, vendor.getEmail());

			ps.executeUpdate();

			return true;

		} catch (SQLException e) {
			System.err.println("Caught exception. " + e);
			return false;
		}
	}

}
