public class Account{
	private double balance;
	private String name;
	private String pin;
	private String number;
public Account(String name,String pin,String number){

this.name = name;
this.pin = pin;
this.number = number;
}
public void deposit(double amount){
	if (amount >0){
		balance = balance + amount;
	}
	else{
	System.out.print("amount must be be less than zero");
}
	public void withdraw(double amount, String myPin){
		pinValidation(pin);
		if(balance > amount){
	 balance = balance - amount;
	}
}

	private void pinValidation(String pin){
		if(!this.pin.equals(pin)){
			System.out.print("invaild pin");
		}
	}

	public double checkBalance(String pin){

	pinValidation(pin);
	return balance;
}
	public String getName(){
	return name;
}
	public String getPin(){
	return pin;
}
	public String getNumber(){
	return number;
	
	}
}