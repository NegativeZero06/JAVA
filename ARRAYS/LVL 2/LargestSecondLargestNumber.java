import java.util.Scanner;

public class LargestSecondLargestNumber
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number:");
		int Number=input.nextInt();
		
		//Creating a variable to set the size of Digits Array
		int maxDigits=10;
		
		//Temporary Variable to store the Number
		int t=Number;
		int count=0;
		//Creating DIGITS Array
		int[] Digits=new int[maxDigits];
		
		//Setting the Digits Array
		for(int index=0;index<=maxDigits;index++)
		{
			if(index==maxDigits)
			{
				break;
			}
			else
			{
				
				 while (t>0 && count<maxDigits) 
				 {
					Digits[count]=t%10;
					t/=10;
					count++;
				 }
			}
		}
		
		// Initialize variables
		int Largest=-1,SecondLargest=-1;//Incase where 0 is the largest number

		// Find Largest and Second Largest Digit
		for(int i=0;i<count;i++) 
		{
			if (Digits[i]>Largest) 
			{
				SecondLargest=Largest; 
				Largest = Digits[i];   
			} 
			else if (Digits[i]>SecondLargest &&Digits[i]<Largest) 
			{
				SecondLargest=Digits[i]; 
			}
			else
			{
				continue;
			}
		}
		
		 System.out.println("Number: " + Number);
         System.out.println("Largest Digit: " + Largest);
         if(SecondLargest==-1) 
		 {
            System.out.println("No Second Largest Digit Found.");
         } 
		 else 
		 {
            System.out.println("Second Largest Digit: " +SecondLargest);
         }
		 input.close();
	}
}
