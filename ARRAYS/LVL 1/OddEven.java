import java.util.Scanner;

class OddEven
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number:");
		int number=input.nextInt();
		if(number<=0)
		{
			System.out.println("Not a Natural Number.");
			input.close();
		}
		else
		{
			//Intialising size variable
			int size=number/2+1;
			
			//Creating Even and Odd Arrays
			int[] EvenArray=new int[size];
			int[] OddArray=new int[size];
			
			//Creating Index Variables for both the arrays:
			int e=0;
			int o=0;
			
			//Storing Numbers in respective arrays:
			for(int i=1;i<=number;i++)
			{
				if(i%2==0)
				{
					EvenArray[e]=i;
					e++;
				}
				else
				{
					OddArray[o]=i;
					o++;	
				}
			}
			
			
			//Printing OddArray
			System.out.println("ODD ARRAY:");
			for(o=0;o<size;o++)
			{
				System.out.println("Number "+(o+1)+":"+OddArray[o]);
			}
			
			//Printing EvenArray
			System.out.println("EVEN ARRAY:");
			for(e=0;e<size;e++)
			{
				System.out.println("Number "+(e+1)+":"+EvenArray[e]);
			}
			input.close();
		}
	}
	
}