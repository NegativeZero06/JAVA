import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to enter a year
        System.out.print("Enter Year: ");
        int year = input.nextInt();

        // Checking if the year is valid (Gregorian calendar started in 1582)
        if (year >= 1582) {
            // Checking Leap Year conditions
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a LEAP YEAR.");
                } else {
                    System.out.println(year + " is not a LEAP YEAR.");
                }
            } else {
                if (year % 4 == 0) {
                    System.out.println(year + " is a LEAP YEAR.");
                } else {
                    System.out.println(year + " is not a LEAP YEAR.");
                }
            }
        } else {
            System.out.println("Invalid Year Entered.");
        }

        // Closing Scanner object
        input.close();
    }
}
