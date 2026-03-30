package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket capacity: ");
        int capacity = sc.nextInt();
        
        Fruit[] basket = new Fruit[capacity];
        int counter = 0;
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("0. Exit\n1. Add Mango\n2. Add Orange\n3. Add Apple\n4. Show Names\n5. Show Fresh Details\n6. Show Stale Tastes\n7. Mark Stale\n8. Mark Sour Stale");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (counter < basket.length) {
                        basket[counter++] = new Mango("Yellow", 0.5);
                        System.out.println("Mango added.");
                    } else System.out.println("Basket is full!");
                    break;

                case 2:
                    if (counter < basket.length) {
                        basket[counter++] = new Orange("Orange", 0.3);
                        System.out.println("Orange added.");
                    } else System.out.println("Basket is full!");
                    break;

                case 3:
                    if (counter < basket.length) {
                        basket[counter++] = new Apple("Red", 0.2);
                        System.out.println("Apple added.");
                    } else System.out.println("Basket is full!");
                    break;

                case 4:
                    System.out.println("Fruits in basket:");
                    for (Fruit f : basket) {
                        if (f != null) System.out.println(f.getName());
                    }
                    break;

                case 5:
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f.toString() + ", Taste: " + f.taste());
                        }
                    }
                    break;

                case 6:
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + " is stale. Taste was: " + f.taste());
                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter index (0 to " + (counter-1) + "): ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < counter) {
                        basket[idx].setFresh(false);
                        System.out.println("Marked " + basket[idx].getName() + " as stale.");
                    } else {
                        System.out.println("Error: Invalid Index!");
                    }
                    break;

                case 8:
                    for (Fruit f : basket) {
                        if (f != null && f.taste().equals("sour")) {
                            f.setFresh(false);
                        }
                    }
                    System.out.println("All sour fruits marked stale.");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 0);
        
        sc.close();
    }
}



