import java.util.Scanner;
public class Handshakes
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print(&quot;Enter Number of Students:&quot;);
int students=sc.nextInt();
int handshakes=0;
if(students&gt;0)
{
if(students==1)
{
handshakes=1;
}
else
{

handshakes=students*(students-1)/2;
}
System.out.println(&quot;Number of Handshakes=&quot;+handshakes);
}
else
{
System.out.println(&quot;Handshakes cannot be calculated due to invalid number of
Students.&quot;);
}
sc.close();
}
}