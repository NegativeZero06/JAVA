import java.util.Scanner;

public class BmiMultiDimensionalArray
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number of Persons: ");
		int number=input.nextInt();
		
		//Creating Arrays
		 double[][] personData=new double[number][3];
         String[] weightStatus=new String[number];

		//Entering Data into the Arrays
		for(int i=0;i<number;i++)
		{
			System.out.println("\nPERSON "+(i+1)+": ");
			System.out.print("Enter Weight of Person "+(i+1)+"(in kgs):" );
			personData[i][0]=input.nextDouble();
			System.out.print("Enter Height of Person "+(i+1)+"(in cms):" );
			personData[i][1]=input.nextDouble();
			if(personData[i][0]<0 || personData[i][1]<0)
			{
				System.out.print("Enter Details again");
				i--;
				continue;
			}
		}
		
		//Calculating BMI
		for(int i=0;i<number;i++)
		{
			personData[i][2]=personData[i][0]/((personData[i][1]/100)*(personData[i][1]/100));
		}
		
		System.out.println("\n\nDETAILS:");
		for(int i=0;i<number;i++)
		{
			System.out.println("PERSON "+(i+1)+":");
			System.out.println("WEIGHT-->"+personData[i][0]);
			System.out.println("HEIGHT-->"+personData[i][1]);
			System.out.println("BMI-->"+personData[i][2]);
		}
		input.close();
	}
}