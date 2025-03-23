import java.util.Scanner;

class StudentFeesUserInput {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Getting the student fees
System.out.print(&quot;Enter The Student Fees: &quot;);
double studentFees = sc.nextDouble();

// Getting the discount percentage
System.out.print(&quot;Discount Percentage University is providing: &quot;);
double discountPercent = sc.nextDouble();

// Calculating the discount fees and final fees
double discountFees = discountPercent * studentFees / 100;
double finalFees = studentFees - discountFees;

// Printing the final fees and discounted amount
System.out.println(&quot;Final Fees to be paid after Discount is: &quot; + finalFees + &quot; and the
Discounted Amount is: &quot; + discountFees);

sc.close();
}
}