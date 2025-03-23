import java.util.Scanner;

public class MultiplicationTableSixToNine 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Array to store multiplication results
        int[] multiplicationResult = new int[4]; 

        // Calculate multiplication table from 6 to 9
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i+6);
        }

        // Display the results
        System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
        for (int i = 0; i < 4; i++) 
		{
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        input.close();
    }
}
