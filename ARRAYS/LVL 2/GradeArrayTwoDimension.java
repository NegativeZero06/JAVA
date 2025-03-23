import java.util.Scanner;

class GradeArrayTwoDimension
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Number of Students in the class:");
		int StudentNumber=input.nextInt();
		
		//Creating 2D Array of Marks
		double[][] Marks=new double[StudentNumber][3];
		
		//Taking Total Marks of Each Subject
		System.out.print("Total Marks in Physics: ");
		double physicstotalmarks=input.nextDouble();
		System.out.print("Total Marks in Chemistry: ");
		double chemistrytotalmarks=input.nextDouble();
		System.out.print("Total Marks in Maths: ");
		double mathstotalmarks=input.nextDouble();
		
		//Creating Grade Array
		String[] grade=new String[StudentNumber];
		
		System.out.println("Subject 1:Physics");
		System.out.println("Subject 2:Chemistry");
		System.out.println("Subject 3:Maths");
		//Storing Values in the Marks Array
		for(int i=0;i<StudentNumber;i++)//Outer Loop Represents the Students
		{
			System.out.print("\n\nStudent "+(i+1)+":");
			for(int j=0;j<3;j++)//inner loop represents the Subjects
			{
				System.out.print("\nSubject "+(i+1)+":");
				if(j==0)
				{
					System.out.print("Enter Physics Marks:");
					Marks[i][j]=input.nextDouble();
				}
				else if(j==1)
				{
					System.out.print("Enter Chemistry Marks:");
					Marks[i][j]=input.nextDouble();
				}
				else
				{
					System.out.print("Enter Maths Marks:");
					Marks[i][j]=input.nextDouble();
				}
			}
		}
		
		
		//Creating Percentage Array
		double[] percentage=new double[StudentNumber];
		
		
		for(int i=0;i<StudentNumber;i++)
		{
			percentage[i]=(Marks[i][0]+Marks[i][1]+Marks[i][2])/(physicstotalmarks+chemistrytotalmarks+mathstotalmarks)*100;
			
			if(Marks[i][0]<0 || Marks[i][0]>physicstotalmarks || Marks[i][1]<0 || Marks[i][1]>chemistrytotalmarks || Marks[i][2]<0 || Marks[i][2]>mathstotalmarks)
			{
				System.out.println("Invalid Marks Entered or the Marks Entered exceeds the Total Marks of the Subject.");
				System.out.println("Enter Values again.");
				i--;
				continue;
			}
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
			
			System.out.println("\nPhysics Marks:"+Marks[i][0]);
			System.out.println("\nChemistry Marks:"+Marks[i][1]);
			System.out.println("\nMaths Marks:"+Marks[i][2]);
			
			System.out.println("\nGrade :"+grade[i]);
			System.out.println("Percentage: "+percentage[i]);
		}
		input.close();
	}
}