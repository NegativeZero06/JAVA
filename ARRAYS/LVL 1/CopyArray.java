import java.util.Scanner;

class CopyArray
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Rows: ");
		int rows=input.nextInt();
		
		System.out.print("Enter Columns: ");
		int columns=input.nextInt();
		
		//Creating 2D Array
		int[][] Matrix=new int[rows][columns];
		
		//Store values in the 2D ARRAY:
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print("Matrix ["+i+"]["+j+"] :");
				Matrix[i][j]=input.nextInt();
			}
		}
		
		//Size of 1D Array:
		int size=rows*columns;
		
		//Creating 1D ARRAY:
		int[] Array=new int[size];
		
		//INDEX VARIABLE FOR 1D ARRAY:
		int index=0;
		//Copying 2D Array into 1D Array:
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				Array[index]=Matrix[i][j];
				index++;
			}
		}
		
		//Displaying Arrays:
		System.out.println("");
		System.out.println("2D ARRAY:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println("Matrix ["+i+"]["+j+"] :"+Matrix[i][j]);
			}
		}
		
		System.out.println("");
		System.out.println("1D ARRAY:");
		for(int i=0;i<size;i++)
		{
			System.out.println("Array ["+i+"] :"+Array[i]);
		}
		input.close();
	}
}