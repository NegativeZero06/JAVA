import java.util.Scanner;

class IntOperation {
public static void main(String[] args) {
Scanner wow = new Scanner(System.in);

System.out.print(&quot;Enter a: &quot;);
int a = wow.nextInt();
System.out.print(&quot;Enter b: &quot;);
int b = wow.nextInt();
System.out.print(&quot;Enter c: &quot;);
int c = wow.nextInt();

// Declare the variables before using them
int operation1 = a + b * c;
int operation2 = a * b + c;
System.out.println(&quot;Values of a, b &amp; c are: &quot; + a + &quot;, &quot; + b + &quot; &amp; &quot; + c);
System.out.println(&quot;Operation 1: &quot; + operation1);
System.out.println(&quot;Operation 2: &quot; + operation2);

if (b != 0) {
int operation3 = c + a / b;
int operation4 = a % b + c;

System.out.println(&quot;Operation 3: &quot; + operation3);
System.out.println(&quot;Operation 4: &quot; + operation4);
} else {

System.out.println(&quot;Cannot proceed with operations 3 &amp; 4.&quot;);
}

wow.close();
}
}