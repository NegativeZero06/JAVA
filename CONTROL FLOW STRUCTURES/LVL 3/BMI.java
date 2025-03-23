import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for weight in kilograms
        System.out.print("Enter the weight of the person (in kg): ");
        double weight = input.nextDouble();

        // Asking user for height in centimeters
        System.out.print("Enter the height of the person (in cm): ");
        double height = input.nextDouble();

        // Converting height from cm to meters
        double heightInMeters = height / 100.0;

        // Calculating BMI using the formula: BMI = weight / (height^2)
        double bmi = weight / Math.pow(heightInMeters, 2);

        // Displaying BMI result
        System.out.println("BMI: " + bmi);

        // Determining BMI category
        if (bmi >= 0 && bmi <= 18.4) {
            System.out.println("Status: UNDERWEIGHT");
        } else if (bmi > 18.4 && bmi <= 24.9) {
            System.out.println("Status: NORMAL");
        } else if (bmi > 24.9 && bmi <= 39.9) {
            System.out.println("Status: OVERWEIGHT");
        } else if (bmi > 39.9 && bmi <= 40.0) {
            System.out.println("Status: OBESE");
        } else {
            System.out.println("INVALID BMI.");
        }

        // Closing Scanner object
        input.close();
    }
}
