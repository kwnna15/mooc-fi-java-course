
import java.util.stream.Stream;

public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        return Stream.of(number1, number2, number3)
                .reduce(number1, (n1, n2) -> Integer.max(n1, n2));
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
