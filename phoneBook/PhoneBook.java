import java.util.Scanner;
import java.util.ArrayList;
public class PhoneBook{
public static void main (String [] args){
	Scanner collect = new Scanner(System.in);
	ArrayList<String> contacts = new ArrayList<String>();
	System.out.println("""

			MENU
			[1] ADD CONTACT
			[2] REMOVE CONTACT
			[3] FIND CONTACT BY FIRST NAME
			[4] FIND CONTACT BY FIRST NAME
			[5] FIND CONTACT BY LAST NAME
			[6] EDIT CONTACT

			""");
	System.out.println("Enter 1 to continue or 0 exit");
	int number = collect.nextInt();
	switch(number){
	case 1: System.out.println("""
	
	1.Name 
	2.Address
	3.Telephone
	4.Email

""");


if (number > 1){
System.out.println(" firstname/tlastname/temailAddress/tcontactAddress/tphoneNumber");
		System.out.println(" Enter first name :");
		String firstName = collect.nextLine();
		System.out.println("Enter last name :");
		String lastName = collect.nextLine();
		System.out.println(" Enter email Address  :");
		String emailAddress = collect.nextLine();
		System.out.println("Enter contact Address :");
		String contactAddress = collect.nextLine();
		System.out.println(" Enter phone number :");
		String phoneNumber = collect.nextLine();

	}
	System.out.println("Enter 1 to continue or 0 exit");

	
	
	System.out.println(" Enter first name :");
		String firstName = collect.nextLine();
	System.out.println("Enter last name :");
		String lastName = collect.nextLine();
	System.out.println(" Enter email Address  :");
		String emailAddress = collect.nextLine();
	System.out.println("Enter contact Address :");
		String contactAddress = collect.nextLine();
	System.out.println(" Enter phone number :");
		String phoneNumber = collect.nextLine();

	
	
	}
	

	}
}