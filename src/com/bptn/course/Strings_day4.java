package com.bptn.course;

public class Strings_day4 {

	public static void main(String[] args) {
	
		String s1 = "Hello";
		String s2 = new String ("Hello");
		
		/* if (s1.equal (s2)) {
			System.out.println("Strings are equal");
			
		}else {
			System.out.println("Different");
		}*/
		
        // the reason way it come out different because when writing the 
		//string and you put(NEW) the computer save the variable in different 
		//addresess 
		
		if (s1.equals(s2)) {
			System.out.println("Strings are equal");
			
		}else {
			System.out.println("Different");
		}
		// in this case if you want to find out if the string variables  
		//are equal you

		
		
		// you can also use 
		
		/*String s1 = "Hello";
		String s2 = "Hello";
		if (s1 == s2) {
			System.out.println("Strings are equal");
			
		}else {
			System.out.println("Different");
		}*/
		
		// but this isn't as reliable because the reason why this shows eaqual 
		//is because java has allicates only on address for both variables becuse 
		//it can see it is the same 
	}

}
