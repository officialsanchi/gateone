import java.util.Scanner;
import java.util.ArrayList;
public class CheckOutApp{
	public static void main(String [] args){
	 ArrayList<String> goods =  new ArrayList<>();
	ArrayList<Interger> quantity = new ArrayList<>();
	ArrayList<Interger> price = new ArrayList<>();

	Scanner input = new Scanner(System.in);
	
	System.out.println("What is the customer's Name :");
	String name = input.nextLine();
	
	String flag = "yes";
	while(flag.equalsIgnoreCase("yes")){
	
	System.out.println("What did the user buy ? ");
	goods.add (input.nextLine());
	
	System.out.println("How many pieces ?" );
	quantity.add (input.nextInt());
	
	System.out.println("How much per unit ?");
	price.add(input.nextInt());
	
	System.out.println("Add more items (Yes or No)");
	flag = input.nextLine();
	
	
		}
	
	}
}