package week_2;
//import java.util.Random;
import java.util.Scanner; 
public class GenerateRandomNum {

	public static void main(String[] args) {
	    
		/*int min = 10;
		int max = 100;
		
		System.out.println("Random value in int from " + min + " to " + max + ":");
        int randomNum = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.print(randomNum);
        */
		
		
		
		     /* Random rand = new Random(); 
		      int upperbound = 100;
		       
		      int int_random = rand.nextInt(upperbound); 

		      System.out.println("Random integer value from 0 to 100 " +  int_random);*/
		
		 
		
		 
		      String str, strReverse = "";  
		      Scanner in = new Scanner(System.in);   
		      System.out.println("Enter a string/number to check if it is a palindrome");  
		      str = in.nextLine();   
		      int length = str.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		    	  strReverse = strReverse + str.charAt(i);  
		      if (str.equals(strReverse))  
		         System.out.println("Entered string/number is a palindrome.");  
		      else  
		         System.out.println("Entered string/number isn't a palindrome.");   
		 
	}

}
