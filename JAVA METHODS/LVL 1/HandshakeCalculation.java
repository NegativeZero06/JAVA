import java.util.Scanner;

public class HandshakeCalculation
{
	//User Defined Method to Calculate the Number of Handshakes from the Number of Students
	public int Handshakes(int nos)
	{
		return(nos*nos/2);
	}
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		HandshakeCalculation hc=new HandshakeCalculation();
		System.out.print("Enter Number of Students in the class: ");
		int StudentNumber=input.nextInt();
		int HandshakeNumber=hc.Handshakes(StudentNumber);
		
		System.out.println("\nDETAILS: ");
		System.out.println("Number of Students in Class: "+StudentNumber);
		System.out.println("Total Number of Handshakes: "+HandshakeNumber);
		input.close();
	}
}