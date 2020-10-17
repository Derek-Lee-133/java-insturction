package lee.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import lee.business.Prospect;

import java.nio.file.*;



public class FileCleanerApp {

	public static void  main(String[] args) {

// welcome message
		System.out.println("File Cleaner");
		
		
		// read file
		Path prospectsPath = Paths.get("prospects.csv");
		if (Files.exists(prospectsPath)) {
			File prospectsFile = prospectsPath.toFile();
			try (BufferedReader in = new BufferedReader(new FileReader(prospectsFile))) {
				String line = in.readLine();
				while(line!= null) {
					//System.out.println(line);
					line = in.readLine();

					
					
					String[] fields = line.split(",");
					String firstName = fields[0];
					String lastName = fields[1];
					String email = fields [2];
					
					for (String field : fields) {
						System.out.print(field);
						// System.out.println(firstName);
					}
					
					
					in.close();
					
				}
			}catch (IOException e) {
				System.out.println(e);
			}
		}else {
			System.out.println(prospectsPath.toAbsolutePath() + "doesn't exist");
		}
	
		
		
		// Format data
//		try {
//			BufferedReader inputStream = new BufferedReader(new FileReader("prospects.csv"));
//		} catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		}
//		File UIFile = new File ("prospects_clean.csv");
//		 if (!UIFile.exists()) {
//	            try {
//					UIFile.createNewFile();
//				} catch (IOException e) {
//
//					e.printStackTrace();
//				}
//	        }
		

		// create file prospects_clean.csv
		
		// return formatted data
		
		// write new file
		
		// return old file name and formatted file name
		System.out.println("Source file: ");

		System.out.println("Cleaned file: ");
		System.out.println("Congratulations! Your file has been cleaned!");
		
		// goodbye message

	}

}
