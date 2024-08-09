import java.util.Scanner;
import java.util.ArrayList;
public class ContactTest{
	
public static ArrayList<Contact>contacts = new ArrayList<>();

public static String addContact(){
	String firstName = input("Enter first name :");
	String lastName = input("Enter last name : ");
	String phoneNumber = input("Enter phone number :");
	String address = input ("Enter address :");
	String email = input ("Enter email : ");
	
	Contact contact = new Contact(firstName,lastName, phoneNumber,address,email);
	contacts.add(contact);
	return "Contact Added Successfully!....";
}
public static ArrayList<Contact>viewAllContacts(){
	return contacts;
	}
public static Contact findByPhoneNumber(){
	Contact foundContact = null;

	String phoneNumber = input ("Enter phone Number :");
	for(Contact contact: contacts){
	if(contact.getPhoneNumber()==null){
	foundContact = null;
		}
	if(contact.getPhoneNumber().equals(phoneNumber)){
	foundContact = contact;
		}
	}
	return foundContact;
	}

	private static String input(String inputValue){
	Scanner scanner = new Scanner(System.in);
	System.out.print(inputValue);
	String input = scanner.nextLine();
	return input;
	}
 public static void display(){

	String options = input("""
	1 >>>> add contact
	2 >>>> view all contact
	3 >>>> find contact by phone number
	4 >>>> exit
	""");

	switch(options){
		case "1":
			System.out.println(addContact());
			display();
		case "2":
			System.out.println(viewAllContacts());
			display();
		
		case "3":
			System.out.println(findByPhoneNumber());
			display();
			
		case "4":
			System.out.println("Bye Bye!");
			System.exit(0);
		default:
			System.out.println("Dont be stupid follow the options given");
			display();
}
	
}
public static void main (String[] args){
	System.out.println("""
	WELCOMME TO DINMA CONTACT APPLICATION """);

	display();
	}
	
}