package fr.tib.kiloutou;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtil {

	private static final String DATE_PATTERN ="dd.MM.yyyy";
	
	//formater la date
	
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);
	
	//conversion d'une LOCALEDATE en string, utilisation du format DATE_PATTERN
	
	public static String format(LocalDate date) {
		if(date== null) {
			return null;
		}
		return DATE_FORMATTER.format(date);
	}
	
	public static LocalDate parse(String dateString) {
		try {
			return DATE_FORMATTER.parse(dateString, LocalDate::from);
		}
		catch(DateTimeParseException e){
			return null;
		}
	}
	
	//essai de parse la string dateString en retourne un boolean
	
	public static boolean validDate(String dateString) {
		return DateUtil.parse(dateString) != null;
	}

//	String dateInString = "07-07-2013";
//	SimpleDateFormat formatDt = new SimpleDateFormat("dd-MM-yyyy");
//	Date date = formatDt.parse(dateInString);
//	System.out.println(formatDt.format(date));
	
//	public static Date convertToDate(String receivedDate) throws ParseException{
//	
//    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//    Date date = formatter.parse(receivedDate);
//    return date;
//}
}
