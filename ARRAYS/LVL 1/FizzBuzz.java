import java.util.Scanner;

class FizzBuzz
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	System.out.print("Enter Number:");
	int number=input.nextInt();
	
	//Creating a String Variable
	String[] text=new String[number+1];
	if(number>0)
	{
		for(int i=0;i<=number;i++)
		{
			if(i%15==0)
			{
				text[i]="FizzBuzz";
			}
			else if(i%5==0)
			{
				text[i]="Buzz";
			}
			else if(i%3==0)
			{
				text[i]="Fizz";
			}
			else
			{
				text[i]=i+" ";//TypeCasting
			}
		}
		
		//Displaying
		for(int i=0;i<=number;i++)
		{
			System.out.println(i+" : "+text[i]);
		}
	}
	else
	{
		System.out.println("Please Enter A Positive Number.");
	}
	input.close();
}
}