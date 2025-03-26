import java.util.Scanner;

public class PositiveNegativeZero
{
	public int Number(int n)
	{
		if(n!=0)//Checking if Number is equal or not equal to 0
		{
			if(n>0)
			{
				return 1;//Number is Positive
			}
			else
			{
				return -1;//Number is Negative
			}
		}
		else
		{
			return 0;//Number is 0
		}
	}
	
	//Main() method
	public static void main(String[] args)
	{
		//Creating Objects
		Scanner input=new Scanner(System.in);
		PositiveNegativeZero no=new PositiveNegativeZero();
		
		//USER INPUT:
		System.out.print("Enter Number: ");
		int Number=input.nextInt();
		
		//Calling Method
		int status=no.Number(Number);
		
		//DISPLAYING:
		System.out.print("\n\nDETAILS: ");
		if(status==0)
		{
			System.out.println(Number+" is ZERO.");
		}
		else if(status==1)
		{
			System.out.println(Number+" is POSITIVE.");
		}
		else
		{
			System.out.println(Number+" is NEGATIVE.");
		}
		input.close();
	}
}