import java.util.Scanner;

public class SumofNaturalNumbers
{
	//User defined method to calculate Sum of all Natural Numbers till entered Number.
	public int Sum(int n)
	{
		int s=0;//To Store the Sum
		while(n>0)
		{
			s+=n;//Updating the Sum 
			n--;//Decreasing till it reached 1 after which control exits loop
		}
		return s;//returning value
	}
	
	//Main() Method
	public static void main(String[] args)
	{
		//Creating Objects
		Scanner input=new Scanner(System.in);
		SumofNaturalNumbers sum=new SumofNaturalNumbers();
		
		//USER INPUT:
		System.out.print("Enter a Number whose sum is to be calculated: ");
		int NUMBER=input.nextInt();
		
		System.out.print("\n\nDETAILS: ");
		//Calling Method and PRINTING
		System.out.println("Sum of all Natural Number till "+NUMBER+" is: "+sum.Sum(NUMBER));
		input.close();
	}
}