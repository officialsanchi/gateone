import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBook{
public static void main (String [] args){
	Scanner collect = new Scanner(System.in);
	ArrayList<String> addContact = new ArrayList<String>();
	
	

		System.out.print("Enter first name :");
		String firstName = collect.nextLine();
		System.out.print("Enter last name :");
		String lastName = collect.nextLine();
		System.out.print("Enter email Address  :");
		String emailAddress = collect.nextLine();
		System.out.print("Enter contact Address :");
		String contactAddress = collect.nextLine();
		System.out.print("Enter phone number :");
		String phoneNumber = collect.next();

	System.out.print("Enter 1 to continue saving or 0 to exit");

	int number = collect.nextInt();
		while(number == 1){
		System.out.print("Enter first name :");
		 firstName = collect.next();
		System.out.print("Enter last name :");
		 lastName = collect.next();
		System.out.print("Enter email Address  :");
		emailAddress = collect.next();
		System.out.print("Enter contact Address :");
		contactAddress = collect.next();
		System.out.print("Enter phone number :");
		phoneNumber = collect.next();
		
		number++;

	System.out.print("Enter 1 to continue \n 2 to back to main menu\n 0  to exit");

	number = collect.nextInt();
	
	}
	

	

	
		
	

	
		
	}
}
	