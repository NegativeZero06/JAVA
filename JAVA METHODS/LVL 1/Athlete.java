import java.util.Scanner;

public class Athlete
{
	//USER DEFINED METHODS:
	public int rounds(double p)
	{
		int rnds=(int)Math.ceil(5000/p);
		return rnds;
	}
	
	public static void main(String[] args)
	{
		//CREATING OBJECTS:
		Scanner input=new Scanner(System.in);
		Athlete r=new Athlete();
		
		//USER INPUT:
		System.out.print("Enter Side 1(in mtrs): ");
		double side1=input.nextDouble();
		System.out.print("Enter Side 2(in mtrs): ");
		double side2=input.nextDouble();
		System.out.print("Enter Side 3(in mtrs): ");
		double side3=input.nextDouble();
		
		double perimeter=side1+side2+side3;
		
		int ROUNDS=r.rounds(perimeter);
		
		//PRINTING:
		System.out.println("\nDETAILS: ");
		System.out.println("SIDE 1 of PARK: "+side1+" mtrs");
		System.out.println("SIDE 2 of PARK: "+side2+" mtrs");
		System.out.println("SIDE 3 of PARK: "+side3+" mtrs");
		
		System.out.printf("Perimeter of PARK: %.2f meters\n",perimeter);
		System.out.println("Mininum Number of Rounds the Athlete has to run to complete 5 kms: "+ROUNDS);
		input.close();
	}
}