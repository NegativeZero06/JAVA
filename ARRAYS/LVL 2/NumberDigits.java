import java.util.Scanner;

class NumberDigits 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

       
        System.out.println("Enter Number: ");
        int Number = input.nextInt();

        
        int maxDigit = 10;
        int[] Digits = new int[maxDigit];

       
        int t = Number;
        int count = 0;
        while (t > 0 && count < maxDigit)
		{
            Digits[count] = t % 10;
            t /= 10;
            count++;
        }

      
        for (int i = 0; i < count - 1; i++) 
		{
            for (int j = 0; j < count - i - 1; j++) 
			{
                if (Digits[j] < Digits[j + 1]) 
				{ 
                    int temp = Digits[j];
                    Digits[j] = Digits[j + 1];
                    Digits[j + 1] = temp;
                }
            }
        }

        // Assign largest and second largest
        int LargestDigit = Digits[0];
        int SecondLargestDigit = -1;

        for (int i = 1; i < count; i++) 
		{
            if (Digits[i] < LargestDigit) 
			{
                SecondLargestDigit = Digits[i];
                break;
            }
        }

        // Output results
        System.out.println("For Number: " + Number);
        System.out.println("Largest Digit = " + LargestDigit);
        if (SecondLargestDigit == -1) {
            System.out.println("No Second Largest Digit Found.");
        } else {
            System.out.println("Second Largest Digit = " + SecondLargestDigit);
        }

        input.close();
    }
}
