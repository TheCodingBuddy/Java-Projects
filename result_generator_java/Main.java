package resultGenerator;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("********* Result Generator System ********\n");		
		
		System.out.println("Enter No of Subjects: ");
		int no = sc.nextInt();
		
		int marks[] = new int[no]; // array to store marks of each subject
		
		System.out.println("Enter marks of each subject(out of 100): ");
		for(int i=0;i<no;i++)
		{
		   marks[i]= sc.nextInt();	
		}
		
		//create object of ResultGenerator.java using parameterized constructor
		ResultGenerator res = new ResultGenerator(no,marks);
		
		float percent = res.calPercent();
		System.out.println("Percentage Obtained are : "+ percent+"%");
		
		char grade = res.calGrade(percent);
		
		System.out.println("Grade : "+ grade);
		
		if(grade=='F')
		{
		     System.out.println("Kindly make necessary preparation and Reattempt the Exam !");	
		}
		else
		{
			System.out.println("Congratulations !! You have successfully cleared the Examination.");
		}
	}
}
