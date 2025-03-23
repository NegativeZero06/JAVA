import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Asking user for month, day, and year
        System.out.print("Enter Month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter Day: ");
        int day = input.nextInt();
        System.out.print("Enter Year: ");
        int year = input.nextInt();

        boolean isLeapYear = false;
        int daysInMonth = 0;

        // Determining the number of days in the month
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                isLeapYear = true;
            }
            daysInMonth = isLeapYear ? 29 : 28;
        } else {
            daysInMonth = 31;
        }

        // Validating date
        if (month < 1 || month > 12 || day < 1 || day > daysInMonth || year < 1) {
            System.out.println("Invalid date input.");
            input.close();
            return;
        }

        // Applying Zeller's formula to determine day of the week
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        // Printing the corresponding day
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("The Entered Date is " + days[d0]);

        // Closing Scanner object
        input.close();
    }
}
