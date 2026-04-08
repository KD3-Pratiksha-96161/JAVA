package com.string;

import java.util.Scanner;

public class Assignment5_Q1 {


	    public static void main(String[] args) {
	        
	       /* Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        
	        
	        String original = scanner.nextLine(); 
	        
	       
	        String reversed = new StringBuilder(original).reverse().toString();
	        
	        System.out.println("Reversed: " + reversed);
	        
	       
	        
	    }*/
	

Scanner scanner =new Scanner(System.in);
System.out.println("Enter a string");
String Original = scanner.nextLine();

String reversed = new StringBuilder(Original).reverse().toString();
System.out.println("Reversed : "+reversed);
}
}
