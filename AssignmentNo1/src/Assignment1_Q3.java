import java.util.Scanner;

class FoodMenu {
	int quantity;
	double totalBill;

}

public class Assignment1_Q3 {
	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int quantity;
		        int choice;  
		        double totalBill = 0;

		        do {
		            // 1. Display Food Menu
		            System.out.println("\n MENU ");
		            System.out.println("1. Dosa - Rs. 50");
		            System.out.println("2. Samosa - Rs. 20");
		            System.out.println("3. Idli - Rs. 40");
		            System.out.println("4. Tea - Rs. 10");
		            System.out.println("5. Coffe - Rs. 10");
		            System.out.println("6. Poha  - Rs. 30");
		            System.out.println("7. Maggie - Rs. 50");
		            System.out.println("8. Dahi vada - Rs. 20");
		            System.out.println("9. Dhokala - Rs. 40");
		            System.out.println("10. Generate Bill");
		            System.out.print("Select an item: ");
		            choice = sc.nextInt();

		            if (choice >= 1 && choice <= 9) {
		                System.out.print("Enter quantity: ");
		                quantity = sc.nextInt();

		                
		                switch (choice) {
		                    case 1: 
		                    	totalBill += 50 * quantity; 
		                    	break;
		                    case 2: 
		                         totalBill += 20 * quantity; 
		                        break;
		                    case 3:
		                    	totalBill += 40 * quantity; 
		                    	break;
		                    case 4: 
		                    	totalBill += 10 * quantity; 
		                        break;
		                    case 5:
		                    	totalBill += 10* quantity;
		                    	break;
		                    case 6:
		                    	totalBill += 30* quantity;
		                    	break;
		                    case 7:
		                    	totalBill += 50* quantity;
		                    	break;
		                    case 8:
		                    	totalBill += 20* quantity;
		                    	break;
		                    case 9:
		                    	totalBill += 40* quantity;
		                    	break;
		                }
		            } 
		            else if (choice != 10) {
		                System.out.println("Invalid choice! Please try again.");
		            }

		        } while (choice != 10);

		        // 3. Display Total Bill & Exit
		        System.out.println("\nGenerating Bill...");
		        System.out.println("Total Amount to Pay: Rs. " + totalBill);
		        System.out.println("Exit.");
		        sc.close();
		    }


	}

