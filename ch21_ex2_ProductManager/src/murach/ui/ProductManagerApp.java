package murach.ui;

import java.util.List;

import murach.business.Product;
import murach.db.ProductDB;

public class ProductManagerApp {

    private static ProductDB productDB = new ProductDB();
    
    public static void main(String args[]) {
        System.out.println("Welcome to the Product Manager\n");
        displayMenu();

        // perform 1 or more actions
        String action = "";
        while (!action.equalsIgnoreCase("exit")) {
            // get the input from the user
            action = Console.getString("Enter a command: ");
            System.out.println();

            if (action.equalsIgnoreCase("list")) {
                displayAllProducts();
            } else if (action.equalsIgnoreCase("add")) {
                addProduct();
            } else if (action.equalsIgnoreCase("del") || 
                       action.equalsIgnoreCase("delete")) {
                deleteProduct();
            } else if (action.equalsIgnoreCase("help") || 
                       action.equalsIgnoreCase("menu")) {
                displayMenu();
            } else if (action.equalsIgnoreCase("exit")) {
                exit();
            } else {
                System.out.println("Error! Not a valid command.\n");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("COMMAND MENU");
        System.out.println("list    - List all products");
        System.out.println("add     - Add a product");
        System.out.println("del     - Delete a product");
        System.out.println("help    - Show this menu");
        System.out.println("exit    - Exit this application\n");
    }

    public static void displayAllProducts() {
        System.out.println("PRODUCT LIST");

        List<Product> products = productDB.getAll();
        if (products == null) {
            System.out.println("Error! Unable to get products.\n");
        } else {
            Product p;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < products.size(); i++) {
                p = products.get(i);
                sb.append(StringUtils.padWithSpaces(
                        p.getCode(), 8));
                sb.append(StringUtils.padWithSpaces(
                        p.getDescription(), 44));
                sb.append(p.getPriceFormatted());
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }
    }

    public static void addProduct() {
        String code = Console.getString("Enter product code: ");
        String description = Console.getLine("Enter product description: ");
        double price = Console.getDouble("Enter price: ");

        Product product = new Product();
        product.setCode(code);
        product.setDescription(description);
        product.setPrice(price);

        boolean success = productDB.add(product);
        if (success) {
            System.out.println(description
                    + " has been added to the database.\n");
        } else {
            System.out.println("Error! Unable to add product\n");
        }
    }

    public static void deleteProduct() {
        String code = Console.getString("Enter product code to delete: ");

        Product product = productDB.get(code);
        if (product != null) {
            boolean success = productDB.delete(product);
            if (success) {
                System.out.println(product.getDescription()
                        + " has been deleted from the database.\n");
            } else {
                System.out.println("Error! Unable to add product\n");
            }
        } else {
            System.out.println("No product matches that code.\n");
        }
    }
    
    public static void exit() {
        productDB.closeConnection();
        System.out.println("Bye.\n");        
    }
}