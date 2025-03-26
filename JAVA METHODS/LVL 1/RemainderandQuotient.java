import java.util.Scanner;

public class RemainderandQuotient
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
		RemainderandQuotient rq=new RemainderandQuotient();
		
		//USER INPUT:
		System.out.print("Enter Divisor: ");
		int DIVISOR=input.nextInt();
		
		System.out.print("Enter 1st Number: ");
		int NUMBER1=input.nextInt();
		System.out.print("Enter 2nd Number: ");
		int NUMBER2=input.nextInt();
		
		int[] array={NUMBER1,NUMBER2};
		
		//PRINTING:
		System.out.println("\nDISPLAYING DETAILS: ");
		System.out.println("NUMBER 1: "+array[0]);
		int[] remquo1=rq.findRemainderAndQuotient(array[0],DIVISOR);
		System.out.println("QUOTIENT: "+remquo1[0]);
		System.out.println("REMAINDER: "+remquo1[1]);
		
		System.out.println("\nNUMBER 2: "+array[1]);
		int[] remquo2=rq.findRemainderAndQuotient(array[1],DIVISOR);
		System.out.println("QUOTIENT: "+remquo2[0]);
		System.out.println("REMAINDER: "+remquo2[1]);
		
		input.close();
	}
}