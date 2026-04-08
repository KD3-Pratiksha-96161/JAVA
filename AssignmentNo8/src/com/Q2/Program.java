package com.Q2;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        // Create a new ArrayList of strings
        ArrayList<String> colors = new ArrayList<>();

        // dd some colors
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Orange");

        // Print the original collection
        System.out.println("Original list: " + colors);

        // Sort the collection
        Collections.sort(colors);

        // Print the sorted list
        System.out.println("Sorted list: " + colors);
    }
}

