import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Asking user to enter a number
        System.out.print("Enter Number: ");
        int number = input.nextInt();

        // Checking if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Number " + number + " is divisible by 5.");
        } else {
            System.out.println("Number " + number + " is not divisible by 5.");
        }

        // Closing the Scanner object to free memory
        input.close();
    }
}
