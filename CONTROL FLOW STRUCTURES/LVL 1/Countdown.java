import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Asking user for the starting countdown number
        System.out.print("Enter Number: ");
        int counter = input.nextInt();

        // Running a countdown using while loop
        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }

        // Printing launch message
        System.out.println("ROCKET LAUNCHHHHHHH!!!!!");

        // Closing Scanner to free memory
        input.close();
    }
}
