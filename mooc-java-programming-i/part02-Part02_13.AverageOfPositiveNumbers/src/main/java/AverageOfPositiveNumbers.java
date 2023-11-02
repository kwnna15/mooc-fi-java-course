
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 0;
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                if (totalNumbers == 0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println(sum / (totalNumbers * 1.0));
                }
                return;
            } else if (number > 0) {
                totalNumbers += 1;
                sum += number;
            }
        }
    }
}
