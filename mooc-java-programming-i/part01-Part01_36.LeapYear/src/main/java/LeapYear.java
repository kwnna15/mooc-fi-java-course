
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());

        if (isLeapYear(year)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || isDivisableBy100And400(year));
    }

    private static boolean isDivisableBy100And400(int year) {
        return (year % 100 == 0) && (year % 400 == 0);
    }
}
