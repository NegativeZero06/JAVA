	import java.util.Scanner;

	public class FactorFinder 
	{
		public static void main(String[] args) 
		{
			Scanner input = new Scanner(System.in);

			// Taking user input
			System.out.print("Enter a number: ");
			int number = input.nextInt();

			// Initialize factor storage
			int maxFactor = 10; // Initial array size
			int[] factors = new int[maxFactor];
			int index = 0; // Tracks the number of factors stored

			// Find factors of the number
			for (int i = 1; i <= number; i++) 
			{
				if (number % i == 0) 
				{ // Check if 'i' is a factor
					if (index == maxFactor) 
					{ // If array is full, expand it manually
						maxFactor *= 2; // Double the array size
						int[] temp = new int[maxFactor]; // Create a new larger array
						
						// Manually copy elements from old to new array
						for (int j = 0; j < factors.length; j++) 
						{
							temp[j] = factors[j];
						}
						
						factors = temp; // Assign the expanded array
					}
					factors[index++] = i; // Store factor and increment index
				}
			}

			// Display factors
			System.out.println("\nFactors of " + number + ":");
			for (int i = 0; i < index; i++) 
			{
				System.out.print(factors[i] + " ");
			}

			input.close();
		}
	}
