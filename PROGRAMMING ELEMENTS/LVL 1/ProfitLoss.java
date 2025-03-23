import java.util.Scanner;

public class ProfitLoss
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int COST_PRICE=129;
int SELLING_PRICE=191;
int PROFIT=SELLING_PRICE-COST_PRICE;
double PROFIT_PERCENTAGE=(PROFIT*100)/COST_PRICE;
System.out.println(&quot;Cost Price is:&quot;+COST_PRICE);
System.out.println(&quot;Selling Price is:&quot;+SELLING_PRICE);
System.out.println(&quot;Profit is:&quot;+PROFIT);
System.out.println(&quot;Profit Percentage is:&quot;+PROFIT_PERCENTAGE);
sc.close();
}
}