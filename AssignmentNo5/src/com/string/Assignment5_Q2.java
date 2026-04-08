package com.string;

import java.util.Scanner;

public class Assignment5_Q2 {

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String original = scanner.nextLine();
	        
	      
	        String clean = original.replaceAll("s: ", "").toLowerCase();
	        
	       
	        String reversed = new StringBuilder(clean).reverse().toString();
	        
	 
	        if (clean.equals(reversed)) {
	            System.out.println("\"" + original + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + original + "\" is not a palindrome.");
	        }
	        
	        scanner.close();
	
	
	

	    }
	}
