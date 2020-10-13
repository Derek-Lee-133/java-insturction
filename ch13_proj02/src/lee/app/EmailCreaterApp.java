package lee.app;

public static emailRecipient createEmailRecipient(String csvStr) {
	String[]nameParts = csvStr.split(",");
	
	String emailAddress = nameParts[2].toLowerCase();
	String firstName = convertToTitleCase(numberParts[0]);
	String lastName = convertToTitleCase(numberParts[1]);
	emailRecipient emailRecipient = new emailRecipient(emailAddress, firstName, lastName);
	
	return emailrecipient;
}

public class EmailCreaterApp {
	public static String convertToTitleCase (String inputStr) {
		String firstNameTrimmed = inputStr .trim();
		String nameFirstLetter = firstNameTrimmed.substring(0, 1);
		nameFirstLetter = nameFirstLetter.toUpperCase();
		String nameAfterFirstLetter = inputStr.substring(1);
		nameAfterFirstLetter = nameAfterFirstLetter.toLowerCase();
		String titleCaseName = nameFirstLetter + nameAfterFirstLetter;
		return titleCaseName;
		
	}

	public static void main(String[] args) {
		String[] csv = { " james ,butler,jbutler@gmail.com", "Josephine,Darakjy,Josephine_Darakjy@darakjy.org",
				"ART,VENERE,ART@VENERE.ORG" };
		String template = "To: {email}\n" + "From: noreply@deals.com\n" + "Subject: Deals!\n\n" + "Hi {first_name},\n\n"
				+ "We've got some great deals for you. Check our website!";
		System.out.println("Email Creator");
		System.out.println();

		for (String curEntry : csv) {
			String[] nameParts = curEntry.split(",");
			String emailAddress = nameParts[2].toLowerCase();
			String firstNameTitleCase = convertToTitleCase(nameParts[0]);
			String emailText = template.replace("{email}", emailAddress);
			
			emailText = emailText.replace("{first_name}",firstNameTitleCase);
			System.out.println("=================================");
			System.out.println(emailText);

			

		}
	}

}
