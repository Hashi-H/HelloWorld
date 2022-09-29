package com.bptn.course;

public class Conditional_practice_day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a = 6;
//		int b = 8;
//		
//		if (a > b){
//			System.out.println(a + " is bigger than " + b);
//				
//		}else if (a < b) {
//			 System.out.println(a + " is smaller than " + b);			
//		}
//		// else block will always run when the if block doesn't work.
//		else {
//	 	System.out.println(a + " is equal to " + b);
//		}
//		
		// nested if statements / nested conditionals
		int a1 = 44;
		int b1 = 262;
		int c1 = 55;
		
		if (a1 > b1) {
			
			if (a1 < c1) {
				System.out.println(a1 + " is smaller than " + c1 );
			}else {
				System.out.println(a1 + " is bigger than " + c1);
			}
			
		}else {
			System.out.println(a1 + " is smaller than " + b1);
		}
				
	}

}
