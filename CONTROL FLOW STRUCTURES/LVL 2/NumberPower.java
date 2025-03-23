import java.util.Scanner;

public class NumberPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for base number and exponent
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        System.out.print("Enter the Power to which the Number is to be raised: ");
        int power = input.nextInt();

        int result = 1; // Initializing result to 1

        // Looping from 1 to power to calculate exponentiation manually
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiplying number repeatedly
        }

        // Printing the calculated power
        System.out.println(number + " Raised to the Power of " + power + " is: " + result);

        // Closing Scanner object to free memory
        input.close();
    }
}
