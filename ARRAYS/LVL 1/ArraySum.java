import java.util.Scanner;

public class ArraySum
{
    public static void main(String[] args) 
	{
        double[] numbers = new double[10]; // Array to store up to 10 numbers
        double total = 0.0; // Variable to store the sum
        int index = 0; // Index variable for array

        Scanner input = new Scanner(System.in);

        while (true) 
		{
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            if (num <= 0 || index == 10) 
			{
                break; // Stop if the number is 0 or negative, or if the array is full
            }

            numbers[index] = num; // Store the number in the array
            index++; // Move to the next index
        }

        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) 
		{
            System.out.print(numbers[i] + " ");
            total += numbers[i]; // Add each number to total
        }

        System.out.println("\nSum of numbers: " + total);
        input.close();
    }
}
