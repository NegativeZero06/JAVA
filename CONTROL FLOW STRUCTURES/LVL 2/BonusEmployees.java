import java.util.Scanner;

public class BonusEmployees {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Asking for employee details
        System.out.print("Enter Employee's Years of Service: ");
        int yearsOfService = input.nextInt();
        System.out.print("Enter Salary of the Employee: ");
        double salary = input.nextDouble();

        // Checking if employee is eligible for bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            salary += bonus;
            System.out.println("Bonus Amount: " + bonus);
            System.out.println("New Salary: " + salary);
        } else {
            System.out.println("No bonus for the employee.");
            System.out.println("Salary: " + salary);
        }

        // Closing Scanner object to free memory
        input.close();
    }
}
