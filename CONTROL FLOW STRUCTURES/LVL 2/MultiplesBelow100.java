import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Multiples of " + number + " below 100 are:");

        // Looping to find multiples of the number below 100
        for (int i = 1; number * i < 100; i++) {
            System.out.print((number * i) + " "); // Printing multiples
        }

        // Closing Scanner object to free memory
        input.close();
    }
}
