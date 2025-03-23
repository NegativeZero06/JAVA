import java.util.Scanner;
class Square
{
public static void main(String[] args)
{
Scanner wow=new Scanner(System.in);
System.out.println(&quot;Enter Perimeter:&quot;);
double perimeter=wow.nextDouble();
double squareside=perimeter/4.0;
System.out.println(&quot;Perimeter of Square is:&quot;+perimeter);
System.out.println(&quot;Side of Square calculated from perimeter is:&quot;+squareside);
wow.close();
}
}