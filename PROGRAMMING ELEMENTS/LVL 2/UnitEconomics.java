public class UnitEconomics
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print(&quot;Enter UnitPrice:&quot;);
double unitprice=sc.nextDouble();
System.out.print(&quot;Enter Quantity:&quot;);
int quantity=sc.nextInt();
double totalprice=unitprice*quantity;
System.out.println(&quot;The total purchase price is:&quot;+totalprice+&quot; INR.&quot;);
System.out.println(&quot;Unit Price:&quot;+unitprice);
System.out.println(&quot;Quantity:&quot;+quantity);
sc.close();

}
}