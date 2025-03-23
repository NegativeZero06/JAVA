import java.util.Scanner;
class Temperature
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print(&quot;Enter Temperature in Celsius:&quot;);
double celsius=sc.nextDouble();
double fahrenheitResult=32+1.8*celsius;
System.out.println(&quot;Equivalent Temperature in Fahrenheit:&quot;+fahrenheitResult);
sc.close();
}
}