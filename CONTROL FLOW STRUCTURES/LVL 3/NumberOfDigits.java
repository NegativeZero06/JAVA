import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        int count = 0, temp = number;

        // Looping through each digit and counting
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Displaying the number of digits
        System.out.println(number + " is a " + count + "-digit number.");

        // Closing Scanner object
        input.close();
    }
}
