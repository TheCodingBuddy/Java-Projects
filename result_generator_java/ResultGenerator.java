package resultGenerator;

public class ResultGenerator {
	
	private int noOfSubjects;
	private int [] marksArray = new int [noOfSubjects]; // array to store marks
	
	// Parameterized Constructor 
	public ResultGenerator(int noOfSubjects, int [] marksArray) {
		this.noOfSubjects = noOfSubjects;
		this.marksArray = marksArray;
	}
	
	// getters and setters
	public int getNoOfSubjects() {
		return noOfSubjects;
	}
	public void setNoOfSubjects(int noOfSubjects) {
		this.noOfSubjects = noOfSubjects;
	}
	public int[] getMarksArray() {
		return marksArray;
	}
	public void setMarksArray(int[] marksArray) {
		this.marksArray = marksArray;
	}
	
	//method to calculate percentage
	public float calPercent()
	{
		float percentage=0;
		int sum=0;
		for (int i=0;i<noOfSubjects;i++)
		{
			sum=sum+marksArray[i];    // summation of marks of all subjects
		}
		percentage = sum/noOfSubjects;		
		return percentage;
	}
	
    // method to decide grade
	public char calGrade(float percent)
	{
		char grade='O';
		if(percent>=80)
			grade = 'O';
		else if ((percent<80)&&(percent>=70))
		    grade = 'A';
		else if ((percent<70)&&(percent>=60))
			grade = 'B';
		else if ((percent<60)&&(percent>=50))
			grade = 'C';
		else if ((percent<50)&&(percent>=35))
		    grade = 'D';
		else if (percent < 35)
			grade = 'F';
		
		return grade;
	}
}




