import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

        System.out.println("CHECK YOUR MENSTRUAL CYCLE");
	System.out.println("What is your name : ");
	String name = scanner.nextLine();
	System.out.println("how old are you : ");
	int age = scanner.nextInt();





        System.out.println("Enter the first day of your period (YYYY-MM-DD):");
        String firstDayInput = scanner.next();
        LocalDate firstDay = LocalDate.parse(firstDayInput, formatter);

        LocalDate nextPeriod = firstDay.plusDays(25);
        LocalDate lengthOfFlow = firstDay.plusDays(4 - 1);
        LocalDate safePeriod1 = lengthOfFlow.plusDays(3);
        LocalDate ovulation = safePeriod1.plusDays(3);
        LocalDate safePeriod2 = ovulation.plusDays(4);

	System.out.println(name);
	System.out.println(age);

        System.out.println("Your next period is expected on: " + nextPeriod.format(formatter));
	System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Your bleeding date should be within: " + firstDay + " to " + lengthOfFlow);
	System.out.println("**************************************************************************");
        System.out.println("Your safe period for sexual intercourse is within: " + lengthOfFlow.plusDays(1) + " to " + safePeriod1);
	System.out.println("######################################################################################################");
        System.out.println("Your ovulation date is: " + ovulation);
	System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Your second safe period is within: " + ovulation.plusDays(1) + " to " + safePeriod2);
System.out.println("NOTE NORMAL CYCLE IS 21 DAYS TO 35 DAYS");

System.out.println("IF YOUR CYCLE IS LESS THAN 21 DAYS OR GREATER THAN 35 DAYS IT ABNORMAL");
    }
}
