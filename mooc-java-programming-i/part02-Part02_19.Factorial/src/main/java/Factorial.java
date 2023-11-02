
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = scanner.nextInt();
        int product = 1;

        for (int i = 1; i <= number; i++) {
            product *= i;
        }

        System.out.println("Factorial: " + product);
    }
}
