package emailGenerator;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO THE JAVA TUTOR\n");
		System.out.println("Fill the Following Details");
		
		// take input from user 
		System.out.println("Enter First Name :");
		String firstName = sc.next();
		
		System.out.println("Enter Last Name :");
		String lastName = sc.next();
		
		System.out.println("Enter Birth date and Birth Month (3112 for 31st Dec) : ");
		int dob = sc.nextInt();

		// email Id contains all letters in lower case so convert FirstName and LastName in lower case
		// using toLowerCase() method while passing to constructor.
	
		EmailGenerator email = new EmailGenerator(firstName.toLowerCase(), lastName.toLowerCase(), dob);
	    // this will call parameterized constructor written in EmailGenerator class.
		
		//Call newMail() method from EmailGenerator class. 
		//As newMail() method return email id in String format, we store that returned value in string variable 
		String id= email.newMail();
		
		// display output
		System.out.println("Registration Successful !!");
		System.out.println("\nName: "+ email.getFirstName()+" "+email.getLastName());
		System.out.println("Mail Id : "+id);
		
		sc.close();
	}	
}
