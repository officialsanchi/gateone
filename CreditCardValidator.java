import java.util.Arrays;
import java.util.Scanner;
public class CreditCardValidator{

	public static void main(String [] args){


	Scanner input = new Scanner (System.in);

	System.out.println("Enter your credit card number : ");
	String cardNumber = input.nextLine();

	int [] cardPin = new int[cardNumber];


	

		


	for(int index = 0; index <= cardNumber.length; index ++){

	if (cardNumber.length < 13 || cardNumber.length > 16){
		System.out.println("incorrect digits enter correct number : ");
		String correctScore  = input.nextLine();
	
			if(cardNumber[0] == 4){
			System.out.print("Visa card");
			}
			else if(cardNumber[0]== 5){
			System.out.print("Mastercard");
			}
			else if(cardNumber[0]== 37){
			System.out.print("American  Express Cards");
			}
			else if(cardNumber[0]== 6){
			System.out.print("Discover card ");
			}
			else{
			System.out.print("wrong input");
			}
	
	

	


		}
	   }




	





	}


		}