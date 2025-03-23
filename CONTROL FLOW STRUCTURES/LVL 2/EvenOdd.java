import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Creating Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking if the number is even or odd using modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is EVEN.");
        } else {
            System.out.println(number + " is ODD.");
        }

        // Closing Scanner to free memory
        input.close();
    }
}
