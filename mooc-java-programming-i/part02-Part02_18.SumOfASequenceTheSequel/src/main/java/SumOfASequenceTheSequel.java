
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Last number? ");
        int lastNumber = scanner.nextInt();

        int sum = 0;

        while (firstNumber <= lastNumber) {
            sum += firstNumber;
            firstNumber++;
        }

        System.out.println("The sum is: " + sum);
    }
}
