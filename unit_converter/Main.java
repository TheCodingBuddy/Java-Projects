package cpm.codingbuddy.unit_converter;
import java.util.Scanner;

public class Main {

	private final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		UnitConverter uc = new UnitConverter();
		Integer ch;
		Double gram,kg,mg,pounds;
		do {
		System.out.println("\n****** Unit Converter ********* \n1. Convert Kilogram to Gram \n2. Convert Gram to Kilogram"
				+ "\n3. Convert Pound to Kilogram \n4. Convert Pound to Gram\n5. Convert Miligram to Kilogram "
				+ "\n6. Convert Miligram to Gram \n7. Exit\nEnter your Choice :");
		ch = Integer.parseInt(sc.next());
		
		switch(ch) {
		case 1: 																//Convert Kilogram to Gram
			System.out.println("Enter Value in Kilograms(kg) :");
			kg = sc.nextDouble();
			uc.convertKilogramToGram(kg);
			gram = uc.getGrams();
			System.out.println(kg+" Kilograms = "+gram+" grams");
			break;
		case 2:																		//Convert Gram to Kilogram
			System.out.println("Enter Value in Grams(g) :");
			gram = sc.nextDouble();
			uc.convertGramToKilogram(gram);
			kg = uc.getKg();
			System.out.println(gram+" grams = "+kg+" kg");
			break;	
		case 3:                                                             	  //Convert Pound to Kilogram	
			System.out.println("Enter Value in Pounds(lb) :");
			pounds = sc.nextDouble();
			uc.convertPoundToKilogram(pounds);
			System.out.println(pounds+" pounds = "+ uc.getKg()+ " kg");
			break;
		case 4:																	 //Convert Pound to Gram
			System.out.println("Enter Value in Pounds(lb) :");
			pounds = sc.nextDouble();
			uc.convertPoundToGrams(pounds);
			System.out.println(pounds+" pounds = "+uc.getGrams()+" grams");
			break;	
		case 5: 																	// Convert Milligram to Kilogram
			System.out.println("Enter Value in Milligrams(mg) :");
			mg = sc.nextDouble();
			uc.convertMilligramsToKilogram(mg);
			System.out.println(mg+" milligrams = "+String.format("%.6f", uc.getKg())+ " kg");
			break;
	   case 6:																	// Convert Milligram to Gram
			System.out.println("Enter Value in Milligrams(mg) :");
			mg = sc.nextDouble();
			uc.convertMilligramsToGrams(mg);
			System.out.println(mg+ " milligrams = "+String.format("%.4f",uc.getGrams())+" grams");
			break;
		default :
			break;
		}
		}while(ch!=7);
		 System.out.println("\nThank you for using Unit Convert !!\n");
	}
}