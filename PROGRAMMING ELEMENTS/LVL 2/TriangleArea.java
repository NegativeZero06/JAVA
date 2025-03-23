import java.util.Scanner;
class TriangleArea
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.println(&quot;Enter Base and Height in cms:&quot;);
System.out.print(&quot;Enter Base:&quot;);
double base=sc.nextDouble();
System.out.print(&quot;Enter Height:&quot;);
double height=sc.nextDouble();
System.out.println(&quot;Converting Base and Height from cms to inches:&quot;);
double baseinches=base/2.54;
System.out.println(&quot;Base in inches:&quot;+baseinches);
double heightinches=height/2.54;
System.out.println(&quot;Height in inches:&quot;+heightinches);
double Area=0.5*base*height;
double Areainches=0.5*baseinches*heightinches;

System.out.println(&quot;Area of Triangle in cms:&quot;+Area);
System.out.println(&quot;Area of Triangle in inches:&quot;+Areainches);
sc.close();

}
}