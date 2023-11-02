
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        double squareRoot = Math.sqrt(firstNumber + secondNumber);
        System.out.println(squareRoot);
    }
}
