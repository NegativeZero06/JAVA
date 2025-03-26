import java.util.Scanner;

public class SmallestLargest
{
	public static int[] findSmallestandLargest(int number1,int number2,int number3)
	{
		int[] number={number1,number2,number3};
		//Sorting the Array of 3 Numbers..
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2-i;j++)
			{
				if(number[i]>number[i+1])//SWAPPING:
				{
					int t=number[i];
					number[i]=number[i+1];
					number[i+1]=t;
				}
			}
		}
		return number;
	}
	
	public static void main(String[] args)
	{
		//Creating Objects
		Scanner input=new Scanner(System.in);
		SmallestLargest sl=new SmallestLargest();
		
		//USER INPUT:
		System.out.print("Enter 1st Number: ");
		int n1=input.nextInt();
		System.out.print("Enter 2nd Number: ");
		int n2=input.nextInt();
		System.out.print("Enter 3rd Number: ");
		int n3=input.nextInt();
		
		int[] array=sl.findSmallestandLargest(n1,n2,n3);
		
		int largestnumber=array[2];
		int smallestnumber=array[0];
		
		//PRINTING:
		System.out.println("\nDISPLAYING DETAILS: ");
		System.out.println("Largest Number among the 3 Numbers is: "+largestnumber);
		System.out.println("Smallest Number among the 3 Number is: "+smallestnumber);
		
		input.close();
	}
}