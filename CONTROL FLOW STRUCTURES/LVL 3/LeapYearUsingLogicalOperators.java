import java.util.Scanner;

public class LeapYearUsingLogicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to enter a year
        System.out.print("Enter Year: ");
        int year = input.nextInt();

        // Using a single if statement with logical operators
        if ((year >= 1582 && year % 100 == 0 && year % 400 == 0) || 
            (year >= 1582 && year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " is a LEAP YEAR.");
        } else {
            System.out.println(year + " is not a LEAP YEAR.");
        }

        // Closing Scanner object
        input.close();
    }
}
