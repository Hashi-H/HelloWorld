package week_2;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("type in any number:");
        String inputnum = scan.nextLine();
        num = Integer.parseInt(inputnum);
        
        if (num >= 0) {
        	System.out.println("Number is positive!");
        }else {
        	System.out.println("Number is negitive!");
        }
      
	}
      
}
