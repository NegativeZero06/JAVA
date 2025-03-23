import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        int sum = 0; // Variable to store sum of divisors

        // Finding sum of all proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Checking if 'i' is a divisor
                sum += i; // Adding divisor to sum
            }
        }

        // Checking if sum of divisors is greater than the number itself
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        // Closing Scanner object
        input.close();
    }
}
