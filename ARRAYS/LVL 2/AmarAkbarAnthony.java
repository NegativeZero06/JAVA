import java.util.Scanner;

class AmarAkbarAnthony
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		//Storing Ages and Heights in arrays:
		//Index:
		//0=Amar
		//1=Akbar
		//2=Anthony
		
		
		int[] ages=new int[3];
		double[] heights=new double[3];
		
		//Taking Ages and storing it in Array:
		for(int i=0;i<3;i++)
		{
			if(i==0)
			{
				System.out.print("Enter Age of Amar: ");
				ages[i]=input.nextInt();
			}
			if(i==1)
			{
				System.out.print("Enter Age of Akbar: ");
				ages[i]=input.nextInt();
			}
			if(i==2)
			{
				System.out.print("Enter Ages of Anthony: ");
				ages[i]=input.nextInt();
			}
		}
		
		//Taking Heights and storing it in Array:
		for(int i=0;i<3;i++)
		{
			if(i==0)
			{
				System.out.print("Enter Height of Amar: ");
				heights[i]=input.nextDouble();
			}
			if(i==1)
			{
				System.out.print("Enter Height of Akbar: ");
				heights[i]=input.nextDouble();
			}
			if(i==2)
			{
				System.out.print("Enter Height of Anthony: ");
				heights[i]=input.nextDouble();
			}
		}
		
		//Finding youngest and tallest of them:
		int youngest=ages[0];
		double tallest=heights[0];
		for(int i=1;i<3;i++)
		{
			if(ages[i]<youngest)
			{
				youngest=ages[i];
			}
			if(heights[i]>tallest)
			{
				tallest=heights[i];
			}
		}
		
		//Printing Youngest
		if(youngest==ages[0])
		{
			System.out.println("Youngest is Amar.");
		}
		if(youngest==ages[1])
		{
			System.out.println("Youngest is Akbar.");
		}
		if(youngest==ages[2])
		{
			System.out.println("Youngest is Anthony.");
		}
		
		//Printing Tallest
		if(tallest==heights[0])
		{
			System.out.println("Tallest is Amar.");
		}
		if(tallest==heights[1])
		{
			System.out.println("Tallest is Akbar.");
		}
		if(tallest==heights[2])
		{
			System.out.println("Tallest is Anthony.");
		}
	}
}