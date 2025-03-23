import java.util.Scanner;
public class Distance
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println(&quot;Enter distance in feet:&quot;);
double feet=sc.nextDouble();
double yard=3.0*feet;
double miles=yard/1760.0;
System.out.println(&quot;Distance in feet:&quot;+feet);
System.out.println(&quot;Distance in yards:&quot;+yard);
System.out.println(&quot;Distance in miles:&quot;+miles);
sc.close();

}
}