import java.util.Scanner;

public class FrequencyDigits
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number:");
		int Number=input.nextInt();
		
		//Creating Temporary Variable 
		int t=Number;
		
		//Creating a Variable to Store the Number of Digits
		int count=0;
		
		//Counting the Number of Digits of the Number
		while(t>0)
		{
			count++;
			t/=10;
		}
		
		//Creating an Array to Store the Digits of The Number
		int[] Digits=new int[count];
		
		t=Number;
		//Storing Digits into the Array
		for(int i=0;i<count;i++)
		{
			Digits[i]=t%10;
			t/=10;
		}
		
		//Before Sorting the Array:
		System.out.println("Digits of the Number "+Number+" :");
		for(int i=0;i<count;i++)
		{
			System.out.print(Digits[i]+" ");
		}
		
		//Creating an Array to store the frequency of digits
		int[] frequency=new int[count];
		
		//Sorting the Digits Array
		for(int i=0;i<count-1;i++) 
		{
            for (int j=0;j<count-1-i;j++) 
			{
                if(Digits[j]>Digits[j+1]) 
				{
                    // Swap Digits[j] and Digits[j+1]
                    int temp=Digits[j];
                    Digits[j]=Digits[j+1];
                    Digits[j+1]=temp;
                }
            }
        }
		
		//Working on the Frequency Array
        int currentDigit=Digits[0],FREQUENCY=1,startIndex=0;
        for (int i = 1; i <= count; i++) 
		{
            if (i<count && Digits[i]==currentDigit) 
			{
                FREQUENCY++;
            } 
			else 
			{
                // Fill frequency for all occurrences of the digit
                for (int j=startIndex;j<i;j++) 
				{
                    frequency[j]=FREQUENCY;
                }
                // Reset for next digit
                if (i<count) 
				{
                    currentDigit=Digits[i];
                    FREQUENCY=1;
                    startIndex=i;
                }
			}
		}
		
		System.out.println("Digits of the Number and its Frequencies:");
		for(int i=0;i<count;i++)
		{
			System.out.println("Digit "+(i+1)+" :"+Digits[i]+"------>"+frequency[i]);
		}
		input.close();
	}
}