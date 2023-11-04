
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        start(scanner, firstContainer, secondContainer);
    }
    
    public static void start(Scanner scanner, Container firstContainer, Container secondContainer) {
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] split = input.split(" ");
            String command = split[0];
            int amount = Integer.valueOf(split[1]);

            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            switch (command) {
                case "add":
                    firstContainer.add(amount);
                    break;
                case "move":
                    if ((firstContainer.contains() - amount) >= 0) {
                        firstContainer.remove(amount);
                        secondContainer.add(amount);
                    } else {
                        int moveBuffer = firstContainer.contains();
                        firstContainer.remove(firstContainer.contains());
                        secondContainer.add(firstContainer.contains() + moveBuffer);
                    }   break;
                case "remove":
                    secondContainer.remove(amount);
                    break;
                default:
                    break;
            }
        }

        System.out.println("First: " + firstContainer);
        System.out.println("Second: " + secondContainer);
    }
}
