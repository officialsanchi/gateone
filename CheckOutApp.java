import java.util.Scanner;
import java.util.ArrayList;
public class CheckOutApp{
	public static void main(String [] args){
	 ArrayList<String> goods =  new ArrayList<>();
	ArrayList<Integer> quantity = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();

	Scanner input = new Scanner(System.in);
	
	System.out.println("What is the customer's Name :");
	String name = input.nextLine();
	
	int flag = 1;
	while(flag == 1){
	
	System.out.println("What did the user buy ? ");
	goods.add (input.next());
	
	System.out.println("How many pieces ?" );
	int pieces = input.nextInt();
	while(pieces < 1){

	System.out.println("How many pieces ?" );
	pieces = input.nextInt();
		}
	quantity.add (pieces);
	
	System.out.println("How much per unit ?");
	int unit = input.nextInt();
	while(unit < 1){
		System.out.println("How much per unit ?");
		unit = input.nextInt();

	}
	price.add(unit);
	
	System.out.println("Enter 1 to add more items or any value to stop: ");
	flag = input.nextInt();
	
	
	
		}
	System.out.println("What is your name ?");
	String cashier = input.next();

	System.out.println("How much discount will you get : ");
	int discount = input.nextInt();

	System.out.println("SEMICOLON STORES");
	System.out.println("MAIN BRANCH");
	System.out.println("LOCATION : 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
	System.out.println("TEL : 03293828343");
	System.out.println("DATE : 13 - 08-2024 , 12 : 50 : 11 pm");
	System.out.println("Cashier:" + cashier);
	System.out.println("Customer Name: "+ name);
	System.out.println("========================================================================================================================");
System.out.println("\t\t\t\t ITEM \tQTY \tPRICE \t\tTOTAL");
	System.out.println("------------------------------------------------------------------------------------------------------------------------");


	double subtotal = 0;
	for(int index = 0; index < goods.size(); index++){
	double total = 0;
	 total = quantity.get(index) * price.get(index);
	subtotal += total;
		System.out.printf("%35s%7d%8d%15.2f%n",goods.get(index),quantity.get(index), price.get(index), total);
					}
	double tot = (subtotal / 100) * discount;
	System.out.println("------------------------------------------------------------------------------------------------------------------------");

	System.out.println("Sub Total : " + subtotal);
	System.out.println("Discount :"+ tot);


	double vat = (subtotal / 100) * 17.50;
	System.out.println("VAT @ 17.50% :" + vat);
	System.out.println("========================================================================================================================");
	 double billtotal = (subtotal - tot)  + vat ;

	System.out.println("Bill Total  " + billtotal);
	System.out.println("========================================================================================================================");


				System.out.println("THIS IS NOT YOUR RECIEPT KINDLY PAY " + billtotal  );
	System.out.println("========================================================================================================================");

	System.out.println("How did the customer give to you ? ");
	double amount = input.nextDouble();

	while(amount < billtotal){
	System.out.print("Please enter a valid amount to clear your goods. ");
	System.out.println("How did the customer give to you ? ");
	amount = input.nextDouble();

	}

	double payment = amount - billtotal;

	
	
	
	System.out.println("SEMICOLON STORES");
	System.out.println("MAIN BRANCH");
	System.out.println("LOCATION : 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
	System.out.println("TEL : 03293828343");
	System.out.println("DATE : 13 - 08-2024 , 12 : 50 : 11 pm");
	System.out.println("Cashier:" + cashier);
	System.out.println("Customer Name: "+ name);
	System.out.println("========================================================================================================================");
System.out.println("\t\t\t\t ITEM \tQTY \tPRICE \t\tTOTAL");
	System.out.println("------------------------------------------------------------------------------------------------------------------------");


	 subtotal = 0;
	for(int index = 0; index < goods.size(); index++){
	double total = 0;
	 total = quantity.get(index) * price.get(index);
	subtotal += total;
		System.out.printf("%35s%7d%8d%15.2f%n",goods.get(index),quantity.get(index), price.get(index), total);
					}
	 tot = (subtotal / 100) * discount;
	System.out.println("------------------------------------------------------------------------------------------------------------------------");


	System.out.println("Sub Total : " + subtotal);
	System.out.println("Discount :"+ tot);


	 vat = (subtotal / 100) * 17.50;
	System.out.println("VAT @ 17.50% :" + vat);
	System.out.println("========================================================================================================================");
        billtotal = (subtotal - tot)  + vat ;

	System.out.println("Bill Total:  " + billtotal);
	System.out.println("Amount paid:  " + amount);
	System.out.println("Balance :  "+ payment);
	System.out.println("========================================================================================================================");







	
	}
}