
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                return;
            }

            for (String word : string.split(" ")) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
