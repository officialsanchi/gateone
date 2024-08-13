import java.util.Scanner;
public class PizzaWahala{
	public static void main(String [] args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("""
	----------------------------------------------------
	| n/s	|Pizza type |Number of Slices |Price per box|
	|-------|---------- |-----------------|-------------|
	|1	|Sapa size  |4		      |2,000	    |
	|-------|-----------|-----------------|-------------|
	|2	|Small Money|6		      |2,400        |
   	|-------|-----------|-----------------|-------------|    			|3	|Big boys   |8		      |3,000        | 
	|-------|-----------|-----------------|-------------|  			  
	|4	|Odogwu	    |12		      |4,200 	    |
	|-------|-------------------------------------------|
	
	""");
	System.out.println("How many persons :");
	int numberOfGuest = input.nextInt();
	System.out.println("What pizza type to you want to buy :");
	int pizzaType = input.nextInt();
	System.out.println("Number of box to you want to buy");
	int numberOfBox = input.nextInt();

	if(pizzaType == 1){
		4 /  numberOfGuest;

	
		System.out.println("Sapa size");
	}
	else if(pizzaType == 2){
		System.out.println("Small Money");
	}
	else if(pizzaType == 3){
		System.out.println("Big boys");
	}
	else if(pizzaType == 4){
		System.out.println("Odogwu");
	}
	else{
		System.out.println("invaild pizza type");
	}
	



	}

}