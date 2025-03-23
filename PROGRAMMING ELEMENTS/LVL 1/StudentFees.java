import java.util.Scanner;
class StudentFees
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int fees=125000;
int discountfees=10;
int discount=discountfees*fees/100;
int final_fees=fees-discount;
System.out.println(&quot;Final Fees to be paid after Discount is:&quot;+final_fees);
sc.close();
}
}