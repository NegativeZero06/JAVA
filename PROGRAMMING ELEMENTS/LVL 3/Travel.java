import java.util.Scanner;
class Travel
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print(&quot;Enter Traveller&#39;s Name:&quot;);
String name=sc.nextLine();
System.out.print(&quot;Enter Source City:&quot;);
String fromcity=sc.nextLine();
System.out.print(&quot;Enter Destination City 1:&quot;);
String viacity=sc.nextLine();
System.out.print(&quot;Enter Destination City 2:&quot;);
String tocity=sc.nextLine();
System.out.print(&quot;Enter Distance between Source Destination and Desination City
1(in kms):&quot;);
double fromtovia=sc.nextDouble();
System.out.print(&quot;Enter Distance between Desination City 1 and Final Destination(in
kms):&quot;);
double viatofinal=sc.nextDouble();
System.out.print(&quot;Enter time taken from Source Destination to Desination City 1(in
HRS):&quot;);
double time1=sc.nextDouble();

System.out.print(&quot;Enter time taken from Desination City 1 to Final Destination(in
HRS):&quot;);
double time2=sc.nextDouble();
double totalDistance=fromtovia+viatofinal;
double totalTime=(time1+time2);
double averagespeed=0.5*((fromtovia/time1)+(viatofinal/time2));
System.out.println(&quot;Source City:&quot;+fromcity);
System.out.println(&quot;Via City:&quot;+viacity);
System.out.println(&quot;Destination City:&quot;+tocity);
System.out.println(&quot;Total Distance travelled by:&quot;+name +&quot; is:&quot;+totalDistance+&quot; kms.&quot;);
System.out.println(&quot;Total Time &quot;+name +&quot; was travelling is:&quot;+totalTime+&quot; hrs.&quot;);
System.out.println(&quot;Average speed by which &quot;+name +&quot; was travelling
is:&quot;+averagespeed+ &quot;kms/hr.&quot;);
sc.close();
}
}