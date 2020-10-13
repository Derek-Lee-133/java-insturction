package hoy.app;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class BootCampTimeRemainingApp {

	public static void main(String[] args) {
		LocalDate bootcampStart = LocalDate.of(2020, Month.AUGUST, 10);
		LocalDate bootcampGraduation = LocalDate.of(2021, Month.FEBRUARY, 24);
		LocalDate currentDate = LocalDate.now();

		long bootcampStartDaysAgo = bootcampStart.until(currentDate, ChronoUnit.DAYS);
		long bootcampDaysRemaining = currentDate.until(bootcampGraduation, ChronoUnit.DAYS);

		System.out.println("Bootcamp started " + bootcampStartDaysAgo + " days ago");
		System.out.println("There are " + bootcampDaysRemaining + " days remaining");

		long totalBootcampDays = bootcampStartDaysAgo + bootcampDaysRemaining;
		double percentComplete = (double) bootcampStartDaysAgo / totalBootcampDays;

		NumberFormat percentFormatter = NumberFormat.getPercentInstance();

		System.out.println("We are " + percentFormatter.format(percentComplete) + " complete!");
	}
}
