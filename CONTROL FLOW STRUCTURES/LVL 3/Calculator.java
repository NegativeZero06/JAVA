import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user to enter two numbers
        System.out.print("Enter Number 1: ");
        double first = input.nextDouble();
        System.out.print("Enter Number 2: ");
        double second = input.nextDouble();

        // Asking user to enter an operator
        System.out.print("Enter Operator (+, -, *, /): ");
        String op = input.next();

        // Performing the operation based on user input
        switch (op) {
            case "+":
                System.out.println(first + " + " + second + " = " + (first + second));
                break;
            case "-":
                System.out.println(first + " - " + second + " = " + (first - second));
                break;
            case "*":
                System.out.println(first + " * " + second + " = " + (first * second));
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Division by 0 is not allowed.");
                } else {
                    System.out.println(first + " / " + second + " = " + (first / second));
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }

        // Closing Scanner object
        input.close();
    }
}
