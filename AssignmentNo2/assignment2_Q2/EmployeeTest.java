package assignment2_Q2;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Pratiksha", "Patil", 20000);
        Employee e2 = new Employee("Rahul", "Sharma", 25000);

        System.out.println("Yearly Salary of Employee 1: " + e1.getYearlySalary());
        System.out.println("Yearly Salary of Employee 2: " + e2.getYearlySalary());

        // 10% raise
        e1.setMonthlySalary(e1.getMonthlySalary() * 1.10);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.10);

        System.out.println("\nAfter 10% Raise:");

        System.out.println("Updated Yearly Salary of Employee 1: " + e1.getYearlySalary());
        System.out.println("Updated Yearly Salary of Employee 2: " + e2.getYearlySalary());
    }
}
