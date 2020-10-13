package lee.app;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {
	final double NIGHTLY_RATE = 145.00;

	// class variables
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	public Reservation() {
		arrivalDate = null;
		departureDate = null;
	}

	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}
	public LocalDate getArrivaldate() {
		return arrivalDate;
	}

	public String getArrivalDateFormatted() {
		DateTimeFormatter dtFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		String dateFormatted = dtFormat.format(arrivalDate);
		return dateFormatted;
	}

	public void setArrivaldate(LocalDate arrivaldate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDeparturedate() {
		return departureDate;
	}
	public String getPricePerNightFormatted () {
	NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(NIGHTLY_RATE);
	
	}
	public double getTotalPrice() {
	return NIGHTLY_RATE * getNumberOfNights();	
	}
	public String getTotalPriceFormatted() {
		NumberFormat currencyFormat= NumberFormat.getCurrencyInstance()(getTotalPrice());
		
	}
	public String getDepartureDateFormatted() {
		DateTimeFormatter dtFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		String dateFormatted = dtFormat.format(departureDate);
		return dateFormatted;
	}

	return departureDate;

	}

	public void setDeparturedate(LocalDate departuredate) {
		this.departureDate = departureDate;
	}

	public double getNIGHTLY_RATE() {
		return NIGHTLY_RATE;
	}

	// constructor
	
	public int getNumberOfNights() {
		return (int) arrivalDate.until(departureDate,ChronoUnit.DAYS);

}

	}
