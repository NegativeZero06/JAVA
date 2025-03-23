import java.util.Scanner;

class StudentGrade
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number of Students in class: ");
		int StudentNumber=input.nextInt();
		
		//Taking Total Marks of Each Subject
		System.out.print("Total Marks in Physics: ");
		double physicstotalmarks=input.nextDouble();
		System.out.print("Total Marks in Chemistry: ");
		double chemistrytotalmarks=input.nextDouble();
		System.out.print("Total Marks in Maths: ");
		double mathstotalmarks=input.nextDouble();
		
		//Creating Grade Array
		String[] grade=new String[StudentNumber];
		
		//Creating Subject Arrays to store Marks
		double[] physicsmarks=new double[StudentNumber];
		double[] chemistrymarks=new double[StudentNumber];
		double[] mathsmarks=new double[StudentNumber];
		
		//Creating Percentage Array:
		double[] percentage=new double[StudentNumber];
		for(int i=0;i<StudentNumber;i++)
		{
			System.out.println("Student "+(i+1)+": ");
			System.out.print("Enter Physics Marks:");
			physicsmarks[i]=input.nextDouble();
			System.out.print("Enter Chemistry Marks:");
			chemistrymarks[i]=input.nextDouble();
			System.out.print("Enter Maths Marks:");
			mathsmarks[i]=input.nextDouble();
			
			if(physicsmarks[i]<0 || physicsmarks[i]>physicstotalmarks || chemistrymarks[i]<0 || chemistrymarks[i]>chemistrytotalmarks || mathsmarks[i]<0 || mathsmarks[i]>mathstotalmarks)
			{
				System.out.println("Invalid Marks Entered or the Marks Entered exceeds the Total Marks of the Subject.");
				System.out.println("Enter Values again.");
				i--;
				continue;
			}
			
			//Calculating Percentages Obtained:
			percentage[i]=((mathsmarks[i]+physicsmarks[i]+chemistrymarks[i])/(mathstotalmarks+physicstotalmarks+chemistrytotalmarks))*100;
			
			//Storing Grades
			if(percentage[i]>80.0)
			{
				grade[i]="Level 4,above agency-normalised standards.";
			}
			else if(percentage[i]>=70.0 && percentage[i]<80.0)
			{
				grade[i]="Level 3,at agency-normalised standards.";
			}
			else if(percentage[i]>=60.0 && percentage[i]<70.0)
			{
				grade[i]="Level 2,below,but approaching agency-normalised standards.";
			}
			else if(percentage[i]>=50.0 && percentage[i]<60.0)
			{
				grade[i]="Level 1,well below agency-normalised standards.";
			}
			else if(percentage[i]>=40.0 && percentage[i]<50.0)
			{
				grade[i]="Level 0,too below agency-normalised standards.";
			}
			else if(percentage[i]<40.0)
			{
				grade[i]="Remedial standards.";
			}
			else
			{
				System.out.println("Grade not possible.");
			}
		}
		
		System.out.println("Physics Total Marks: "+physicstotalmarks);
		System.out.println("Chemistry Total Marks: "+chemistrytotalmarks);
		System.out.println("Maths Total Marks: "+mathstotalmarks);
		
		System.out.println("\n\n");
		//Displaying Details
		for(int i=0;i<StudentNumber;i++)
		{
			System.out.println("\nStudent "+(i+1)+": ");
			System.out.println("Grade :"+grade[i]);
			System.out.println("Percentage: "+percentage[i]);
		}
		input.close();
	}
}