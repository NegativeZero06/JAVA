import java.util.Scanner;

public class CountdownForLoop {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Asking user for the starting countdown number
        System.out.print("Enter Number: ");
        int counter = input.nextInt();

        // Running a countdown using for loop
        for (int i = counter; i > 0; i--) {
            System.out.println(i);
        }

        // Printing launch message
        System.out.println("ROCKET LAUNCHHHHHHH!!!!!");

        // Closing Scanner to free memory
        input.close();
    }
}
