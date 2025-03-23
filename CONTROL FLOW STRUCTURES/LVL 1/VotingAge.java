import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Asking the user for age input
        System.out.print("Enter Age: ");
        int age = input.nextInt();

        // Checking if the age is 18 or above
        if (age >= 18) {
            System.out.println("The Person is eligible to Vote.");
        } else {
            System.out.println("The Person is ineligible to Vote.");
        }

        // Closing Scanner to free memory
        input.close();
    }
}
