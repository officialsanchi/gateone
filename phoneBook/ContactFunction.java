
import java.util.ArrayList;
import java.util.Scanner;

public class ContactFunction {

    static ArrayList<Contact> contacts = new ArrayList<>();

    public static String addContact() {
        String firstName = input("Enter first name: ");
        String lastName = input("Enter last name: ");
        String email = input("Enter email: ");
        String phone = input("Enter phone number: ");
        Contact contact = new Contact(firstName, lastName, email, phone);
        contacts.add(contact);
        return "Contact added Successfully! .....";
    }

    public static ArrayList<Contact> viewAllContacts(){
        return contacts;
    }
    public static Contact findByPhoneNumber(){
        Contact foundContact = null;
        String phoneNumber = input("Enter phone number: ");
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber()==null) {
                foundContact = null;
            }
            if (contact.getPhoneNumber().equals(phoneNumber))
                foundContact = contact;
        }
        return foundContact;
    }

    private static String input(String inputValue) {
         Scanner sc = new Scanner(System.in);
        System.out.print(inputValue);
        String input = sc.nextLine();
        return input;
    }

        public static void display(){
        String otions = input("""
                1-> add contact
                2-> view all contacts
                3-> find contact by phone number
                4-> exit
                """);
        switch (otions){
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
                System.out.println("Bye Bye !");
                System.exit(0);
            default:
                System.out.println("Dont be stupid follow the options given");
                display();
        }
        }
    public static void main(String[] args) {

        System.out.println("""
                WELCOME TO CHI-CHI CONTACT APPLICATION
                """);
        display();
    }

}