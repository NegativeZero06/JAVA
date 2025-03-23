import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter Integer: ");
        int number = input.nextInt();

        // Checking if the number is between 6 and 9
        if (number >= 6 && number <= 9) {
            System.out.print("Enter Number till which Multiplication Table is to be displayed: ");
            int lastNumber = input.nextInt();

            // Printing multiplication table
            for (int i = 1; i <= lastNumber; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        } else {
            System.out.println("Multiplication table for " + number + " cannot be displayed.");
        }

        // Closing Scanner object
        input.close();
    }
}
