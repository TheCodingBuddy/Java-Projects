package bmiCalculator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);                 // Create Object of Scanner Class
	
	BmiCalculator bm = new BmiCalculator();              // Create Object of BmiCalculator Class  
	
	System.out.println("Enter Height ( in Meters ) :");
	double ht = sc.nextDouble();
	
	System.out.println("Enter Weight ( in Kg ) :");
	double wt = sc.nextDouble();
	
	double bmi = bm.calculateBmi(ht,wt);
	System.out.printf("Your BMI (Body Mass Index) is : %.2f kg/m2",bmi);   //use of printf() to display output
	
	String category = bm.decideCategory(bmi);
	System.out.println("\nAccording to calculated BMI, Your BMI Category is : "+ category);
	
	sc.close();
	}

}
