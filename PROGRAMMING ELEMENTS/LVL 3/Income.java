import java.util.Scanner;
public class Income
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter salary:&quot;);
double salary=input.nextDouble();
System.out.print(&quot;Enter Bonus:&quot;);
double bonus=input.nextDouble();
double income=salary+bonus;
System.out.println(&quot;Final INCOME calculated after taking salary and bonus into
account is:&quot;+income);
input.close();
}
}