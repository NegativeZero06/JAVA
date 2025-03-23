import java.util.Scanner;

class CentimetersToFeetAndInches {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Get height in centimeters

System.out.print(&quot;Enter Height in cms: &quot;);
double centimeters = sc.nextDouble();

// Convert centimeters to inches
double inches = centimeters / 2.54;

// Calculate the feet and remaining inches
double feet = inches / 12.0;
inches = inches % 12.0;

// Output the result
System.out.println(&quot;Your Height in cms: &quot; + centimeters);
System.out.println(&quot;Your Height in feet and inches: &quot; + (int) feet + &quot; ft. and &quot; + (int)
inches + &quot; inches&quot;);

sc.close();
}
}