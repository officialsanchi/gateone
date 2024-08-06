import java.time.LocalDate;
import java.util.Scanner;
public class MenstrualApp{
	public static void main(String [] args){

	Scanner scanner = new Scanner(System.in);
	LocalDate  localDate = new LocalDate;


	System.out.println("Enter the first day of period : ");
	int menses = scanner.nextInt();
	
	System.out.println("Enter your menstrual cycle : ");
	int cycle = scanner.nextInt();

	if (cycle < 21 || cycle > 35){

	System.out.print("abnormal cycle");
	}
	else{

	System.out.print("normal cycle");
	}
	


	





	}






	}