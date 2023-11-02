
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double value = Double.valueOf(scan.nextLine());

        if (value >= 5000 && value <= 25000) {
            System.out.println("Tax: " + get5000To25000Tax(value));
        } else if (value >= 25000 && value <= 55000) {
            System.out.println("Tax: " + get25000To55000Tax(value));
        } else if (value >= 55000 && value <= 200000) {
            System.out.println("Tax: " + get55000To200000Tax(value));
        } else if (value >= 200000 && value <= 1000000) {
            System.out.println("Tax: " + get200000To1000000ax(value));
        } else if (value > 1000000) {
            System.out.println("Tax: " + get1000000Tax(value));
        } else {
            System.out.println("No tax!");
        }
    }

    private static double get5000To25000Tax(double value) {
        return 100 + (value - 5000) * 0.08;
    }

    private static double get25000To55000Tax(double value) {
        return 1700 + (value - 25000) * 0.10;
    }

    private static double get55000To200000Tax(double value) {
        return 4700 + (value - 55000) * 0.12;
    }

    private static double get200000To1000000ax(double value) {
        return 22100 + (value - 200000) * 0.15;
    }

    private static double get1000000Tax(double value) {
        return 142100 + (value - 1000000) * 0.17;
    }
}
