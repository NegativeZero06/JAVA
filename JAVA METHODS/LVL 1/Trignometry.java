import java.util.Scanner;

public class Trignometry
{
	//User Defined Method to Calculate Wind Chill
	public double[] calculateTrignometricFunctions(double angle)
	{
		double r=Math.PI*(angle/180);
		double[] radians={angle,r};
		return radians;
	}
	
	//Main() Method
	public static void main(String[] args)
	{
		//Creating Objects
		Scanner input=new Scanner(System.in);
		Trignometry tr=new Trignometry();
		
		//USER INPUT:
		System.out.print("Enter Angle: ");
		double ANGLE=input.nextDouble();
		
		System.out.printf("180 degrees= %.5f radians \n", Math.PI);
		
		double[] angles=tr.calculateTrignometricFunctions(ANGLE);
		//PRINTING:
		System.out.println("\n\nPRINTING DETAILS: ");
		System.out.printf("Given angle %.3f degrees\n",angles[0]);
		System.out.printf("Given angle in radians: %.3f ",angles[1]);
		System.out.println("");
		
		input.close();
	}
}