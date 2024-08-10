import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class MenstrualApp{
	public static void main(String [] args){

	Scanner scanner = new Scanner(System.in);
	LocalDate  localDate = LocalDate. now();
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofpattern (" dd - mm - yyyy");


System.out.println("CHECK YOUR MENSTRUAL CYCLE ");


System.out.print(""" 

	*HOW TO KNOW YOUR MENSTRUAL CYCLE USING THREE MONTHS RECORD*

	#. Keep record of your first dates(number) of period for three months
	#. Add the dates(number)  
	#. Divide step 2 by three
	#.Step 3 will be determined by the number month used

	NOTE: IF YOUR MENSTRUAL CYCLE IS BELOW 21 DAYS OR ABOVE 35 DAYS ITS ABNORMAL \n BUT IF IT IS BETWEEN 21 DAYS AND 35 DAYS IT IS NORMAL 

	""");

	


System.out.println("Enter the first day of period :");
	int dayOfPeriod = scanner.nextInt();
System.out.println("Enter your menstrual cycle : ");
	int cycle = scanner.nextInt();


	int nextperiod = dayOfPeriod + cycle;
	int ovulation = dayOfPeriod + 14 ;
	int fertileDays = 2 + ovulation + 2;
	int safeDay = ovulation - 3; 
	int safe = dayOfPeriod - 6;
	int safeDays = safeDay + safe;
	


	System.out.println("nextperiod : " + nextperiod);
	System.out.println("ovulation :"  + ovulation);
	System.out.println("fertileDays :" + fertileDays);
	System.out.println("safeDays : "  + safeDays );


	
	


	}


}