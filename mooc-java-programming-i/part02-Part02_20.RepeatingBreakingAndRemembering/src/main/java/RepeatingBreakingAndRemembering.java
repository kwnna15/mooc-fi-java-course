
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int totalNumbers = 0;
        int totalEvenNumbers = 0;
        int totalOddNumbers = 0;

        System.out.println("Give numbers:");

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else if (number % 2 == 0) {
                totalEvenNumbers++;
            } else {
                totalOddNumbers++;
            }

            sum += number;
            totalNumbers++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNumbers);
        System.out.println("Average: " + (sum / (totalNumbers * 1.0)));
        System.out.println("Even: " + totalEvenNumbers);
        System.out.println("Odd: " + totalOddNumbers);
    }
}
