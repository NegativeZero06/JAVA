import java.util.Scanner;
public class PenDistribution
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int total_PENS=14;
int PEOPLE=3;
int PEN_PER_PERSON=0,REMAINING_PENS=0;
PEN_PER_PERSON=total_PENS/PEOPLE;
REMAINING_PENS=total_PENS%PEOPLE;
System.out.println(&quot;Pen per Student is:&quot;+PEN_PER_PERSON);
System.out.println(&quot;Remaining Non-Distributed Pens:&quot;+REMAINING_PENS);
sc.close();
}
}