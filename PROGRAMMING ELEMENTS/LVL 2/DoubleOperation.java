import java.util.Scanner;

class DoubleOperation {
public static void main(String[] args) {
Scanner wow = new Scanner(System.in);

System.out.print(&quot;Enter a: &quot;);
double a = wow.nextDouble();
System.out.print(&quot;Enter b: &quot;);
double b = wow.nextDouble();
System.out.print(&quot;Enter c: &quot;);
double c = wow.nextDouble();

// Declare the variables before using them
double operation1 = a + b * c;
double operation2 = a * b + c;
System.out.println(&quot;Values of a, b &amp; c are: &quot; + a + &quot;, &quot; + b + &quot; &amp; &quot; + c);
System.out.println(&quot;Operation 1: &quot; + operation1);
System.out.println(&quot;Operation 2: &quot; + operation2);

if (b != 0) {
double operation3 = c + a / b;
double operation4 = a % b + c;

System.out.println(&quot;Operation 3: &quot; + operation3);
System.out.println(&quot;Operation 4: &quot; + operation4);
} else {
System.out.println(&quot;Cannot proceed with operations 3 &amp; 4.&quot;);
}

wow.close();
}
}