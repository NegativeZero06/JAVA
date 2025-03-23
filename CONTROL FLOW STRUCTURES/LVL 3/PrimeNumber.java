import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        boolean isPrime = true;

        // Checking if the number is greater than 1
        if (number > 1) {
            // Looping from 2 to number-1 to check divisibility
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }

        // Displaying if the number is prime or not
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Closing Scanner object
        input.close();
    }
}
