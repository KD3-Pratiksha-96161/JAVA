package assignment2_Q3;

public class DateTest {
    public static void main(String[] args) {
        Date today = new Date(12, 25, 2024);
        
        System.out.print("The date is: ");
        today.displayDate();

   
        today.setMonth(1);
        today.setDay(1);
        today.setYear(2025);

        System.out.print("The updated date is: ");
        today.displayDate();
    }
}
