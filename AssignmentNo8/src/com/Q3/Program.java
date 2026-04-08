package com.Q3;

import java.util.ArrayList;

public class Program {
	


	    public static void main(String[] args) {
	        // Initialize ArrayList with some elements
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");    
	        colors.add("Green"); 
	        colors.add("Blue");   

	        System.out.println("Original list: " + colors);

	        // Specify the new element
	        String newElement = "White";

	        // Replace the element at index 1 (the second element)
	        if (colors.size() >= 2) {
	            colors.set(1, newElement);
	            System.out.println("Updated list: " + colors);
	        } else {
	            System.out.println("Error: The list does not have a second element.");
	        }
	    }
	}


