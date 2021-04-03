import java.util.*;

public class magicianNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n = sc.nextInt(); 
        
        // initialize array and allocate space of 'n' elements
        int array[] = new int[n];
        
        // This will create integer array of size 'n'  
        
        System.out.println("Enter the Elements :");
        for(int i=0;i<n;i++)
        {
          // read elements and store in array at index i
           array[i]= sc.nextInt(); 	
        }
		
        findNumber(array,n); 
        // call findNumber() method and pass array and size of array as argument to function.
        
		sc.close();
	}

	public static void findNumber(int arr[],int size)
	{
		int count =0;
		System.out.println("Magician's Numbers from given collections are - \n");
	    for(int i=0;i<size;i++)
	    {
	    	// Divide each element in array by 7 . If element is completely divided by 7 , it will be Magician's Number.
	    	// Element at ith index is access as - arr[i]
	    	if(arr[i]%7==0)      
	    	{
	    		System.out.print(arr[i]+" ");
	    		count++;   // if array have magician's number , increment the count.
	    	}
	    }
	    if(count==0) //  as count is 0 , given array doesn't have any magician's number
	    {
	    	System.out.println("\nSorry ! This collection doesn't contain any magician's number");
	    }
	}
}























