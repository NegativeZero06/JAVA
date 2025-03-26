import java.util.Scanner;

public class SpringSeason
{
	//User Defined Method to Check if the given day of the month and the respective month of the year is a Spring Season
	public boolean IsSpringSeason(int d,int m)
	{
		boolean ss=false;//boolean data type used for returning output
		
			if(m<3||m>6)//Checking if the given month of the year lies in between March and June
			{
				ss=false;//It does not.......
			}
			else//It does...
			{
				switch(m)//Using Selection Statement to tackle each case
				{
					case 3:if(d<20||d>31)//Checking if the entered day of the month is valid or if it lies in the desired range
							{
								ss=false;//it does not.....
							}
							else//it does...
							{
								ss=true;
							}
					break;//end of MARCH
					
					case 4:if(d<0||d>30)
							{
								ss=false;
							}
							else
							{
								ss=true;
							}
					break;//end of APRIL
					
					case 5:if(d<0||d>31)
							{
								ss=false;
							}
							else
							{
								ss=true;
							}
					break;//end of MAY
					
					case 6:if(d>20)
							{
							  ss=false;
							}
							else
							{
								ss=true;
							}
					break;//end of JUNE
				}
			}//end of SWITCH
		return ss;
	}//end of USER DEFINED METHOD
	
	public static void main(String[] args)
	{
		//Creating objects
		Scanner input=new Scanner(System.in);
		SpringSeason SS=new SpringSeason();
		
		//USER INPUT:
		System.out.print("Enter Month of the Year: ");
		int mnth=input.nextInt();
		
		System.out.print("Enter Day of the Month: ");
		int day=input.nextInt();
		
		//DISPLAYING: 
		System.out.println("\nDISPLAYING DETAILS:");
		if(SS.IsSpringSeason(day,mnth))
		{
			System.out.println("It is a Spring Season.");
		}
		else
		{
			System.out.println("It is not a Spring Season.");
		}
		input.close();
	}
}