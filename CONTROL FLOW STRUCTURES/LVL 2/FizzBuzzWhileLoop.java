import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking for user input
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        int i = 0;

        if (number >= 0) {
            while (i <= number) {
                if (i % 15 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Cannot Print.");
        }

        // Closing Scanner object
        input.close();
    }
}
