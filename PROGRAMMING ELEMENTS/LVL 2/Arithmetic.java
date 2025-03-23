class Arithmetic
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.print(&quot;Enter Number 1:&quot;);
double number1=sc.nextDouble();
System.out.print(&quot;Enter Number 2:&quot;);
double number2=sc.nextDouble();
double quotient=1,remainder=0;
if(number2!=0)
{
quotient=number1/number2;
remainder=number1%number2;
System.out.println(&quot;Quotient:&quot;+quotient);
System.out.println(&quot;Remainder:&quot;+remainder);
}
else
{System.out.println(&quot;Cannot perform operations with 0.&quot;);}

sc.close();
}
}