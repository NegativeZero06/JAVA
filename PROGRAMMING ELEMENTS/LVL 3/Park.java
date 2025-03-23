import java.util.Scanner;
public class Park
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print(&quot;Enter Side 1(in mtrs):&quot;);
double side1=sc.nextDouble();
System.out.print(&quot;Enter Side 2(in mtrs):&quot;);
double side2=sc.nextDouble();
System.out.print(&quot;Enter Side 3(in mtrs):&quot;);
double side3=sc.nextDouble();
double target=5000.0;
double perimeter=side1+side2+side3;

int rounds=(int)(target/perimeter);
if(target%perimeter!=0)
rounds++;
System.out.println(&quot;Perimeter of the Park is:&quot;+perimeter);
System.out.println(&quot;As the perimeter of the Park is &quot;+perimeter+&quot; metres,the athelete
has to run &quot;+rounds+&quot; rounds to complete his target run of &quot;+target);
sc.close();
}
}