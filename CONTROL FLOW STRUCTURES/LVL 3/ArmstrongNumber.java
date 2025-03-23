import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        int sum = 0, temp = number;

        // Looping through each digit and calculating the sum of cubes
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }

        // Checking if sum of cubes equals the original number
        if (number == sum) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        // Closing Scanner object
        input.close();
    }
}
