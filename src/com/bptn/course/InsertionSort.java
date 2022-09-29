package com.bptn.course;
import java.util.Arrays;
public class InsertionSort {

	public static void main(String[] args) {
		
		 int[] arr = {8, 4, 5, 0, 9, 11, 2, 7};
		 
		 for (int j = 1;j < arr.length; j++ ) {
			 
			 int temp = arr[j];
			 int possibleIndex = j;
			 
		while (possibleIndex > 0 && temp < arr[possibleIndex - 1]){
			arr[possibleIndex] = arr[possibleIndex - 1];
			possibleIndex--; 
			//-- means: 
			//possibleIndex = possibleIndex - 1; 
		    }
		 
		    arr[possibleIndex] = temp; 
		 }
         
		 System.out.println(Arrays.toString (arr));
	}

}
