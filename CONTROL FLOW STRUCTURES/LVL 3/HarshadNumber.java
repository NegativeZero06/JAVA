import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        int sum = 0; // Variable to store sum of digits
        int temp = number; // Temporary variable for calculations

        // Extracting digits and computing sum
        while (temp > 0) {
            int digit = temp % 10; // Extract last digit
            sum += digit; // Add digit to sum
            temp /= 10; // Remove last digit
        }

        // Checking if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        // Closing Scanner object
        input.close();
    }
}
