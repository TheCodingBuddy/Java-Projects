
package numberGuessing;

import java.lang.Math;

public class NumberGuessing {
	

// function to generate random number	
		public int generateRandomNumber()
		{
			int number = (int) (Math.random()*10)+1; // will generate random number between 1 - 10
			return number;
		}

		
// function to check whether 2 numbers are equal or not
	public boolean numberChecker(int random , int number)
	{
		boolean result= false ;
		if(random == number)
		{
			result = true;
		}
		return result;
	}

}













