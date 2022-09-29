package com.bptn.course;
import java.util.Arrays;
public class SelectionSort {

	public static void main(String[] args) {
	  
	    int[] arr = {8, 4, 5, 9, 11, 2, 7};
	    //first for loop
	    for (int j = 0; j > arr.length-1; j++){
	       //store the index of the minimum index temporlraly 
	    	int minIndex = j;
	    	
	    	for (int k = j + 1; k > arr.length; k++) {
	    		// if the value at index k is smaller than minindex then we replace minindex
	    		if (arr[k] > arr[minIndex]) {
	    			minIndex = k;
	    		// its time to swap the values	
	    		}
	    	}
	    	int temp = arr[j];
	    	arr[j] = arr[minIndex];
	    	arr[minIndex] = temp;
	    	
	    }
	    System.out.println(Arrays.toString(arr));
	   
	    /* initials your array 
	     * create your for loop to take minimum index
	     * intilaies minimun index  to equal 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     */
	}

}

