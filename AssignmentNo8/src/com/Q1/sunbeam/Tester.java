package com.sunbeam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;



//  Stack Interface
interface Stack {
    int STACK_SIZE = 5;
    void push(Employee emp);
    Employee pop();
}

// Fixed Stack Implementation using Deque
class FixedStack implements Stack {
    private Deque<Employee> deque = new ArrayDeque<>(STACK_SIZE);

    @Override
    public void push(Employee emp) {
        if (deque.size() < STACK_SIZE) {
            deque.push(emp);
            System.out.println("Employee added to Fixed Stack.");
        } else {
            System.out.println("Error: Fixed Stack Overflow!");
        }
    }

    @Override
    public Employee pop() {
        if (deque.isEmpty()) {
            System.out.println("Error: Fixed Stack Underflow!");
            return null;
        }
        return deque.pop();
    }
}

// Growable Stack Implementation using Deque
class GrowableStack implements Stack {
    // ArrayDeque is resizable by default
    private Deque<Employee> deque = new ArrayDeque<>();

    @Override
    public void push(Employee emp) {
        deque.push(emp);
        System.out.println("Employee added to Growable Stack.");
    }

    @Override
    public Employee pop() {
        if (deque.isEmpty()) {
            System.out.println("Error: Growable Stack Underflow!");
            return null;
        }
        return deque.pop();
    }
}

// Tester Class
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack ref = null; 
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Choose Fixed Stack\n2. Choose Growable Stack\n3. Push Data\n4. Pop Data\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (ref == null) ref = new FixedStack();
                    else System.out.println("Stack selection cannot be changed!");
                    break;

                case 2:
                    if (ref == null) ref = new GrowableStack();
                    else System.out.println("Stack selection cannot be changed!");
                    break;

                case 3:
                    if (ref != null) {
                        System.out.print("Enter ID, Name, Salary: ");
                        ref.push(new Employee(sc.nextInt(), sc.next(), sc.nextDouble()));
                    } else {
                        System.out.println("Error: NO stack chosen !!!");
                    }
                    break;

                case 4:
                    if (ref != null) {
                        Employee e = ref.pop();
                        if (e != null) System.out.println("Popped: " + e);
                    } else {
                        System.out.println("Error: NO stack chosen !!!");
                    }
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
