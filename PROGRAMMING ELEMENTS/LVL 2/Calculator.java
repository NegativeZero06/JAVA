import java.util.Scanner;
class Calculator
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println(&quot;Enter 2 numbers:&quot;);
System.out.print(&quot;Number 1:&quot;);
float number1=sc.nextFloat();
System.out.print(&quot;Number 2:&quot;);
float number2=sc.nextFloat();
System.out.println(&quot;Addition:&quot;);
float sum=number1+number2;
System.out.println(&quot;Summation of &quot;+number1+&quot; and &quot;+number2+&quot; is:&quot;+sum);
System.out.println(&quot;Subtraction:&quot;);
float difference=number1-number2;
System.out.println(&quot;Difference of &quot;+number1+&quot; and &quot;+number2+&quot; is:&quot;+difference);
System.out.println(&quot;Product:&quot;);
float product=number1*number2;
System.out.println(&quot;Product of &quot;+number1+&quot; and &quot;+number2+&quot; is:&quot;+product);
float quotient=1;
System.out.println(&quot;Division:&quot;);
if(number2!=0)

quotient=number1/number2;
System.out.println(&quot;Quotient of &quot;+number1+&quot; and &quot;+number2+&quot; is:&quot;+quotient);
sc.close();

}
}