import java.util.Scanner;
class swap
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print(&quot;Enter Number 1:&quot;);
double number1=input.nextDouble();
System.out.print(&quot;Enter Number 2:&quot;);
double number2=input.nextDouble();
double swapnumber=number1;
number1=number2;
number2=swapnumber;
System.out.println(&quot;After Swapping:&quot;);
System.out.println(&quot;New Number1:&quot;+number1);
System.out.print(&quot;New Number2:&quot;+number2);
input.close();

}
}