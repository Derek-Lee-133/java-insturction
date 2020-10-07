
public class HTMLConverterApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("HTML Converter");

		// display html text block
		System.out.println();
		System.out.println("INPUT");
		Console.displayLine("<h1>Grocery List</h1>\r\n" + "<ul>\r\n" + " <li>Eggs</li>\r\n" + " <li>Milk</li>\r\n"
				+ " <li>Butter</li>\r\n" + "</ul>");

		// String conversions
		String html = "<h1>Grocery List</h1>\r\n" + "<ul>\r\n" + " <li>Eggs</li>\r\n" + " <li>Milk</li>\r\n"
				+ " <li>Butter</li>\r\n" + "</ul>";
		System.out.println();
		int index1 = html.indexOf("G");
		// System.out.println(index1);
		int eggs = html.indexOf("E");
		// System.out.println(index2);
		int index2 = html.indexOf("M");
		int butter = html.indexOf("B");
		// System.out.println(eggs);
		// System.out.println("G" , index1 + 1);
		String ssGl = html.substring(index1, 16);
		String ssG2 = html.substring(eggs, 38);
		String ssG3 = html.substring(index2, 54);
		String ssG4 = html.substring(butter, 72);
		System.out.println("OUTPUT");

		Console.displayLine("* " + ssGl + "\n" + "* " + ssG2 + "\n" + "* " + ssG3 + "\n" + "* " + ssG4);

	}

}
