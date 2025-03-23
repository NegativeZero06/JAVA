import java.util.Scanner;
class FiveNumbers
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int[] numbers=new int[5];
		//Enter Numbers:
		for(int i=0;i<5;i++)
		{
			System.out.print("Number "+(i+1)+":");
			numbers[i]=input.nextInt();
			System.out.println("");
		}
		
		//Checking Conditions
		for(int i=0;i<5;i++)
		{
			if(numbers[i]!=0)
			{
				if(numbers[i]>0)
				{
					System.out.println(numbers[i]+" is POSITIVE.");
					System.out.println("");
				}
				else
				{
					System.out.println(numbers[i]+" is NEGATIVE.");
					System.out.println("");
				}
			}
			else
			{
				System.out.println(numbers[i]+" is ZERO.");
				System.out.println("");
			}
		}
		
			System.out.println("First Number: "+numbers[0]);
			System.out.println("Last Number: "+numbers[4]);
			if(numbers[0]!=numbers[4])
			{
				if(numbers[0]>numbers[4])
				{
					System.out.println("The First Element is greater than the Last Element");
				}
				else
				{
					System.out.println("The First Element is lesser than the Last Element");
				}
			}
			else
			{
				System.out.println("The First Element is equal to the Last Element");
			}
		
	input.close();
	}
}