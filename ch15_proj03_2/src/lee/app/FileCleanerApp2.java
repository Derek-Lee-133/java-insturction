package lee.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import lee.business.Prospect;

public class FileCleanerApp2 {
	private static final String inputFileName = "prospects.csv";
	private static final String outputFileName = "prospects_clean.csv";

	public static void main(String[] args) {
		System.out.println("File Cleaner");
		System.out.println();

		// read input file into a list of strings
		List<String> lines = new ArrayList<>();

		try (BufferedReader in = new BufferedReader(new FileReader(inputFileName))) {
			String line = in.readLine();
			while (line != null) {
				lines.add(line);
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			System.err.println("Input file" + inputFileName + "not found");
		} catch (IOException e) {

			System.err.println("Caught IOException. Msg: " + e.getMessage());
		}

		// cleanse and convert strings to Prospects
		List<Prospect> prospects = new ArrayList<>();
		for (String line : lines) {

			Prospect prospect = createProspect(line);
			prospects.add(prospect);
		}

		// write the EmailRecipients to the output file
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputFileName)))) {
			for (Prospect p : prospects) {
				out.print(p.getFirstName());
				out.print(",");
				out.print(p.getLastName());
				out.print(",");
				out.println(p.getEmail());

			}
		} catch (IOException e) {
			System.err.println("Caught IOException. Msg: " + e.getMessage());
		}
		System.out.println("Source file: " + inputFileName);
		System.out.println("Cleaned file: " + outputFileName);

	}

	public static Prospect createProspect(String csvStr) {
		String[] nameParts = csvStr.split(",");

		String emailAddress = nameParts[2].toLowerCase();
		String firstName = convertToTitleCase(nameParts[0]);
		String lastName = convertToTitleCase(nameParts[1]);

		Prospect prospect = new Prospect(firstName, lastName, emailAddress);

		return prospect;

	}

	public static String convertToTitleCase(String inputStr) {
		String firstNameTrimmed = inputStr.trim();
		String nameFirstLetter = firstNameTrimmed.substring(0, 1);
		nameFirstLetter = nameFirstLetter.toUpperCase();

		String nameAfterFirstLetter = firstNameTrimmed.substring(1);
		nameAfterFirstLetter = nameAfterFirstLetter.toLowerCase();

		String titleCaseName = nameFirstLetter + nameAfterFirstLetter;

		return titleCaseName;
	}

}
