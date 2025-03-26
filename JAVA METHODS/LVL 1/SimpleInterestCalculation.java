import java.util.Scanner;

class SimpleInterestCalculation
{
	//User Defined Method to calculate Simple Interest 
	public double SimpleInterest(double p,double r,int t)
	{
		return (p*r*t/100);
	}


	public static void main(String[] args)
	{
		SimpleInterestCalculation si=new SimpleInterestCalculation();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Principle Amount(INR.): ");
		double principle=input.nextDouble();
		System.out.print("Enter Rate of Interest(p.p.a): ");//p.p.a=percent per annum
		double rate=input.nextDouble();
		System.out.print("Enter Time Period(in yrs):");
		int time=input.nextInt();
		
		//Creating Variable to store Simple Interest
		double SI=si.SimpleInterest(principle,rate,time);
		
		System.out.println("\n\nDisplaying Details: ");
		System.out.println("PRINCIPLE: INR."+principle);
		System 	.out.println("RATE OF INTEREST: %"+(rate/100));
		System.out.println("TIME PERIOD: "+time+" years");
		System.out.println("SIMPLE INTEREST: INR."+SI);
		input.close();
	}
}