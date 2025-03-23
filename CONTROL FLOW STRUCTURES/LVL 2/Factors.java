import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter The Number: ");
        int number = input.nextInt();

        // Checking if number is positive
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i + " is a factor of " + number);
                }
            }
        } else {
            System.out.println("Factors of " + number + " cannot be found.");
        }

        // Closing Scanner object
        input.close();
    }
}
