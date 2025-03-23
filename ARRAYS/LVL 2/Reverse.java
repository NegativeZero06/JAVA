import java.util.Scanner;

public class Reverse
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number:");
		int number=input.nextInt();
		
		//Counting Digits
		int t=number;//Temporary Variable
		int count=0;//Number of Digits
		while(t>0)
		{
			count++;
			t/=10;
		}
		
		System.out.println("Count:"+count);
		t=number;
		//Creating Array to store reverse of number
		int[] Reverse=new int[count];
		for(int i=0;i<count;i++)
		{
			Reverse[i]=t%10;
			t/=10;
		}
		
		//Displaying
		for(int i=0;i<count;i++)
		{
			System.out.print(Reverse[i]);
		}
		
		input.close();
	}
}