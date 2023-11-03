
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String words = scanner.nextLine();

            if (words.isEmpty()) {
                return;
            }

            for (String word : words.split(" ")) {
                System.out.println(word);
            }
        }
    }
}
