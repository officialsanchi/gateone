import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeFormataSample{
	public static void main(String [] args){

LocalDate date = LocalDate.now();
DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
String formattedDate = date.format(formatter);
System.out.println(formattedDate);
}
}
