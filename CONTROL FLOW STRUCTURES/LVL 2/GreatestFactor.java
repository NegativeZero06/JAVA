import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for input
        System.out.print("Enter Number: ");
        int number = input.nextInt();
        
        int greatestFactor = 1; // Variable to store the greatest factor

        // Looping from number - 1 down to 1 to find the largest factor
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) { // Checking divisibility
                greatestFactor = i; // Assigning the largest factor found
                break; // Breaking out of loop after finding the largest factor
            }
        }

        // Printing the greatest factor
        System.out.println("Greatest Factor of " + number + " is: " + greatestFactor);

        // Closing Scanner object to free memory
        input.close();
    }
}
