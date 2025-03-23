import java.util.Scanner;
public class SimpleInterest
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print(&quot;Enter Principle Amount[P]:&quot;);
double principle=sc.nextDouble();
System.out.print(&quot;Enter Rate of Interest[R](in %):&quot;);
double rate=sc.nextDouble();
System.out.print(&quot;Enter Time Period[T](in yrs):&quot;);
double time=sc.nextDouble();
double simpleinterest=principle*rate*time/100;
double FinalAmount=principle+simpleinterest;
System.out.println(&quot;&quot;);
System.out.println(&quot;Simple Interest is:&quot;+simpleinterest);
System.out.print(&quot;Final Amount is:&quot;+FinalAmount);
sc.close();
}
}