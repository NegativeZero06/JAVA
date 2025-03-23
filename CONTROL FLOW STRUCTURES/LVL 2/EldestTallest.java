import java.util.Scanner;

public class EldestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Getting ages and heights of three friends
        System.out.print("Age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Age of Anthony: ");
        int ageAnthony = input.nextInt();
        System.out.print("Height of Amar (cm): ");
        double heightAmar = input.nextDouble();
        System.out.print("Height of Akbar (cm): ");
        double heightAkbar = input.nextDouble();
        System.out.print("Height of Anthony (cm): ");
        double heightAnthony = input.nextDouble();

        // Finding the eldest
        String eldest = (ageAmar > ageAkbar && ageAmar > ageAnthony) ? "Amar" :
                        (ageAkbar > ageAnthony) ? "Akbar" : "Anthony";

        // Finding the tallest
        String tallest = (heightAmar > heightAkbar && heightAmar > heightAnthony) ? "Amar" :
                         (heightAkbar > heightAnthony) ? "Akbar" : "Anthony";

        // Displaying results
        System.out.println("\nTallest among Amar, Akbar, and Anthony is: " + tallest);
        System.out.println("Eldest among Amar, Akbar, and Anthony is: " + eldest);

        // Closing Scanner object
        input.close();
    }
}
