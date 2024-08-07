import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("NAME OF SCHOOL");
	System.out.println("LAGBAJA SCHOOL");
	
	System.out.print("Name of teacher : ");
	String name = input.nextLine();

	System.out.print("Enter number of student : ");
	int numberOfStudent = input.nextInt();
	System.out.print("Enter number of subject : ");
	int numberOfSubject = input.nextInt();


	int [][]  nameAndSubject = new int [numberOfStudent][numberOfSubject];
	double [] average = new double [numberOfSubject];
	

	for(int count = 0, student = 1 ; count < numberOfStudent; count++, student++){
	int sum = 0;
		for(int counter = 0, subject = 1 ;  counter < numberOfSubject; counter ++ ,subject++){
		System.out.println("student "+ student+"\n subject"+subject+ ":");
		nameAndSubject [count][counter] = input.nextInt();

		sum += nameAndSubject [count][counter] ;
		
		average [counter] =  sum / numberOfSubject ;
		

		System.out.println(sum);
		System.out.println();
		} 

		
			}
		for(int index = 0;index < numberOfSubject; index++){
			for(int element = 0; element < average; element ++){

			}

		

		}
		
System.out.println(Arrays.toString (average));
	  }
}