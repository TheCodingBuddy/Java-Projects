package calculator;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Scanner class is used to take input from user. 
		//Scanner class is found in java.util package so import that package
		Scanner sc= new Scanner(System.in);
		
		// create object of a Calculator class 
		Calculator cal = new Calculator();
		
		int ch;
		do {
		   System.out.println("\nEnter two numbers");
		   // take input from user 
		   int no1=sc.nextInt();
		   int no2=sc.nextInt();
		   
		   // set values to variables in Calculator Class using setters;
		   cal.setFirstNum(no1);
           cal.setSecondNum(no2);
		   
		   System.out.println("Enter Your Choice:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
		   ch = sc.nextInt();
		   
		   if(ch==1)
		   {
			   //call addition method of Calculator class 
			   int result = cal.addition(no1, no2); // store the value return by addition method in result variable.
			   System.out.println("Addition of numbers is : "+result); // print calculated value/ answer to console. 
		   }
		   else if(ch==2)
		   {
			   //call subtraction method of Calculator class
			   int result= cal.subtract(no1, no2);  // store the value return by subtract method in result variable.
			   System.out.println("Subtraction of numbers is: "+result); // print calculated value/ answer to console.
		   }
		   else if(ch==3)
		   {
			  //call Multiplication method of Calculator class
			   int result = cal.multiplication(no1, no2); // store the value return by multiplication method in result variable.
			   System.out.println("Multiplication of numbers is: "+result); // print calculated value/ answer to console.
		   }
		   else if(ch==4)
		   {
			  //call Divide method of Calculator class
			   float result = cal.divide(no1, no2);  // store the value return by divide method in result variable.
			   System.out.println("Division of numbers is: "+result); // print calculated value/ answer to console.
		   }
		   else if(ch==5)
		   {
			   System.out.println("Thank You For Using Application !!");
		   }
		}while(ch!=5);
		sc.close();
	}

}
