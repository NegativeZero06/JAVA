import java.util.Scanner;

class BMI
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number of People in a Team:");
		int number=input.nextInt();
		
		//Creating Arrays
		double[] weight=new double[number];
		double[] height=new double[number];
		
		//Storing Values in Arrays
		System.out.println("Enter Weights of Person(in kgs):");
		for(int i=0;i<number;i++)
		{
			System.out.print("Weight of Person "+(i+1)+":");
			weight[i]=input.nextDouble();
		}
		System.out.println("Enter Heights of Person(in cms):");
		for(int i=0;i<number;i++)
		{
			System.out.print("Height of Person "+(i+1)+":");
			height[i]=input.nextDouble();
		}
		
		//Creating BMI Array
		double[] BMI=new double[number];
		
		for(int i=0;i<number;i++)
		{
			BMI[i]=weight[i]/((height[i]/100)*(height[i]/100));
		}
		
		//Displaying Details
		for(int i=0;i<number;i++)
		{
			System.out.println("Height of Player "+(i+1)+": "+height[i]);
			System.out.println("Weight of Player "+(i+1)+": "+weight[i]);
			System.out.println("BMI of Player "+(i+1)+": "+BMI[i]);
			if(BMI[i]<=18.4)
			{
				System.out.println("Status:Underweight.");
			}
			else if(BMI[i]>=18.5 && BMI[i]<=24.9)
			{
			System.out.println("Status:Normal.");
			}
			else if(BMI[i]>=25.0 && BMI[i]<=39.9)
			{
				System.out.println("Status:Overweight.");
			}
			else if(BMI[i]>=40.0)
			{
				System.out.println("Status:Obese.");
			}
			else
			{
				System.out.println("Invalid BMI.");
			}
		}
		input.close();
	}
}