import java.util.Scanner;

public class Chocolates
{
	public static int[] findRemainderAndQuotient(int number, int divisor) 
	{
		int[] numbers={number/divisor,number%divisor};
		return numbers;
	}
	
	public static void main(String[] args)
	{
		//Creating Objects
		Scanner input=new Scanner(System.in);
		Chocolates ch=new Chocolates();
		
		//USER INPUT:
		System.out.print("Enter Number of Children: ");
		int nochildren=input.nextInt();
		
		System.out.print("Enter Number of Chocolates: ");
		int chocolates=input.nextInt();
	
		//PRINTING:
		System.out.println("\nDISPLAYING DETAILS: ");
		System.out.println("NUMBER OF CHOCOLATES: "+chocolates);
		System.out.println("NUMBER OF CHILDREN: "+nochildren);
		int[] distribution=ch.findRemainderAndQuotient(chocolates,nochildren);
		System.out.println("Number of Chocolates each child gets: "+distribution[0]);
		System.out.println("Remaining Undistributed Chocolates: "+distribution[1]);
		
		input.close();
	}
}