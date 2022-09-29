package com.bptn.course;

import java.util.Scanner;

public class Scan_java_day4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//Creates an Scanner object so we can read info from the keyboard.

		System.out.println("Enert username: ");
		
		String username = scan.nextLine();// Reads a String from the console.
		
		System.out.println("Hello " + username); // Display a Hello.

	}

}
