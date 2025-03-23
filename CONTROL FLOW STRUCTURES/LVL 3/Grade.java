import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for marks in three subjects
        System.out.print("Enter Marks in Physics (out of 100): ");
        double physicsMarks = input.nextDouble();
        System.out.print("Enter Marks in Chemistry (out of 100): ");
        double chemistryMarks = input.nextDouble();
        System.out.print("Enter Marks in Maths (out of 100): ");
        double mathsMarks = input.nextDouble();

        // Calculating average marks
        double averageMarks = (physicsMarks + chemistryMarks + mathsMarks) / 3.0;
        System.out.println("Average Marks Obtained: " + averageMarks);

        // Assigning grades based on marks
        if (averageMarks >= 80 && averageMarks <= 100) {
            System.out.println("Grade: A (Above agency-normalized standards)");
        } else if (averageMarks >= 70) {
            System.out.println("Grade: B (At agency-normalized standards)");
        } else if (averageMarks >= 60) {
            System.out.println("Grade: C (Below but approaching agency-normalized standards)");
        } else if (averageMarks >= 50) {
            System.out.println("Grade: E (Too below agency-normalized standards)");
        } else {
            System.out.println("Grade: R (Remedial Standards)");
        }

        // Closing Scanner object
        input.close();
    }
}
