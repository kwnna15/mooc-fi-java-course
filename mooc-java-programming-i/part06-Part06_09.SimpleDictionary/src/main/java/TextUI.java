
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kwnna
 */
public class TextUI {

    private final Scanner scanner;
    private final SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            switch (command) {
                case "end":
                    System.out.println("Bye bye!");
                    break OUTER;
                case "add":
                    System.out.println("Word:");
                    String word = scanner.nextLine();
                    System.out.println("Translation:");
                    String translation = scanner.nextLine();
                    simpleDictionary.add(word, translation);
                    break;
                case "search":
                    System.out.println("To be translated:");
                    String translated = scanner.nextLine();
                    String returnTranslation = simpleDictionary.translate(translated);
                    if (returnTranslation == null) {
                        System.out.println("Word " + translated + " was not found");
                    } else {
                        System.out.println(returnTranslation);
                    }   break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
