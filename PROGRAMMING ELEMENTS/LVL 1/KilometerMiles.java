import java.util.Scanner;
public class KilometerMiles
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print(&quot;Enter no. of Kilometers:&quot;);
double KILOMETERS=sc.nextDouble();
double MILES=KILOMETERS/1.6;//CORRECTION 1MILE=1.6 KMS
System.out.print(&quot;Equivalent Distance in Miles:&quot;+MILES);
sc.close();
}
}