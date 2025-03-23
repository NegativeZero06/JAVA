import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Asking the user to enter a number
        System.out.print("Enter Integer: ");
        int number = input.nextInt();

        // Checking if the number is positive (natural number)
        if (number > 0) {
            // Using formula to calculate sum of first 'n' natural numbers
            int sumOfNumbers = (number * (number + 1)) / 2;
            System.out.println(number + " is a Natural Number.");
            System.out.println("Sum of all Natural Numbers up to " + number + " is " + sumOfNumbers);
        } else {
            System.out.println(number + " is not a Natural Number.");
        }

        // Closing Scanner to free memory
        input.close();
    }
}
