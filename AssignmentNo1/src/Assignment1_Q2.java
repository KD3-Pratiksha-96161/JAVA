import java.util.Scanner;

public class Assignment1_Q2 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        if (sc.hasNextDouble()) {
	            double n1 = sc.nextDouble();
	            
	            System.out.print("Enter second number: ");
	            if (sc.hasNextDouble()) {
	                double n2 = sc.nextDouble();
	                double avg = (n1 + n2) / 2.0;
	                System.out.println("Average: " + avg);
	            } 
	            else 
	            {
	          
	                System.out.println("Error: Second input is not a double. Terminating.");
	            }
	        }
	        else 
	        {
	            System.out.println("Error: First input is not a double. Terminating.");
	        }

	        sc.close();
	    }
	}
