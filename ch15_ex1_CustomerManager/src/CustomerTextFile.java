import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class CustomerTextFile implements DAO<Customer> {

	private List<Customer> customers = null;
	private Path customersPath = null;
	private File customersFile = null;

	private final String FIELD_SEP = "\t";

	public CustomerTextFile() throws IOException {
		// initialize the class variables
		customersPath = Paths.get("customers.txt");
		customersFile = customersPath.toFile();
		customers = this.getAll();
	}
	

	@Override
	public List<Customer> getAll() throws IOException {
		// if the customers file has already been read, don't read it again
		if (customers != null) {
			return customers;
		}

		customers = new ArrayList<>();
		
			try (BufferedReader in = new BufferedReader(new FileReader(customersFile))) {
				String line = in.readLine();
				while (line != null) {
					String [] fields = line.split(FIELD_SEP);
					String firstName = fields[0]; 
					String lastName = fields [1];
					String email = fields[2];
					
					Customer c = new Customer (firstName, lastName, email);
					customers.add(c);
					
					line = in.readLine();
					
				}
			}


		return customers;
	}

	@Override
	public Customer get(String email) throws IOException {
		for (Customer c : customers) {
			if (c.getEmail().equals(email)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public boolean add(Customer c) throws IOException {
		customers.add(c);
		return this.saveAll();
	}

	@Override
	public boolean delete(Customer c) throws IOException {
		customers.remove(c);
		return this.saveAll();
	}

	@Override
	public boolean update(Customer newCustomer) throws IOException {
		// get the old customer and remove it
		Customer oldCustomer = this.get(newCustomer.getEmail());
		int i = customers.indexOf(oldCustomer);
		customers.remove(i);

		// add the updated customer
		customers.add(i, newCustomer);

		return this.saveAll();
	}

	private boolean saveAll() {
		// save the Customer objects in the array list to the file
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(customersFile)))) {
			for (Customer c : customers) {
				out.print(c.getFirstName() + FIELD_SEP);
				out.print(c.getLastName() + FIELD_SEP);
				out.print(c.getEmail());
			}return true;
		
		}catch (IOException e) {
			System.out.println(e);
			return false;
		}

		
	}
}