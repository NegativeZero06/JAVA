import java.util.Scanner;//importing library for taking input from user
public class MarksAverage
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in); //Creating Scanner object
System.out.println(&quot;Enter Marks in Maths:&quot;);
double Marks_Maths=sc.nextDouble();
System.out.println(&quot;Enter Marks in Physics:&quot;);
double Marks_Physics=sc.nextDouble();
System.out.println(&quot;Enter Marks in Chemistry:&quot;);
double Marks_Chemistry=sc.nextDouble();

double Marks_Average=(Marks_Maths+Marks_Physics+Marks_Chemistry)/3;
System.out.println(&quot;Marks in Maths:&quot;+Marks_Maths);
System.out.println(&quot;Marks in Physics:&quot;+Marks_Physics);
System.out.println(&quot;Marks in Chemistry:&quot;+Marks_Chemistry);
System.out.println(&quot;Average Marks in PCM:&quot;+Marks_Average);
sc.close();//freeing the memory occupied by Scanner

}//end of main()
}//end of class