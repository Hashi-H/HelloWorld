package com.bptn.course;

public class ReverseNumber {

	public static void main(String[] args) {
	
		/*int num = 1234;
		int reverse = 0;
		int remainder = 0;
		
		while (num < 0) {
			// this is to grab the last digit of your number
			remainder = num % 10;
			// append the last digit to reverse 
			reverse = (reverse * 10) + remainder;
			//Remove the last digit of the number
			num = num / 10;
		}
            System.out.println("The reversed number is: " + reverse);*/
		
		int[] numbers = {14,20,30,19};
		//int sum = 0;
		
		for (int index = 0; index < numbers.length; index++){
	    //sum = sum + numbers[index]; 
		if (numbers [index] %2 == 0) {
			System.out.println(index);
		  }
		}
		//System.out.println(sum);
	}

}
