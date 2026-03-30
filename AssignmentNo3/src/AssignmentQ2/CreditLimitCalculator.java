package AssignmentQ2;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNum = sc.nextInt();

        System.out.print("Enter Balance at start of month: ");
        int startBalance = sc.nextInt();

        System.out.print("Enter Total Items Charged this month: ");
        int charges = sc.nextInt();

        System.out.print("Enter Total Credits applied this month: ");
        int credits = sc.nextInt();

        System.out.print("Enter Allowed Credit Limit: ");
        int creditLimit = sc.nextInt();

        // Formula: new balance = beginning balance + charges – credits
        int newBalance = startBalance + charges - credits;

        System.out.println("\nAccount: " + accountNum);
        System.out.println("New Balance: " + newBalance);

        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Within credit limit.");
        }
        sc.close();
    }
}
