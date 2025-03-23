import java.util.Scanner;
class MultiplicationTable
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a NUMBER:");
		int number=input.nextInt();
		
		int[] mularray=new int[10];
		
		//Storing Values in Array:
		for(int i=0;i<10;i++)
		{
			mularray[i]=number*(i+1);
		}
		//Printing Multiplication Table till 10
		for(int i=0;i<10;i++)
		{
			System.out.println(number+" * "+(i+1)+" ="+mularray[i]);
		}
		input.close();
	}
}