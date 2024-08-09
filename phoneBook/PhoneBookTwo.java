import java.util.Scanner;
public class PhoneBookTwo{
	public static void main (String [] args){
	
	Scanner collect = new Scanner(System.in);

			System.out.println("""

			MENU
			[1] ADD CONTACT
			[2] REMOVE CONTACT
			[3] FIND CONTACT BY FIRST NAME
			[4] FIND CONTACT BY FIRST NAME
			[5] FIND CONTACT BY LAST NAME
			[6] EDIT CONTACT

			""");
	int addContact = collect.nextInt();
	switch(addContact){
	case 1: System.out.println("""
	
	1.Name 
	2.Address
	3.Telephone
	4.Email

""");
	int name = collect.nextInt();
	switch(name){

	case1:System.out.println("""
	1. first name
	2. last name

	""");
	String firstName = collect.nextLine();
	String lastName = collect.nextLine();
	

}
	
		
		
			}
		
		
		
	
	System.out.println("Name :");
	String name = collect.nextLine();

	System.out.println("Address :");
	String address = collect.nextLine();
	
	System.out.println("Telephone :");
	int telephone = collect.nextint();

	System.out.println("Email :");
	String email = collect.nextLine();





	}}