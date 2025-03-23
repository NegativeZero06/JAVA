import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking three numbers as input from the user
        System.out.print("Enter Number 1: ");
        int number1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        int number2 = input.nextInt();
        System.out.print("Enter Number 3: ");
        int number3 = input.nextInt();

        // Checking if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("First Number " + number1 + " is the smallest number.");
        } else {
            System.out.println("First Number " + number1 + " is not the smallest number.");
        }

        // Closing the Scanner object to free memory
        input.close();
    }
}
