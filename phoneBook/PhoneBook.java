import java.util.*;
public class PhoneBook{
public static void main (String [] args){
	Scanner collect = new Scanner(System.in);
	ArrayList<String> addContact = new ArrayList<String>();
		System.out.println("""

			MENU
			[1] ADD CONTACT
			[2] REMOVE CONTACT
			[3] FIND CONTACT BY FIRST NAME
			[4] FIND CONTACT BY FIRST NAME
			[5] FIND CONTACT BY LAST NAME
			[6] EDIT CONTACT
""");
		System.out.print("Select number : ");
		int addcontact = collect.nextInt();
			System.out.print("Enter first name :");
			String firstName = collect.nextLine();
			addContact.add(firstName);

			System.out.print("Enter last name :");
			String lastName = collect.nextLine();
			addContact.add(lasttName);

			System.out.print("Enter email Address  :");
			String emailAddress = collect.nextLine();
			addContact.add(emailAddress);

			System.out.print("Enter contact Address :");
			String contactAddress = collect.nextLine();
			addContact.add(contactAddress);

			System.out.print("Enter phone number :");
			String phoneNumber = collect.next();
			addContact.add(phoneNumber);


	System.out.print("Enter 1 to continue saving or 0 to exit :");

	int number = collect.nextInt();
		while(number == 1){
		System.out.print("Enter first name :");
			firstName = collect.nextLine();
			addContact.add(firstName);

			System.out.print("Enter last name :");
			lastName = collect.nextLine();
			addContact.add(lasttName);

			System.out.print("Enter email Address  :");
			emailAddress = collect.nextLine();
			addContact.add(emailAddress);

			System.out.print("Enter contact Address :");
			contactAddress = collect.nextLine();
			addContact.add(contactAddress);

			System.out.print("Enter phone number :");
			phoneNumber = collect.next();
			addContact.add(phoneNumber);


		number++;

	System.out.print("Enter 1 to continue \n 2 to back to main menu\n 0  to exit :");

	number = collect.nextInt();

	
	}
	

	

	
		
	

	
		
	}
}
	