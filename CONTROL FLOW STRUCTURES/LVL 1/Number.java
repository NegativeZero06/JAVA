import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter Integer: ");
        int number = input.nextInt();

        // Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is POSITIVE.");
        } else if (number < 0) {
            System.out.println(number + " is NEGATIVE.");
        } else {
            System.out.println(number + " is ZERO.");
        }

        // Closing Scanner to free memory
        input.close();
    }
}
