public class Contact{
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private String email;

	public Contact(String firstName, String lastName,String phoneNumber,String address,String email){
	this.firstName = firstName;
	this.lastName =  lastName;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.email = email;

	}
public String getFirstName(){
	return firstName;
	}
public String getLastName(){	
	return lastName;
	}
public String getPhoneNumber(){
	return phoneNumber;
	}
public String getAddress(){
	return address;
	 }
public String  getEmail(){
return email;
}

public String toString(){
	return String.format("""
	
	FirstName: %s
	LastName : %s
	PhoneNumber : %s
	Address : %s
	Email: %s
""", firstName, lastName, phoneNumber,address,email);

	}


}