package lee.business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CountriesIO {
	private static final String inputFileName = "countries.txt";
	private static final String outputFileName = "countries.txt";

	public ArrayList<String> getCountries() {
		ArrayList<String> countries = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(inputFileName))) {
			String line = in.readLine();
			while (line != null) {
				countries.add(line);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			System.err.println("Input file" + inputFileName + "not found");
		} catch (IOException e) {

			System.err.println("Caught IOException. Msg: " + e.getMessage());
		}
		return countries;

	}

	public boolean saveCountries(ArrayList<String> countries) {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputFileName)))) {
			for (String country : countries) {
				out.println(country);

			}
		} catch (IOException e) {
			System.err.println("Caught IOException. Msg: " + e.getMessage());
			return false;
		}
		return true;

	}
}
