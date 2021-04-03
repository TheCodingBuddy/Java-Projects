package calculator;

public class Calculator {
	
	private int firstNum;
	private int secondNum;
	
	// getters and setters 
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	// methods for addition
	public int addition(int no1,int no2)
	{
		int sum=0;
		sum = no1+no2;
		return sum;
	}
	
	//method for subtraction
	public int subtract(int no1,int no2)
	{
		int diff=0;
		if(no1>=no2) // if no1 is greater than no2 or both numbers are same , subtract no2 from no1.		
		{
			diff= no1-no2;
		}
		else  // if no2 is greater than no1, subtract no1 from no2. 
		{
			diff=no2-no1;
		}
	 return diff;
	 
	}
	
	// method for multiplication
	public int multiplication(int no1,int no2)
	{
		int multi = no1 * no2;
		return multi;
	}
	
	//method for division
	public float divide(int no1,int no2)
	{
		float div= 0;
		if(no1>=no2) 
		{
			div = no1/no2;
		}
		else
		{
			div=no2/no1;
		}
		
		return div;
	}	
}
