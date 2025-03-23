import java.util.Scanner;
class VotingAge
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int[] age=new int[10];
		System.out.println("Enter Age of all the Students: ");
		for(int i=0;i<10;i++)
		{
			System.out.print("Student "+(i+1)+": ");
			age[i]=input.nextInt();
		}
		
		//Checking Voting Eligibility
		for(int i=0;i<10;i++)
		{
			if(age[i]>=18)
			{
				System.out.println("The STUDENT with the Age: "+age[i]+" can VOTE.");
			}
			else
			{
				System.out.println("The STUDENT cannot VOTE.");
			}
		}
		input.close();
	}
}