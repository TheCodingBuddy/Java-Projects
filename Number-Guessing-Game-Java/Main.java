package numberGuessing;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberGuessing ng = new NumberGuessing();
		
	   int chance = 1;
	   System.out.println("\n**** You Will Get 3 Chances to Guess the Number picked By Player 1 ****\n");
	   
	   String ans = "y" ;
	   
	   int randomNo =  ng.generateRandomNumber(); // call the function to generate random number
	  
	   do
	   { 
		  System.out.println("Guess and Enter the Number between 1 - 10 : ");

		  int userNo = sc.nextInt();   
		 
		  
		  boolean result = ng.numberChecker(randomNo, userNo); // call the function to check player 2 guess the correct number or not 
		  if(result)
		  {
			  System.out.println("You Guess the Correct Number. Congratulations... You won the Game !!! ");
			  System.out.println("\nDo you want to play again (y/n) ? ");
			  ans = sc.next();
			  if(ans.equalsIgnoreCase("y")) 
			  {
			    chance = 1;
			    System.out.println("\nNew Game will Begin .... \n");
			    randomNo =  ng.generateRandomNumber(); // call the function to generate NEW random number for NEW game
			  }  
		  }
		  else 
		  {
			  if(chance==3)
			  {
				  System.out.println("Well Try .. But You Lost the Game ! \nThe Correct Number Was "+randomNo);
				  System.out.println("\nDo you want to play again (y/n) ? ");
				  ans = sc.next();
				  if(ans.equalsIgnoreCase("y")) 
				  {
				    chance = 1;
				    System.out.println("\nNew Game will Begin .... \n");
				    randomNo =  ng.generateRandomNumber(); // call the function to generate NEW random number for NEW game
				  }  
			  }
			  else
			  {
			  System.out.println("Your guess is wrong. Try again !");
			  chance++;
			  }
		  }  
	   }while((chance <= 3)&&(ans.equalsIgnoreCase("y")));
	
	   System.out.println("Thank You Playing !! ");
	   sc.close();
	}
}






















