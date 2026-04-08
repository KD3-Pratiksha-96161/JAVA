package com.string;

import java.util.Scanner;

public class Assignment5_Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

       
        String trimmedInput = input.trim();

        if (trimmedInput.isEmpty()) {
            System.out.println("Word count: 0");
        } 
        else 
        {
       
            String[] words = trimmedInput.split("\\s+");
            System.out.println("Word count: " + words.length);
        }
        sc.close();
    }
}
