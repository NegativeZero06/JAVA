import java.util.Scanner;

class MeanHeight
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		double[] heights=new double[11];
		//Entering Elements of array
		for(int i=0;i<11;i++)
		{
			System.out.print("Player "+(i+1)+": ");
			heights[i]=input.nextDouble();
		}
		
		//Finding Sum of all Heights
		double sum=0.0;
		for(int i=0;i<11;i++)
		{
			sum+=heights[i];
		}
		
		double MeanHeight=sum/11;
		System.out.println("Mean Height of the Players on the Team is: "+MeanHeight);
		input.close();
	}
}