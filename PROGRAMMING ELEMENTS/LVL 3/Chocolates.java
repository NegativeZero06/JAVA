import java.util.Scanner;
public class Chocolates
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print(&quot;How many Chocolates do we have:&quot;);
int Chocolates=sc.nextInt();
System.out.print(&quot;How many Children are there:&quot;);
int Children=sc.nextInt();
int chocolateperchild=(int)(Chocolates/Children);
int chocolateremaining=Chocolates%Children;
System.out.print(&quot;Number of Chocolates each child gets is:&quot;+chocolateperchild);
System.out.println(&quot;&quot;);
System.out.print(&quot;Number of Remaining Chocolates:&quot;+chocolateremaining);
sc.close();
}

}