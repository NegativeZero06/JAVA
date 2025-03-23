import java.util.Scanner;
public class TemperaturetoCelsius
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print(&quot;Enter temperature in Fahrenheit:&quot;);
double fahrenheit=sc.nextDouble();
double celsiusResult=(fahrenheit-32)*5/9;
System.out.println(&quot;Equivalent Temperature in Celsius:&quot;+celsiusResult);
sc.close();
}
}