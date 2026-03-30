package assignment2_Q1;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv = new Invoice("P101", "Keyboard", 2, 500);

        System.out.println("Part Number: " + inv.getPartNumber());
        System.out.println("Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price per item: " + inv.getPricePerItem());

        System.out.println("Total Invoice Amount: " + inv.getInvoiceAmount());
    }
}