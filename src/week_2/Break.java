package week_2;

public class Break {

	public static void main(String[] args) {
	
	/*	for (int i = 0; i < 10; i++){
			// if printing before the if statement you will print till the value of i is equal to.  
			System.out.println(i);
			if (i ==5) {
				break;
			}// because your printing after the if statement (i)   
			 //will stop at 4
			//System.out.println(i);
		}*/
	
		for(int i =0; i < 5; i++){
			for (int j=0; j < 4; j++) {
				if (j==2) {
					break;
				}
				System.out.println("i = " i + " " + "j = " + j);
			}
		
		}
	}

}
