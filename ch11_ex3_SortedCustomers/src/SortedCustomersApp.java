import java.util.Arrays;

public class SortedCustomersApp {

	public static void main(String[] args) {
		Customer[] customers = new Customer[3];
		customers[0] = new Customer("mmouse@disney.com ", "Mickey ", "mouse");
		customers[1] = new Customer("minmouse@disney.com ", "minnie ", "mouse");
		customers[2] = new Customer("dduck@disney.com ", "Donald ", "Duck");
		Arrays.sort(customers);
		
for (Customer c :customers){
	System.out.println(c.getEmail() + "" + c.getFirstName() + c.getLastName());
	
}
	}
}
