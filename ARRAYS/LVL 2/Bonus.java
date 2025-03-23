import java.util.Scanner;

class Bonus
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		//Creating Arrays as required:
		double[] salary=new double[10];
		int[] yearsofservice=new int[10];
		double[] newsalary=new double[10];
		double[] bonusamount=new double[10];
		
		//Creating new variables:
		double totalbonus=0.0;
		double totaloldsalary=0.0;
		double totalnewsalary=0.0;
		
		//Loops:
			
		//Taking salary and yearsofservice
		for(int j=0;j<10;j++)
		{
			System.out.print("\nEnter Salary of Employee "+(j+1)+": ");
			salary[j]=input.nextDouble();
			System.out.print("Enter Number of Years of Service of Employee "+(j+1)+": ");
			yearsofservice[j]=input.nextInt();
		
			//Checking if input is valid or not:
			if(salary[j]<0.0||yearsofservice[j]<0)
			{
				System.out.println("Enter input again.");
				j--;
				continue;
			}
		}	
			//Calculating and Storing the Bonus of Employees:
			for(int i=0;i<10;i++)
			{
				if(yearsofservice[i]<5)
				{
					
					bonusamount[i]=0.02*salary[i];
				}
				else
				{
					bonusamount[i]=0.05*salary[i];
				}
			}
			
			//Computing New Salary of Employees:
			for(int i=0;i<10;i++)
			{
				newsalary[i]=salary[i]+bonusamount[i];
			}
			
			//Computing Total of old salaries:
			for(int i=0;i<10;i++)
			{
				totaloldsalary+=salary[i];
			}
			
			//Computing Total of new salaries:
			for(int i=0;i<10;i++)
			{
				totalnewsalary+=newsalary[i];
			}
			
			//Computing Total Bonus of all Employees:
			for(int i=0;i<10;i++)
			{
				totalbonus+=bonusamount[i];
			}
			
			
			
			//Displaying Details:
			
			System.out.println("\nOLD SALARIES:");
			for(int i=0;i<10;i++)
			{
				System.out.println("Employee "+(i+1)+": "+salary[i]);
			}
			
			System.out.println("\nBONUSES OF EMPLOYEES:");
			for(int i=0;i<10;i++)
			{
				System.out.println("Employee "+(i+1)+": "+bonusamount[i]);
			}
			
			System.out.println("\nNEW SALARIES:");
			for(int i=0;i<10;i++)
			{
				System.out.println("Employee "+(i+1)+": "+newsalary[i]);
			}
		
		
		input.close();
	}
}