
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String nameOfTheOldest = "";
        while (true) {
            String string = scanner.nextLine();

            if (string.isEmpty()) {
                break;
            }

            String[] split = string.split(",");
            int age = Integer.parseInt(split[1].trim());
            if (age > oldestAge) {
                oldestAge = age;
                nameOfTheOldest = split[0].trim();
            }
        }

        System.out.println("Name of the oldest: " + nameOfTheOldest);
    }
}
